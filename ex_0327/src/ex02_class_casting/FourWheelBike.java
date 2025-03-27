package ex02_class_casting;

public class FourWheelBike extends Bike {

	public FourWheelBike(String riderName) {
		super(riderName);
	}
	
	@Override
	public void info() {
		super.info();
	}
	public void addWheel() {
		if(wheel==2) {
			wheel=4;
			System.out.println(riderName+"의 자전거에 보조바퀴 부착");
		}else {
			System.out.println(riderName+"의 자전거에 이미 보조바퀴가 있읍니다.");
		}
	}
	
}

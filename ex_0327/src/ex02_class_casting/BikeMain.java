package ex02_class_casting;

public class BikeMain {

	public static void main(String[] args) {
		Bike b = new FourWheelBike("길동");
		b.info();
		b.ride();
		//b.addWheel(); 부모타입은 접근 불가
		
		//자식타입으로 다시 변환해줌으로써
		//부모 타입에서 사용하지 못했던 자식의 맴버들을 다시 사용할 수 있게 됨
		FourWheelBike fwb = (FourWheelBike)b;
		fwb.addWheel();
		fwb.info();
		fwb.ride();
		
		Bike b2= new Bike("길동2");
		FourWheelBike fbw2 = (FourWheelBike)b2;
	}
	
}

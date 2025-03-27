package exam1;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HybridWaterCar hwc = new HybridWaterCar(50,20,70);
		hwc.showCurrentGauge();
		HybridCar hc = new HybridCar(60,20);
		hc.showCurrentGauge();
		Car c = new Car(55);
		c.showCurrentGauge();
	}
}

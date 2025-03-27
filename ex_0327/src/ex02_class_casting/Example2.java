package ex02_class_casting;

class Car{};
class Bus extends Car{};
class SchoolBus extends Bus{};

class OpenCar extends Car{};
class SportCar extends OpenCar{};

public class Example2 {
	public static void main(String[] args) {
		//1차 상속이 아니더라도 자동 타입 변환 가능
		Car c1 = new SchoolBus();
		Bus b1 = new Bus();
		Bus b2 = new SchoolBus();
		
		Car c2 = new OpenCar();
		OpenCar oc = new SportCar();
		
		//버스와 오픈카, 스포츠카는 상속이 아니라 타입 변환 불가능
		//Bus b3 = new OpenCar(); 
		//Bus b4 = new SportCar();
		
	}
}

package ex05_enum;
//열거형은 추상메서드를 가져도 추상클래스가 되는건 아님
//enum자체는 추상메서드를 정의 할 수 있고
//상수들이 그 메서들을 구현해야한다.
public enum Transportation {
	BUS(100) {
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return distance*fare;
		}
	},TRAIN(150) {
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return distance*fare;
		}
	},SHIP(200) {
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return distance*fare;
		}
	},AIRPLAIN(250) {
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return distance*fare;
		}
	};
	
	int fare;
	
	
	private Transportation(int fare) {
		this.fare = fare;
	}
	
	//추상메서드
	//직접 구현해야한다며 오류가 남
	abstract int totalFare(int distance);
	
}

package ex05_enum;

public enum Operation {
	//추상메서드 apply(int x, int y)를 가짐
	//plus, minus, multi, div 상수를 가짐
	//main 메서드를 모든 연산을 수행하여 출력하기
	PLUS {
		@Override
		int apply(int x,int y) {
			// TODO Auto-generated method stub
			return x+y;
		}
	},MINUS {
		@Override
		int apply(int x,int y) {
			// TODO Auto-generated method stub
			return x-y;
		}
	},MULTI {
		@Override
		int apply(int x,int y) {
			// TODO Auto-generated method stub
			return x*y;
		}
	},DIV {
		@Override
		int apply(int x,int y) {
			// TODO Auto-generated method stub
			return x/y;
		}
	};
	
	
	
	abstract int apply(int x,int y);
}

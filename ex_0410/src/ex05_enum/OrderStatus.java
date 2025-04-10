package ex05_enum;
//ORDERED,SHIPPED,DELIVERED 상수 정의
//온라인 쇼핑몰의 주문상태를 관리하는 시스템을 만들고 싶다.
//상태에 따라 다음 상태로 바뀌면 된다.
//각 상태에서 next()메서드를 호출하면, 다음 상태로 전환되도록 구현한다.
public enum OrderStatus {
	ORDERED {
		@Override
		OrderStatus next() {
			// TODO Auto-generated method stub
			return SHIPPED;
		}
	},SHIPPED {
		@Override
		OrderStatus next() {
			// TODO Auto-generated method stub
			return DELIVERED;
		}
	},DELIVERED {
		@Override
		OrderStatus next() throws Exception {
			throw new Exception("더 이상 상태 전환 불가");
		}
	};
	//ordered -> shipped -> delivered -> "완료 상태, 전환불가"
	
	
		
		abstract OrderStatus next() throws Exception;
	
	
}

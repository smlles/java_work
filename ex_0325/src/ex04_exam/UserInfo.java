package ex04_exam;

public class UserInfo {
	/*UserInfo클래스를 만든 뒤, 금액을 저장할 money라는 변수를 만든다.

	deposit(int money)메서드를 만들어 유저가 돈을 입금했을 경우를 처리.

	withdraw(int money)메서드를 만들어 유저가 돈을 출금했을 경우를 처리.
	단 이 메서드에는 출금하고자 하는 돈 보다 잔액이 적을경우 잔액이 부족하다는 메시지가 출력되도록 한다.

	showMoney()메서드를 만들어 현재 잔액을 반환하도록 한다.*/
	int money ;
	
	public int deposit(int i){
		money+=i;
		System.out.println("잔액 : "+money);
		return money;
	}
	
	public int withdraw(int i ) {
		money-=i;
		if(money<0) {
			System.out.println("잔액 부족");
			money+=i;
		}
		System.out.println("잔액 : "+money);
		return money;
	}
	
	public void showMoney() {
		System.out.println("현재 잔액은"+money+"원 입니다.");
	}
}

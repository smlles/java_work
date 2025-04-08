package ex02_syncronized;

public class SyncronizedEx implements Runnable{
	
	private long money = 10000;
	
	//클래스에 대한 정보를 담을 수 있다.
	
	
	@Override
	public void run() { //SynchronizedEx.class : Synchronized 클래스 자체
		//SynchronizedEx클래스에 락을 걸겠다.
		//하나의 스레드가 이미 점유중이라면, 다른 스레드는 사용 할 수 없다.
		//synchronized블록
		//필요한 부분만 선택적으로 동기화 할 수 있어 성능최적화 가능
		synchronized (SyncronizedEx.class) {
			for(int i = 0 ; i<10;i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				if(getMoney()<=0) {
					break;
				}outMoney(1000); //메서드 호출
			}	
		}
	}
	public long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
	//출금
	public void outMoney(long money) {
		String threadName = Thread.currentThread().getName();
		//잔고가 0보다 크면
		if(getMoney() > 0) {
			this.money -= money;
			System.out.println(threadName + " - 잔액 : "+ getMoney() + "원");
		} else {
			System.out.println("잔액부족");
		}
	}
}

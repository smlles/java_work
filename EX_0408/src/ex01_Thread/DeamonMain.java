package ex01_Thread;

public class DeamonMain {

	//데몬스레드 : 메인 작업을 돕는 역할을 하는 스레드
	//메인 작업하는 스레드 종료시 같이 종료
	public static void main(String[] args) {
		// 데몬스레드 생성
		Thread deamonThread = new Thread(new MyDeamonRunnable());
		
		//데몬 스레드 설정
		deamonThread.setDaemon(true);
		
		deamonThread.start();
		for(int i = 1;i<=15;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}
		System.out.println("메인 스레드 종료");
	}
	

}
class MyDeamonRunnable implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i = 1 ; i <=15;i++) {
				System.out.println("저장");
				Thread.sleep(3000); //3초주기
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
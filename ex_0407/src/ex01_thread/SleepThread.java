package ex01_thread;

public class SleepThread extends Thread {
@Override
	public void run() {
	System.out.println("카운트다운 5초 시작");
		for(int i =5;i>=0;i--) {
			
			try {
				Thread.sleep(1000);
				System.out.println(i+"!");
				//=InterruptedException
				//스레듣가 해야 할 일을 처리하지 못할 때
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	
	}
}

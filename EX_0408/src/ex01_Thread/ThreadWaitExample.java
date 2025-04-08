package ex01_Thread;

import java.security.cert.TrustAnchor;

class AddStackThread extends Thread{
	private Storage storage;
	public AddStackThread(Storage storage) {
		this.storage = storage;
	}
	@Override
	public void run() {
		
		try {
			while(true){
				Thread.sleep(1000);
				if(this.storage.getStackCount()==0) {
					System.out.println("짐 10개 추가");
					this.storage.addStack(10); //짐 10개 추가
				}
			}
		} catch (Exception e) {
			
		}
	}
}//AddStackThread

class PopStackThread extends Thread{
	private Storage storage;
	
	public PopStackThread(Storage storage) {
		this.storage=storage;
	}
	
	@Override
	public void run() {
		//짐 5개씩 나르기
		try {
			while(true) {
				Thread.sleep(1000);
				System.out.println("가 짐 어서 5번 하기");
				this.storage.popStack(5);
			}
		} catch (Exception e) {

		}
	}
}

public class ThreadWaitExample {
	public static void main(String[] args) {
		Storage s = new Storage();
		AddStackThread add  = new AddStackThread(s);
		PopStackThread pop = new PopStackThread(s);
		
		add.start();
		pop.start();
	}
}

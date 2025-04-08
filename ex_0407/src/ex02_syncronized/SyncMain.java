package ex02_syncronized;

public class SyncMain {

	public static void main(String[] args) {
		
		//Runaable 인터페이스로 구현한 스레드는 Start 메서드가 없음
		//Thread 객체를 만들어서 생성자에 전달하고 Start메서드로 실행
		SyncronizedEx atm = new SyncronizedEx();
		Thread mom = new Thread(atm,"엄마");
		
		Thread son = new Thread(atm,"아들");
		son.start();
		mom.start();
		

	}
}

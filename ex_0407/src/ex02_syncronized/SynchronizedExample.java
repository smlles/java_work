package ex02_syncronized;

class Counter{
	private int count = 0 ;
	
	
	//이 메서드에 2개의 스레드가 동시에 접근 할 때
	//에러가 발생 할 수 있다.
	
	// 두개의 메서드가 동시에 접근할 때, 동ㅇ기화 메서드로 만듬
	public synchronized void increment() {
		count++; //동기화 안했을 때
		System.out.println(Thread.currentThread().getName()+"- count : " +count);
		//
	}
	public int getCount() {
		return count;
	}
}

public class SynchronizedExample {
	public static void main(String[] args) throws InterruptedException{
		Counter counter = new Counter();
		Thread t1 = new Thread(()->{
			for(int i = 0 ; i <99 ; i++) {
				counter.increment();
			}
		},"Thread-1");
		//
		Thread t2 = new Thread(()->{
			for(int i = 0 ; i <99 ; i++) {
				counter.increment();
			}
		},"Thread-2");
		
		
		t1.start();
		t2.start();
		//t1과 t2가 끝날때 까지 main은 대기
		t1.join();
		t2.join();
		
		System.out.println("최종 count : "+ counter.getCount());
		
		
	}
}

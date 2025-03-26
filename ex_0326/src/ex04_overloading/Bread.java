package ex04_overloading;

public class Bread {
	 /*각 다른 기능을 하는 makeBread() 메서드 3개를 만들고
	  * 메인클래스에서 각 메서드를 호출했을 때 결과를 보고 로직을 구현하기
	  * 
	  * 빵을 만들었습니다 <---- method 1 
	  * 
	  * 빵을 만들었습니다 <-----method 2 
	  * 빵을 만들었습니다
	  * 요청한 n개의 빵을 만들었습니다.
	  * 
	  * 크림빵을 만들었습니다 <---- method 3
	  * 크림빵을 만들었습니다.
	  * 요쳥하신 n개의 빵을 만들었습니다.
	  * */
	
	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
	}
	
	public void makeBread(int x) {
		for (int i = 0; i<x ; i++) {
		System.out.println("빵을 만들었습니다.");
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다.\n",x);
	}
	
	public void makeBread(int x, String s) {
		for (int i = 0; i<x ; i++) {
			System.out.printf("%s빵을 만들었습니다.\n",s);
			}
			System.out.printf("요청하신 %d개의 빵을 만들었습니다.\n",x);
		}
	
}

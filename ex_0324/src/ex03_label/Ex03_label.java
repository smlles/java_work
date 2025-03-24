package ex03_label;

public class Ex03_label {

	public static void main(String[] args) {
		//label
		//기타 제어문을 포함하는 반복문에 대해서만 영향이 있다.
		//라벨링을 하면, 내가 원하는 반복문을 조작 할 수 있다.
		
		//라벨은 쌍으로 존재해야 한다.
		out:for (int i = 1; i<=3 ; i++) {
			for (int j= 1; j<10; j++) {
				if(j%2==0) {
					continue out;
				}System.out.print(j + " ");
				
			}System.out.println();
		}System.out.println();
		
		out:for (int i = 1; i<=3 ; i++) {
			for (int j= 1; j<10; j++) {
				if(j%2==0) {
					break out;
				}System.out.print(j + " ");
				
			}System.out.println();
		}System.out.println();
	}

}

package ex04_array;

public class Ex01_array {

	public static void main(String[] args) {
		//배열의 선언
		int[] arr=null;
		
		System.out.println(arr);
		
		//크기가 4인 정수형 배열 생성
		int[] iarr = new int[4];//데이터가 들어있지는 않음
		
		System.out.println(System.identityHashCode(iarr));
		System.out.println(System.identityHashCode(iarr[0]));
		//배열명에는 배열까지 접근 할 수 있는 주소값이 들어있다.
		
		//값을 직접 변수에 저장하는 것이 아니라, 주소값이 지정되어 
		//해당 주소를 통해 실제 주소에 접근하는 참조변수이다
		
		//배열의 특징
		//배열 선언시 크기를 지정한다.
		//배열 선언 후, 공간의 크기를 늘이거나 줄일 수 없다.
		//지정된 자료형의 값만 저장 할 수 있다.
		
		//배열에 각 방에 들어있는 대티터를 사용하는 법
		//배열명[index] -> 변수처럼 사용 가능
		//대입 가능
		
		iarr[0]=100;
		iarr[1]=200;
		iarr[2]=300;
		iarr[3]=400;
		
		//배열 출력
		System.out.println(iarr[0]);
		System.out.println(iarr[1]);
		System.out.println(iarr[2]);
		System.out.println(iarr[3]);
		System.out.println(iarr[2]*iarr[3]);
		
		//배열의 길이
		//배열은 내부적으로 length라는 변수를 지니는데
		//해당 변수는 배열의 길이를 가진다
		//배열의 길이를 알고싶으면 배열명.length
		//이 변수의 값은 생성될 때 지정되며, 변경 할 수 없다.
		System.out.println(iarr.length);
		
		for(int i = 0; i<iarr.length; i++) {
			System.out.println(iarr[i]);
		}
		
		//배열의 초기값
		//배열은 생성과동시에 데이터 자료형별로 기본값이 주어진다.
		//정수 -> 0
		//실수 -> 0.0
		//문자형-> ''
		//객체형 -> null
		int[] intArray= new int[5];
		String [] strArray = new String[5];
		int[] varArray = {1,2,3,4,5};
		
		//intArray의 값
		System.out.println("intArray[0] : "+ intArray[0]);
		System.out.println("intArray[1] : "+ intArray[1]);
		//strArray의 값
		System.out.println("strArray[0] : "+ strArray[0]);
		System.out.println("strArray[1] : "+ strArray[1]);
		//varArray의 값
		System.out.println("varArray[0] : "+ varArray[0]);
		System.out.println("varArray[1] : "+ varArray[1]);
		
	}

}

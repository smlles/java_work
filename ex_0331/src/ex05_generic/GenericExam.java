package ex05_generic;
//Gen 클래스를 만들어, 제네릭 타입 T를 가지는
//printArr 메서드를 생성한다.
//printArr 메서드 내부에서 배열을 순차적으로 출력하는 코드 작성
//main에서 Integer, Double Character 배열을 각각 만들고
//Gen클래스의 printArr 메서드를 각각 호출하여 배열의 내용을 출력하기
//결과
//1 2 3 4 5
//1.1 2.2 3.3 4.4 5.5
//A B C D E
public class GenericExam {
	public static <T> void main(String[] args) {
		
		DataList<Integer> printArr = new DataList<Integer>();
		DataList<Double> printArr2 = new DataList<Double>();
		DataList<String> printArr3 = new DataList<String>();
		
		Integer[] arr1 = {1,2,3,4,5};
		Double[] arr2 = {1.1,2.2,3.3,4.4,5.5};
		Character[] arr3 = {'A','B','C','D','E'};
		/*
		Gen<T> gen = new Gen<>();
		gen.printArr(arr1);*/
		/*
		Gen<Integer> gen1 = new Gen<Integer>();
		Gen<Double> gen2 = new Gen();
		Gen<Character> gen3 = new Gen<>();*/
		Gen g1 = new Gen();
		//컴파일러가 전달된 인자의 타입을 보고, 추론함
		g1.printArr(arr1);
		g1.printArr(arr2);
		g1.printArr(arr3);
		
		
		
		
	}
}

package Exam;

import java.util.Arrays;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Exam ex = new Exam();
		FindWord fw = new FindWord();
		//4번
		int[] i_arr = {1,1,1,2,2,2,2,3,3,3,4,4,4,4,4,5,5,5,5,5};
		System.out.println(Arrays.toString(ex.removeDuplicates(i_arr)));
		
		//5번
		int[] f_arr = {3,2,5,7,9,4,2,1,6,8};
		System.out.println( ex.findMax(f_arr));
		//6번
		Student st = new Student("신창섭",30,999);
		st.info();
		
		//7
		String text = "apple banana apple orange apple banana orange orange apple";
		Map<String,Integer> map = fw.wordFrequency(text);
		for(Map.Entry<String, Integer> e : map.entrySet()) { 
			System.out.println(e.getKey()+" : "+e.getValue());
			
		}
		
		//9번
		System.out.println( ex.sumOfDigits(12345));
		
		//10
		Box<Integer> b1 = new Box<Integer>();
		b1.setValue(10);
		
		Box<String> b2 = new Box<String>();
		b2.setValue("Hello,Generics");
		
		Box<Double> b3 = new Box<Double>();
		b3.setValue(3.14);
		
		System.out.println("Integer 박스의 값 : "+b1.getValue());
		System.out.println("String 박스의 값 : "+b2.getValue());
		System.out.println("Double 박스의 값 : "+b3.getValue());
		
//		for(;a<10;) {
//			
//			sum=sum+(a%10);
//			a=a/10;
//		}
//		System.out.println( sum);
//	}
		
		
		
		
		//새로운 배열을 만들어
		//일단 값을 넣어
		//다음 값을 넣는데 만약에 이미 그 값이 있으면 하지마
		
		
	
	}
	
}
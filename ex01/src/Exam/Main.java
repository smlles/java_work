package Exam;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Exam ex = new Exam();
		//4번
		int[] i_arr = {1,1,1,2,2,2,2,3,3,3,4,4,4,4,4,5,5,5,5,5};
		System.out.println(Arrays.toString(ex.removeDuplicates(i_arr)));
		
		//5번
		int[] f_arr = {3,2,5,7,9,4,2,1,6,8};
		System.out.println( ex.findMax(f_arr));
		//6번
		Student st = new Student("신창섭",30,999);
		
		
		
		//9번
		System.out.println( ex.sumOfDigits(12345));
		
		
		
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
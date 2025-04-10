package ex02_BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02_BufferedReader {
//BufferedReader를 이용해 입력받는다.
	//장점 = Scanner보다는 속도가 빠르다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = 
				new BufferedReader(
						new InputStreamReader(System.in));
		
		//키보드로 읽는다.
		try {
			System.out.print("문자열 입력 : ");
			String str = reader.readLine();
			
			//정수 입력
			System.out.print("정수 입력 : ");
			int n = Integer.parseInt(reader.readLine());
			
			System.out.println("문자열 : "+str);
			System.out.println("정수 : "+n);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//원칙대로라면 close를 해야하는데
		//System.in은 닫아서 좋을 게 없다.
		//정확하게 static은 닫아서 좋을 게 없다. 
		//System.in을 사용하는 다른 객체들이 다시 열 수 없기 때문이다.
	}

}
//
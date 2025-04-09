package ex04_fileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//메모장프로그램 만들기
public class Exam1 {
//사용자가 입력한 내용을 "memo.txt"에 저장
	//입력이 종료되면, 해당 파일의 내용을 다시 읽어서 화면에 출력하기
	//사용자로부터 여러줄의 텍스트를 입력받는다.
	//사용자가 exit를 입력하면 종료
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		FileReader fr = null;
		boolean memoOn = true;
		String memo = "";
		String sentense = "";
		
		
		try {
			fw = new FileWriter("D:\\that_yjh\\memo.txt");
			System.out.println("내용을 작성하세요! 질릴때까지!");
			System.out.println("그만하고 싶으면 'exit'를 작성하면 됩니다.");
			while(memoOn) {
				memo=sc.nextLine();
				if(memo.equalsIgnoreCase("exit")) {
					System.out.println("이제는 우리가 헤어져야 할시간");
					memoOn=false;
					break;
				}
				fw.write(memo);
			}
			fw.close();
			
			fr = new FileReader("D:\\that_yjh\\memo.txt");
			int code = 0;
			while((code=fr.read())!=-1) {
				System.out.print((char)code);
				sentense+=(char)code;
			}
			String[] split = new String[sentense.length()];
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	}

}

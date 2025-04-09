package ex02_fileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exam1 {
	//학생과 이름 점수를 저장하는 프로그램
	public static void main(String[] args) {
		//이름과 점수를 FileOutputStream 사용
		//scores.txt파일에 저장
		//1.사용자로부터 이름과 점수를 입력받기
		Scanner sc = new Scanner(System.in);
		//2.입력받은 데이터를 "이름 : 점수 \n 형식으로 만들어 파일에 사용
		//ex) "김철수 : 84" 
		//3.이름에 exit 입력시 프로그램 종료
		//4.기존 내용 덮어쓰기
		//5. 이 형식의 문자열의 각 문자에 char값을 +3해 암호화하기
		FileOutputStream fos = null;
		String name = "";
		int score;
		boolean systemOn = true;
		FileInputStream fis = null;
		
		
		try {
			fos = new FileOutputStream("D:\\that_yjh\\scores.txt");
			
			out:while(systemOn) {
						
				System.out.print("이름 입력 (exit 입력시 종료) :");
				name = sc.nextLine();
				if(name.equalsIgnoreCase("exit")) {
					//IgnoreCase : 대문자 무시하기
					systemOn = false;
					System.out.println("이제는 우리가 헤어져야 할 시간");
					break out;
				}
					System.out.println("점수 입력");
					score = sc.nextInt();
					sc.nextLine();
					
					String name_score = "";
					name_score= name+" : "+score +"\n";
					String ptns = "";
					//암호화된 이름,점수
					for(int i =0; i<name_score.length();i++) {
						ptns += (char)(name_score.charAt(i)+3);
					}
					
				
					fos.write(ptns.getBytes());
					System.out.println(name+"등록");
				
			}
			
			String path = "D:\\that_yjh\\scores.txt";
			File f = new File(path);
			fis = new FileInputStream(f);
			
			System.out.println("복호화");
			if(f.exists()) {
			byte[] buffer = new byte[(int)f.length()];
				fis.read(buffer);
				String result = new String(buffer);
				String ulns = "";
				for (int i =0; i<result.length();i++) {
					ulns += (char)(result.charAt(i)-3);
				}
				System.out.println(ulns);
			}
		} catch (Exception e) {	
		}finally {
			try {
				if(fos!=null) {
				fos.close();
				}
				if(fis!=null) {
				fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
//복호화하기
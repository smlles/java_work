package ex04_fileWriter;

import java.io.FileWriter;

public class Ex01_fileWriter {

	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			//파일 정해주고 없으면 생성해줌
			fw = new FileWriter("D:\\that_yjh\\fileWriter예제.txt");
			
			//파일에 내용 작성
			fw.write("첫번쨰줄일요일은\n");
			fw.write("두번쨰줄내가요리사\n");
			fw.write("세번쨰줄짜라짜라짜짜짜짜파게티\n");			
			
			
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

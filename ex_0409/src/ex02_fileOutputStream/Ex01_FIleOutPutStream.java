package ex02_fileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01_FIleOutPutStream {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {//경로에 파일이 없으면, 파일을 만들어주고, write한 내용까지 적어준다.
			//세이브파일을 만들거나, 저장하는 문서를 만드는 경우 FileOutputStream을 사용한다.
			//확장자도 마음대로 지정 할 수 있다.
			fos = new FileOutputStream("D:\\that_yjh\\fileOut.txt",true);
	/*		fos.write('f');
			fos.write('i');
			fos.write('l');
			fos.write('e');*/
			//바이트 배열 -> 문자열 : new STring (byte []b);
			
			//문자열 -> 바이트배열 : ?
			String msg = "fileOutput 예제. \n";
			String msg2 = "여러줄이 되지롱\n";
			//삼중따옴표 문법 = Java 15부터 사용가능
			//텍스트 블록이라고 부르며, 여러줄에 걸친 문자열을 작성할 떄 사용
			//html,json 사용시 유용
			String msg3 = """
					문자열
					여러개
					리터럴
					크크루삥뽕
					""";
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			fos.write(msg3.getBytes());
			System.out.println("파일생성완료");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(fos!=null) {
					fos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

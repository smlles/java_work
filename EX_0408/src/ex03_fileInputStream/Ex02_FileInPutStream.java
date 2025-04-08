package ex03_fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

public class Ex02_FileInPutStream {

	public static void main(String[] args) {
		//경로저장
		String path = "D:\\that_yjh\\test.txt";
		File f = new File(path);
		//File객체에 경로 알려주기
		//length()를 통해, 내용크기만큼 배열을 만들 수 있다.
		byte[] b_read = new byte[(int)f.length()];
		
		FileInputStream fis = null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				fis.read(b_read);
				//파일에서 읽어온 내용을 바이트 배열에 담기
				//read() : 1바이트씩 읽음
				//read(byte[] b) : 한번에 읽어와서 배열에 담는다.
				
				//문자열 객체의 생성자에 바이트 배열을 전달함으로써
				//문자열로 변환
				String res = new String(b_read);
				
				System.out.println(res);
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					if(fis != null) {
						fis.close();
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}

}

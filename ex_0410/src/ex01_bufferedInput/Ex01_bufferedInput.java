package ex01_bufferedInput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex01_bufferedInput {

	public static void main(String[] args) {
		FileInputStream in = null;
		BufferedInputStream bis = null;
		
		try {
			in = new FileInputStream("D:\\that_yjh\\test.txt");
			//보조스트림은 생성자에 반드시 기반 스트림 객체를 필요로 한다.
			bis = new BufferedInputStream(in);
			byte[] buffer = new byte[99];
			int read = 0;
			
			read=bis.read(buffer) ;
				
			String text = new String (buffer);
				
			System.out.println(text);
			
			//보조스트림이 단독으로 읽거나 쓰는것은 불가능
			//기반스트림 객체로부터 위임을 받아서 읽거나 쓰는것은 가능
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			//역순닫기 
			//보조스트림 먼저,그리고 기반스트림 닫기
			 {
				try {
					if(bis!=null) {
					bis.close();
					}
					if(in!=null) {
						in.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
//
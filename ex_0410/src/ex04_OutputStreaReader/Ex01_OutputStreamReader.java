package ex04_OutputStreaReader;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Ex01_OutputStreamReader {

	public static void main(String[] args) {
		//바이트기반 스트림은 
		//문자열을 바이트배열로 변환한 후 작성했어야 하지만
		//OutputStreamWriter는, 문자열을 바이트로 쉽게 변경해주는 보조 스트림이다.
		FileOutputStream on = null;
		OutputStreamWriter os = null;
		try {
			on = new FileOutputStream("test.txt");
			os = new OutputStreamWriter(on);
			
			System.out.println("파일 생성 시작");
			String[] strArray = {
					"OutputSTreamWriter에 대해 배우다.",
					"We are learning about OutputStreamWriter"
					
			};
			
			for(String str : strArray) {
				os.write(str+"\n");
			}
			System.out.println("파일 생성 완료");
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(os!=null) {
					os.close();
				}
				if(on!=null) {
					on.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}

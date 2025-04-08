package ex03_fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

public class Exam1 {
	public static void main(String[] args) {
		//file.txt를 만들고
		//문장을 입력하고 저장
		//FileInputStream으로 읽어온뒤, 회문인지 아닌지 검증하기
		String path = "D:\\that_yjh\\file.txt";
		File f = new File(path);
		//File객체에 경로 알려주기
		//length()를 통해, 내용크기만큼 배열을 만들 수 있다.
		byte[] b_read = new byte[(int)f.length()];
		byte[] b_read2 = new byte[(int)f.length()];
		FileInputStream fis = null;
		boolean textEqual = true ;
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				fis.read(b_read);
				System.out.println(Arrays.toString(b_read));
				
				String res = new String(b_read);
			
				for(int i = 0; i<res.length();i++) {
					if(res.charAt(i)!=res.charAt(res.length()-i)) {
						textEqual = false;
					}
				}
				
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					if(fis != null) {
						if(!textEqual) {
							System.out.println("회문");
						}else {
							System.out.println("회문아님");
						}
						fis.close();
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
}

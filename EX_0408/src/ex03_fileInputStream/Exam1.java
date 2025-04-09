package ex03_fileInputStream;

import java.io.File;
import java.io.FileInputStream;

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
		
		FileInputStream fis = null;
		boolean textEqual = true;
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				fis.read(b_read);
				String res = new String(b_read);
		/*		StringBuilder sb = new StringBuilder(res);
				StringBuilder rev = sb.reverse();
				System.out.println(sb);
				System.out.println(rev);*/
				
				
				for(int i = 0; i<res.length();i++) {
					if(res.charAt(i)!=res.charAt(res.length()-i-1)) {
						textEqual =false;
						break;
					}
				}
				if(!textEqual) {
					System.out.println(res+" : 회문이 아님");
				}else {
					System.out.println(res+" : 회문임");
				}
				
				
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

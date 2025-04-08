package ex03_fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex01_FileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\\that_yjh\\test.txt";
		File f = new File(path);
		FileInputStream fis = null;
		
		if(f.exists()) {//exists()로 경로를 탐색했는데
			//읽어 올 때 경로가 없어질 가능성 때문에 예외처리가 필요
			try {
				fis = new FileInputStream(f);
				int code = 0;
				while((code = fis.read()) != -1 ) {
					System.out.print((char)code);
				}
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally { //예외가 발생하건 하지 않건
				//InputStream의 사용이 끝나게 되면, close를 통해 종료
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
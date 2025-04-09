package ex03_fileReader;

import java.io.FileReader;

public class Ex01_FileReader {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("D:\\that_yjh\\test.txt");
			int code = 0;
			
			while((code = fr.read())!=-1){
				System.out.print((char)code);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

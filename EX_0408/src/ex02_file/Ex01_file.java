package ex02_file;

import java.io.File;

public class Ex01_file {

	public static void main(String[] args) {
		String path ="D:\\that_yjh\\test.txt";
		
		File f = new File(path); 
		//File 클래스의 객체가 생성되며 path 경로까지 스트림 생성
		
		//isFile() : 최종 목적지까지 갔을 때, 파일인지 아닌지 판별
		if(f.isFile()) {
			//length()
			//파일이나 폴더의 최종 목적지에 해당하는 용량을 가져올 수 있다.
			//섭섭섭섭섭섭섭섭섭섭
			System.out.println(f.length()+"byte");
			
		}
	}

}
//
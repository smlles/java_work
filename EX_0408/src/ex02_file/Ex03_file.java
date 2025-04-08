package ex02_file;

import java.io.File;

public class Ex03_file {

	public static void main(String[] args) {
		//
		String path = "D:\\that_yjh\\aaa\\bbb";
		
		File f = new File(path);
		
		//esists() 
		//목적지까지 경로가 존재하면 true
		if(!f.exists()) {
			System.out.println("폴더생성");
			//mkdirs()
			//복수의 폴더 생성
			f.mkdirs();
		}
	}
}
//File 클래스의 역할 
//폴더를 만들어주거나, 목적지까지의 검증(파일,폴더,존재유무)
//폴더일때, 목록의 반환
//목적지의 크기 반환

//내용을 읽거나 쓰는 기능은 없음
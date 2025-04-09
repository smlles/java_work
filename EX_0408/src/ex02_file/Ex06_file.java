package ex02_file;

import java.io.File;
import java.io.IOException;

public class Ex06_file {

	public static void main(String[] args) {
		//파일 이름만 설정하면, 기본 경로는 프로젝트 내부로 설정
		
		File f = new File("test.txt"); //경로 설정
		try {//파일이 존재하지 않으면 생성하기
			if(f.createNewFile()) {
				System.out.println("파일생성 : "+ f.getName()+" "+f.getAbsolutePath());
			}else {
				System.out.println("이미 있는 파일");
			}
		} catch (IOException e) {
			System.out.println("파일 생성 중 오류 발생");
			e.printStackTrace();
		}
	}

}
//파일 폴더의 생성이나 삭제까지는 가능,내용을 읽거나 수정이 안됨
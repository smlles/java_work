package ex02_file;

import java.io.File;

public class Ex05_file {

	public static void main(String[] args) {
		String path = "D:\\that_yjh\\aaa";
		File f = new File(path);
		//폴더는 생성이 되는데, 파일을 만들거나 읽는것은 불가능
		if(f.exists()) {
			if(f.isDirectory()) {
				//delete()
				//파일과 폴더를 삭제할 수 있다.
				//폴더는 비어있어야 삭제 할 수 있다.
				if(f.delete()) {
					System.out.println("디렉토리 삭제");
					
				}else {
					System.out.println("디렉토리 삭제 실패 (디렉토리가 비어있는지 확인)");
				}
			}else {
				System.out.println("디렉토리가 아닌지 확인");
			}
		}else {
			System.out.println("삭제할 디렉토리가 존재하지 않습니다.");
		}
	}
} 
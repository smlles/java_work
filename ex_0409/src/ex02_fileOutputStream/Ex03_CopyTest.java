package ex02_fileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_CopyTest {

	public static void main(String[] args) {
		//read() ,write()를 이용해 복사
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("D:\\that_yjh\\wall.jpg");
			fos = new FileOutputStream("D:\\that_yjh\\wallcopy.jpg");
			byte[] buffer = new byte[512];
			
			
			//현재 시간을 m/s단위로 나타냄
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int read = 0 ;
			//read를 통해 읽고
			while((read =fis.read(buffer))!=-1) {
				//읽은 내용을 write로 쓴다
				fos.write(buffer,0,read);
			}
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			// 종료 - 시작 = 소요시간
			double time = (double)(end - start)/1000;
			System.out.println(time+"초");
			
			
		} catch (Exception e) {
			
		}finally {
			try {
				if(fos!=null) {
					fos.close();
				}
				
				if(fis!=null) {
					fis.close();
				}
				//역순으로 닫아야한다.
			} catch (Exception e2) {
				// 직접 복사하는 것 보다 byte 배열을 통해 복사하는 것이
				//속도가 월등하게 빠르다
			}
		}
	}
}
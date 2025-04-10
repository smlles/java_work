package ex01_bufferedInput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex02_readImage {
//byte배열을 사용해서 이미지를 읽어왔을 때 
	//속도가 굉장히 빠르다는것을 알 수 있었는데
	//보조스트림을 사용한다면?
	public static void main(String[] args) {
		FileInputStream readFile = null;
		BufferedInputStream bis = null;
		try {
			
			readFile = new FileInputStream("D:\\that_yjh\\wall.jpg");
			System.out.println("보조스트림으로 읽기");
			//버퍼라는 공간을 만들고 read()를 통해서 읽어온 데이터를
			//버퍼라는 공간에 저장을하고, 버퍼가 다 차면 내보낸다.
			bis = new BufferedInputStream(readFile);
			
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽는 시작");
			while(bis.read()!=-1) {
				//단순히 읽는 속도 측정을 하려는거니까
				//읽기만 하는 것
			}
			System.out.println("끗");
			long end = System.currentTimeMillis();
			double time = (double)(end - start)/1000;
			System.out.println(time+"초 걸림");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(bis!=null) {
					bis.close();
				}
				if(readFile!=null) {
					readFile.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}

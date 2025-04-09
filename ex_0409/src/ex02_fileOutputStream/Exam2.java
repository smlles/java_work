package ex02_fileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exam2 {
//이름, 점수 입력받아 scores.txt에 저장
//이어쓰기
//마지막에는 파일 내용을 읽어 콘솔에 출력하기
	public static void main(String[] args) {
		FileOutputStream fos = null;
		Scanner sc = new Scanner(System.in);
		FileInputStream fis = null;
		String name = "";
		String score = "";
		boolean onSystem = true;
		String path = "D:\\that_yjh\\scores.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int)f.length()];
		
		try {
			fos = new FileOutputStream("D:\\that_yjh\\scores.txt",true);
			
			while(onSystem){
				System.out.print("이름 입력 (exit 입력시 종료) : ");
				name = sc.nextLine();
				if(name.equalsIgnoreCase("exit")) {
					System.out.println("끗");
					onSystem=false;
					break;
				}
				System.out.print("점수 입력 : ");
				score = sc.nextLine();
				
				String ns = name + " : " + score + "\n";
				
				fos.write(ns.getBytes());
				System.out.println(ns);
			}
			if(f.exists()) {
				
					fis = new FileInputStream(f);
					fis.read(b_read);
					String result = new String(b_read);
					System.out.println(result);
				
			}
		} catch (Exception e) {
			
		}finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

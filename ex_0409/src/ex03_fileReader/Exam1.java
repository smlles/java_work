package ex03_fileReader;

import java.io.FileReader;

public class Exam1 {

	public static void main(String[] args) {
		//text.txt 파일 만들고, 한글 영어 섞어서 작성
		//text.txt. 파일을 읽어와서 영어 대문자, 소문자의 개수를 판별하기
		//대문자 : n개 소문자  : m개
		FileReader fr = null;
		String list = "";
		int upperCount = 0;
		int count =0;
		try {
			fr = new FileReader("D:\\that_yjh\\text.txt");
			int code =0;
			while((code=fr.read())!=-1) {
				list+=((char)code);
			}
			System.out.println(list);
			for(int i =0 ; i<list.length();i++) {
				if(list.charAt(i)>='A'&&list.charAt(i)<='Z') {
					upperCount ++;	
				}else if (list.charAt(i)>='a'&&list.charAt(i)<='z') {
					count++;
				}
			}
			
			System.out.printf("대문자 : %d개 ",upperCount);
			System.out.println();
			System.out.printf("소문자 : %d개 ",count);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

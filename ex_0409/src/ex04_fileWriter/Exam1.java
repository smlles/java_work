package ex04_fileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//메모장프로그램 만들기
public class Exam1 {
//사용자가 입력한 내용을 "memo.txt"에 저장
	//입력이 종료되면, 해당 파일의 내용을 다시 읽어서 화면에 출력하기
	//사용자로부터 여러줄의 텍스트를 입력받는다.
	//사용자가 exit를 입력하면 종료
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		FileReader fr = null;
		boolean memoOn = true;
		String memo = "";
		String sentense = "";
		List<String> lines = new ArrayList<>();
		HashMap<String,Integer> wordCount2 = new HashMap<>();
		try {//입력받고 저장하기
			fw = new FileWriter("D:\\that_yjh\\memo.txt");
			System.out.println("내용을 작성하세요! 질릴때까지!");
			System.out.println("그만하고 싶으면 'exit'를 작성하면 됩니다.");
			while(memoOn) { 
				System.out.print(">");
				memo=sc.nextLine();
				if(memo.equalsIgnoreCase("exit")) {
					System.out.println("이제는 우리가 헤어져야 할시간");
					memoOn=false;
					break;
				}//메모장에 넣기 전에 arrayList에 추가
				lines.add(memo);
				fw.write(memo);
				fw.write(" ");
				System.out.println("내 마음속에 저~장");
			}
			//단어별 빈도수 계산
			fw.close();
			//파일내용 불러오기
			fr = new FileReader("D:\\that_yjh\\memo.txt");
			int code = 0;
			while((code=fr.read())!=-1) {
				System.out.print((char)code);
				sentense+=(char)code;
			}
			String[] words = sentense.toLowerCase().split(" ");
			
			//중복되는 단어 찾기
			HashMap<String,Integer> wordCount = new HashMap<>();
			
			for(String word1 : lines) {
				String[] word2 = word1.toLowerCase().split(" ");
				for (String word : word2) {
					if ( word.isEmpty())continue;
					wordCount2.put(word, wordCount2.getOrDefault(word, 0)+1);
				}
			}
			//or
			for(String word : words) {
				wordCount.put(word, wordCount.getOrDefault(word, 0)+1);

			}
			System.out.println("단어별 등장 횟수 ");
			for(String key : wordCount.keySet()) {
				System.out.println(key+" : " + wordCount.get(key));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		try {
			fw = new FileWriter("D:\\that_yjh\\result.txt");
			
			for(Map.Entry<String, Integer> entry : wordCount2.entrySet()) {
				fw.write(entry.getKey()+ " : "+ entry.getValue());
				fw.write("\n");
			}
			System.out.println("단어 빈도 저장");
			
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}

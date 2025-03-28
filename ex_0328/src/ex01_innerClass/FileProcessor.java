package ex01_innerClass;

import java.util.List; //배열의 확장 개념

//요구사항
//어떤 메서드에서 텍스트 파일처리
//처리 도중 줄 수 세는 기능필요
//이 기능은 다른곳에서 사용되지 않음
//지역 내부 클래스
public class FileProcessor {
	public void processFile(List<String> lines) {
		class LineCounter{
			int countLines(){
				return lines.size();//배열의 length
			}
		}
		LineCounter counter = new LineCounter();
		int totalLines = counter.countLines();
		System.out.println("총 줄 수 : "+ totalLines);
		for(String line : lines) {
			System.out.println("▶ "+ line);
		}
	}
	
}



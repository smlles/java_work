package ex01_innerClass;

import java.util.List;

public class FileMain {

	public static void main(String[] args) {
		List<String> content = List.of(
			"첫 번 쨰 줄 ",
			"두 번 쨰 줄 ",
			"세 번 째 줄 "
				);
		FileProcessor processor = new FileProcessor();
		processor.processFile(content);
	}

}

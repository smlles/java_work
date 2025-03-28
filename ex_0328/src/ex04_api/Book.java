package ex04_api;

public class Book {
	private String bookName;
	private String writerName;
	
	public Book(String bookName, String writerName) {
		this.bookName = bookName;
		this.writerName = writerName;
	}	
	
	public String toString() {
		String str ="책 제목 : "+ bookName + ", 저자 : "+ writerName; 
		return str;
	
	}
}

package ex01_innerClass;

public class PermitExample {
	private class InClass{
		public void print() {
			System.out.println("접근을 private로 제한.");
		}
		
	}
	public InClass getInClass() {
		return new InClass();
	}
	public static void main(String[] args) {
		PermitExample permit = new PermitExample();
		//InClass가 private라서 
		//내부 객체를 직접 만들 수 없음
		//PermitExample.InClass = permit.new InClass();
		
		permit.getInClass().print();		}
}

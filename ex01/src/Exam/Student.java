package Exam;

public class Student {
	String name="";
	int age=0;
	int stuNum =0;
	public Student(String name, int age, int stuNum ){
		this.name =name;
		this.age=age;
		this.stuNum=stuNum;
		
		System.out.println("나의 이름: "+name);
		System.out.println("나의 나이: "+age);
		System.out.println("나의 학번: "+stuNum);
	}
	public void info() {
		System.out.printf("이름 : %s, 나이: %d, 학번 : %d\n",name,age,stuNum);
	}
	
}

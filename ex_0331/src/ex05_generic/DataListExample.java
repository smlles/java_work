package ex05_generic;

public class DataListExample {

	public static void main(String[] args) {
		//객체가 만들어지면서, 배열을 생성
		//클래스에 제네릭을 부여한다면, 해당 클래스를 선언할 때
		//데이터 타입을 부여하게 된다.
		
		//제네릭은 기본 자료형을 인식하지 않음
		//그래서 int, double등의 기본자료형을 제네릭타입으로 이용하자고 하면
		//Integer , Double 등의 클래스를 이용해야 한다.
		DataList<Integer> list = new DataList();
		//Object 타입이니까 데이터 삽입은 정수,문자열,실수 상관없음
		list.add(10);
		list.add(50);
		list.add(500);
		list.add(5000);
		list.add(50000);
	//	list.add("문자열");	
	//	list.add(1.33);
		int sum=0;
		for(int i=0; i< list.size();i++) {
			sum += list.get(i);
			//저장된 데이터 타입이 어떤 타입인지 검사
			
			
			/*
			if(data instanceof Integer) {
				System.out.println("정수 : "+(int)data);
			}else if (data instanceof String) {
				System.out.println("문자열 : "+(String)data);
			}else if (data instanceof Double) {
				System.out.println("실수 : "+(double)data);
			}*/
		}	System.out.println(sum);
		DataList<String> list2 = new DataList<String>();
		DataList<Double> list3 = new DataList<Double>();
	}
}

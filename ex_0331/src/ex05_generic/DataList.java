package ex05_generic;
// 이 클래스는 데이터를 저장 할 수 있는 자료 구조
// 배열의 타입 = Object
// Object는 모든 클래스의 최상위 클래스이므로
// 어떠한 형태의 데이터라도 저장 가능
// 하지만, 데이터를 저장 한 후에 실제로 꺼내서 쓰려면, 어떤 데이터 타입을 지녔는지
// 일일히 확인해야하고, 약속한 데이터가 입력되지 않아 에러가 발생 할 수 있다.
public class DataList<T> {
	private Object[] data;
	private int size;
	private int defaultSize = 10;
	
	public DataList() {
		data = new Object[defaultSize];
	}
	
	public DataList(int size) {
		data = new Object[size];
	}
	
	//배열에 데이터를 추가해주는 메서드
	public void add(T value) {
		data[size++]=value;
	}
	
	//배열의 데이터를 조회하는 메서드
	public T get(int index) {
		return (T)data[index];
	}
	//배열의 크기를 반환하는 메서드
	public int size() {
		return size;
	}
	
}

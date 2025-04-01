package ex06_list;

public class MenuItem<T> {
	/*1.메뉴보기
	 *2.주문하기
	 *3.결제하기
	 *4.취소하기(선택한거)
	 *5.프로그램종료
	 * */
	private String name;
	private int price;
	
	public MenuItem(String name,int price) {
		this.name = name;
		this.price=price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	
}

package ex06_list;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeMain {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//메뉴 담는 ArrayList
	//장바구니 ArrayList 만들기
	ArrayList<MenuItem> menuList = new ArrayList<>();
	ArrayList<MenuItem> itemList = new ArrayList<>();
	
	menuList.add(new MenuItem("아메리카노",3000));
	menuList.add(new MenuItem("라떼",3500));
	menuList.add(new MenuItem("카푸치노",4000));

	
	
	int coffeeNum=0;
	int sum=0;
	
	
	
	boolean running = true;
	while(running) {
		System.err.println("=========================");
		System.out.println("ㅎㅇ");
		System.out.println("1. 메뉴보기");
		System.out.println("2. 주문하기");
		System.out.println("3. 결제하기");
		System.out.println("4. 종료하기");
		System.out.println("5. 취소하기");
		System.out.println("번호 선택");
		int menuNum = sc.nextInt();
		System.out.println("=========================");
	
	
	
	switch(menuNum) {
		case 1: System.out.println("1.메뉴 보기 선택");
			for(int i =0; i<menuList.size();i++) {
			System.out.println(menuList.get(i).getName()+menuList.get(i).getPrice()+"원");
			}
			break;
		
		case 2 : sc.nextLine();
			//그니까 이게 문제라니까? 
			//메뉴 번호를 입력받아서 해당 객체를 itemList에 넣으면 된다니까? 이게 안된다니까? 왜?뭬?
		//왜 라떼만 들어가냐 뭐지 시바 아 시발 내가병신
			System.out.println("2. 주문하기 선택");
			for(int i =0; i<menuList.size();i++) {
				System.out.println(menuList.get(i).getName()+" "+menuList.get(i).getPrice()+"원");
			}
			System.out.println("뭘 주문 할거지?");
				coffeeNum=sc.nextInt();
				if(coffeeNum>=1 && coffeeNum<=menuList.size()) {
					MenuItem selected = menuList.get(coffeeNum-1);//새로운 변수
					itemList.add(selected);
					System.out.println("' "+selected.getName()+"'이 주문에 추가되었습니다.");
				}else {
					System.out.println("없는 메뉴");
				}
				break;
		case 3 : System.out.println("3. 결제하기 선택"); 
			if(itemList.isEmpty()) {
				System.out.println("주문한게 없는데?");
			} else {
			for(int i =0; i<itemList.size();i++) {
				System.out.println("- "+itemList.get(i).getName());
				sum+=itemList.get(i).getPrice();
			}
			System.out.println(sum+"원 결제되었습니다.");
			}
			itemList.clear();
		break;
		case 4 : System.out.println("종료");
		running = false;
		break;
			
				
		case 5 : System.out.println("5. 취소하기 선택");
		//오더리스트 비어있으면 없다
		if(itemList.isEmpty()) {
			System.out.println("주문한게 없는데?");
			break;
		} else {
		System.out.println("현재 주문 내역");
		for(int i =0; i<itemList.size();i++) {
			System.out.println((i+1)+itemList.get(i).getName()+" "+itemList.get(i).getPrice());
		}
		
		System.out.println("취소할 것?");
		//coffeeNum=sc.nextInt();
		int cancelIndex=sc.nextInt();
		if(cancelIndex>=1 && cancelIndex<=itemList.size()) {
			MenuItem removed = itemList.remove(cancelIndex-1);
			System.out.println("'"+removed.getName()+"'주문이 취소되었습니다.");
		}else {
			System.out.println("없는 번호");
		
		}
		
		/*
		if((coffeeNum>=1 && coffeeNum<=menuList.size())) {
			for (int i =0;i <itemList.size();i++) {
				if(menuList.get(coffeeNum).equals(itemList.contains(i)));
				itemList.remove(i);
				System.out.println("메뉴가 취소되었습니다");
				break;
				}
			}else {
				System.out.println("잘못된 메뉴 번호");
				break; 
			}
		break;	
	*/
					
				}
		break;
			}
		}
	}
}

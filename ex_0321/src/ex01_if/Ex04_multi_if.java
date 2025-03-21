package ex01_if;

public class Ex04_multi_if {

	public static void main(String[] args) {
		//점심 메뉴의 정상화... 온 인류의 소원...
		//if문은 자유롭게 중첩하여 사용 할 수 있다.
		
		//if (조건식1){
		//	if(조건식2){
		//	}
		//}
		
		//1. boolean 변수 == true / ==false 없이 사용
//		boolean isActive = true;
//		// if(isActive ==true) << 이거 아님
//		if (isActive) {
//			
//		}
//		
		//2. 조건을 매서드로
//		if(isAccessibleAdmin) {
//			
//		}
//		public boolean isAccessibleAdmin(User user) {
//			return user != null && user.isActive() && user.getRole().equals("admin");
//		}
		
		//3. 메서드조건이 안맞을때 return 써서 빠져나오기
//		public void proccess(User user) {
//		if(user == null) return; 
//		if(user.isActive())return; 
//		if(user.hasPermission())return; 
//		
//		doSomething();
//				}
		
		
	}

}

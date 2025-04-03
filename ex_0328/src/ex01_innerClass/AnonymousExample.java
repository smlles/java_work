package ex01_innerClass;

//인터페이스 생성
interface buttonClickListener{
	//추상메서드 생성
	public void click();
}

public class AnonymousExample {
	//내부클래스
	public class Button{
		//buttonClickListener type의 변수를 갖는다.
		//인터페이스의 구현체는 다 가능
		private buttonClickListener listener;
		//멤버변수는 private로 지정하는 일이 많아 직접 접근 불가능
		//public 메서드를 통해접근하는데 이를 setter/getter 라고함
		
		public void setListener(buttonClickListener listener) {
			this.listener = listener;
		}
		
		public void click() {
			if(listener !=null) {
				this.listener.click();
				
			}
		}
	}
	public static void main(String[] args) {
		//외부객체
		AnonymousExample exam = new AnonymousExample();
		//내부객체
		AnonymousExample.Button button = exam.new Button();
		//원래라면 : ButtonImpl bi = new ButtonImpl ();
		// button.setListener(bi);
		
		
		button.setListener(new buttonClickListener() { //이름이 없는 클래스 implement와 같음

			@Override
			public void click() {
				System.out.println("버튼 클릭 됨");	
			}//이게 ButtonImpl 역할을 함
		});
		button.click();
	}
}//ctrl + shift + p = 반대쪽 중괄호 이동

package ex01_innerClass;
interface buttonClickListener{
	public void click();
}
public class AnonymousExample {
	public class Button{
		private buttonClickListener listener;
		
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
		AnonymousExample exam = new AnonymousExample();
		AnonymousExample.Button button = exam.new Button();
		//원래라면 : ButtonImpl bi = new ButtonImpl ();
		// button.setListener(bi);
		button.setListener(new buttonClickListener() {

			@Override
			public void click() {
				System.out.println("버튼 클릭 됨");	
			}//이게 ButtonImpl 역할을 함
		});
		button.click();
	}
}//ctrl + shift + p = 반대쪽 중괄호 이동

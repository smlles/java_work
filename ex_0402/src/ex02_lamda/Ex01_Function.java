package ex02_lamda;

public class Ex01_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iadd add = (x,y) ->x+y;
		
		int res = result(add);
		
		System.out.println("res : "+res);
	}

	public static int result(Iadd lamda) {
		return lamda.add(1, 2);
	}
}

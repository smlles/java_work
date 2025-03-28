package ex03_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03_try_catch {
	public static void main(String[] args) {
		//다중 catch
		//예외가 하나만 나오면 처리하기 쉽지
		//하지만, try 구문에서 다양한 예외가 발생 할 수 있지
		//catch구문을 여러개 작성하여, 예외별로 처리 코드를 다르게작성하여
		//예외를 처리할 수 있다.
		
		Scanner sc = new Scanner(System.in);
		try {
			int[] cards = {4,5,1,2,8,7};
			System.out.print("몇번째 카드를 뽑으시겠읍니까? >>");
			int cardIndex= sc.nextInt();
			System.out.println("뽑은 카드 번호는 : "+cards[cardIndex]);
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해주세요.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("해당 번호의 카드가 없습니다.");
		}System.out.println("종료 ");
	}
}

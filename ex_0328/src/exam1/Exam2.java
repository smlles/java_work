package exam1;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//회문판별
		//앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문자열
		//문자열을 입력받아 회문이면 xxx는 회문입니다.
		//아니면 xxx는 회문이 아닙니다.
		
		String str2= "";
		System.out.print("문자열 입력하기 : ");
		String str1=sc.next();
		//str2 = str2+ str1.charAt(0);
		//System.out.println(str1.length());
		for(int i = str1.length()-1; i>=0;i--) {
			str2+=str1.charAt(i);
		}
		if (str1.equals(str2)) {
			System.out.println("회문");
		}
		//System.out.println(str1);
		//System.out.println(str2);
		
		
		//생일과 성별 구하기
		//예시 : 주민번호를 모두 입력하세요
		//911223-1023456
		//당신은 xxxx년 nn월 mm일에 태어난 남자입니다.
		
		/*
		System.out.println("주민번호를 모두 입력하세요 -포함");
		String p_number = sc.next();
		if(p_number.trim().length()<14||p_number.trim().charAt(6)!='-') {
		System.out.println("이거 아님");
		}else {
			String year=" ";
			String result = "";
			year=p_number.substring(0,2);
			if(Integer.parseInt(year)<=00) {
				result = "당신은 20";
			}else {
				result = "당신은 19";
			}
			result +=year+"년 "+p_number.substring(2,4)+"월"+p_number.substring(4, 6)+"일에 태어난 ";
		
		if(p_number.charAt(7)%2!=0) {
			result+="남자입니다.";
		}else {
			result+="여자입니다.";
		}System.out.println(result);
		}
		/*
		String[] arr = p_number.split("-");
		
		System.out.println(Arrays.toString(arr));
		String gender =" ";
		System.out.println(arr[2].charAt(0));
		if(arr[2].charAt(0)==1 || arr[2].charAt(0)==3) {
			gender = "남성";
		}else if (arr[2].charAt(0)==2 || arr[2].charAt(0)==4) {
			gender = "여성";
		}else {
			System.out.println("잘못 된 주민번호입니다.");
		}
		
		System.out.printf("당신은 19%s년 %s월 %s일에 태어난 %s입니다.",p_number.substring(0, 2),p_number.substring(2, 4),p_number.substring(4, 6),gender);
		*/
		
		
		
		//키보드에서 특수문자를 제외한 알파벳을 무작위로 받는다.
		//입력받은 문자열에서 소문자 a가 몇개 있는지 판별하시오
		//ex
		//입력 : asdfasdf
		//결과 : 2
		
		
		/*
		int count =0;
		System.out.println("영어 입력");
		String str =sc.nextLine();
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println("소문자 a의 개수 : "+count);*/
	}
}


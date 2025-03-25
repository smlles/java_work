package ex04_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
//		int[] iArr = new int[10];
//		//배열의 각각의 index의 1~10을 할당하고 총 합을 구하세요.
//		int sum = 0;
//		for(int i=0;i<iArr.length;i++) {
//			iArr[i] = i+1;
//			sum+=iArr[i];
//		}
//		System.out.println("sum : "+sum);
		Random r = new Random();
		int sum=0;
		//r.nextInt(30)+1
		//iArr의 각 index에 난수를 넣고
		//배열의 짝수 요소의 총합 구하기
//		for(int i =0;i<iArr.length;i++) {
//			iArr[i]=r.nextInt(30)+1;
//			if (iArr[i]%2==0) {
//				System.out.printf("iArr[%d] : "+iArr[i]+", ",i);
//				sum+=iArr[i];
//			}
//		}
//		System.out.println("sum : "+sum );
		
		int[] nums = {5,7,2,9,4,10,3};
		int max=nums[0];
		int min=nums[0];
		for(int i = 0; i<nums.length;i++) {
			if(i==0) {
				continue;
			}if(nums[i]>max) {
				max = nums[i];
			}
			if(nums[i]<min
					) {
				min = nums[i];
			}
		}
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		
		int[] nums2= {1,2,1,3,2,1,4};
		//위 배열에서 각 숫자가 몇번 나왔는지 출력하시오
		int[] count = new int[5];
		for(int i = 0; i<nums2.length;i++) {
			count[nums2[i]]++;
//			switch(nums2[i]){
//			case 1:
//				count[0]++;
//				break;
//			case 2:
//				count[1]++;
//				break;
//			case 3:
//				count[2]++;
//				break;
//			case 4:
//				count[3]++;
//				break;
//				}
			}System.out.printf("1 : %d번\n",count[1]);
			System.out.printf("2 : %d번\n",count[2]);
			System.out.printf("3 : %d번\n",count[3]);
			System.out.printf("4 : %d번\n",count[4]);
			
			int[] nums3 = {5,3,8,4,2};
			
			int temp=0;
			//오름차순 정렬  8 5 4 3 2
			//1. 버블정렬
			//인접한 두 요소를 비교해 큰 값을 뒤로 보내기
			for(int i = 0; i<nums3.length-1;i++) {
				for(int j = 0; j<nums3.length-1-i;j++) {
					if(nums3[j]>nums3[j+1]) {
						temp=nums3[j];
						nums3[j]=nums3[j+1];
						nums3[j+1]=temp;
					}
				}
			}System.out.println(nums3[2]);
//			
//			
//			for(int i=0;i<nums3.length;i++) {
//				if(i==0) {
//					continue;
//				}
//				for(int j = 0; j<i;j++) {
//					if(nums3[j]>nums3[i]) {
//						temp=nums3[j];
//						nums3[j]=nums3[i];
//						nums3[i]=temp;
//					}
//				}
//			}
			
			char[] cards = {'1','L','O','2','V','3','E'};
			String myWord = "";
			//그만 돌아 바보야.... 왜자꾸 멀리가... myWord도 배열이잖아 
			for(int i = 0; i<cards.length;i++) {
				if(cards[i]>='A'&&cards[i]<'Z') {
				myWord+=cards[i];
				}
			}
				System.out.println(myWord);
			
			Scanner sc= new Scanner(System.in);
			//키보드에서 배열의 길이를 입력받는다ㅣ.
			//입력받은 배열의 길이만큼 알파벳을 넣고출력한다.
			// ex)길이 5 = ABCDE
//			char a = 'A';
//			System.out.println("알파벳을 몇개 넣을까? : ");
//			char[] alphabet = new char[sc.nextInt()];
//			
//			for(int i = 0;i<alphabet.length;i++) {
//				alphabet[i]+=a;
//				a++;
//				System.out.print(alphabet[i]);
//				
//			}System.out.println();
			//동전 개수 구하기
			//10~5000 사이 난수 변수 담기
			//1의자리는 반드시 0
			//발생된 난수를 각 동전으로 바꿀 때 몇개씩 필요한지 판단하여 작성하기
			//가능한 동전의 개수는 적게
			int money = (r.nextInt(500)+1)*10;
			int[] coin = {500,100,50,10};
			int[] count_coin = {0,0,0,0};
			System.out.println("시작 돈 : "+money);
			/*for (int i = 0; i<coin.length;i++){
			 * int res = money / coin[i];
			 * System.out.printf("%d원 : %d\n",coin[i],res);\
			 * money%=coin[i]
			 * }*/
			
			while(money>=10) {
				if(money>=500) {
					money-=500;
					count_coin[0]++;
				}else if (money>=100) {
					money-=100;
					count_coin[1]++;
				}else if (money>=50) {
					money-=50;
					count_coin[2]++;
				}else if (money>=10) {
					money-=10;
					count_coin[3]++;
				}
				
			}System.out.println("500원 개수 : " + count_coin[0]);
			System.out.println("100원 개수 : " + count_coin[1]);
			System.out.println("50원 개수 : " + count_coin[2]);
			System.out.println("10원 개수 : " + count_coin[3]);
			
//			Random r = new Random();
			
			 int[] lotto_numbers = new int[6];
			 retry_lotto:for(int i =0 ;i<lotto_numbers.length;i++) {
				lotto_numbers[i]=r.nextInt(45)+1;
				for(int j = 0 ; j<i;j++) {
					if(lotto_numbers[i]==lotto_numbers[j]) {
						i--;
						continue retry_lotto;
					}
				}
			}
			 System.out.println(Arrays.toString(lotto_numbers));		
	}
}

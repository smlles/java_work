package ex04_exam;

import java.util.Random;

public class PrintGraph {
		//public void graph(){
		//int[] count = new int[10];
	//	Random r = new Random();
	//	int[] arr = new int[100];
//		for(int i : arr) {
//			arr[i]=r.nextInt(10);
//			if(arr[i]==0) {
//				count[0]++;
//			}else if (arr[i]==1) {
//				count[1]++;
//			}else if(arr[i]==2) {
//				count[2]++;
//			}else if(arr[i]==3) {
//				count[3]++;
//			}else if(arr[i]==4) {
//				count[4]++;
//			}else if(arr[i]==5) {
//				count[5]++;
//			}else if(arr[i]==6) {
//				count[6]++;
//			}else if(arr[i]==7) {
//				count[7]++;
//			}else if(arr[i]==8) {
//				count[8]++;
//			}else if(arr[i]==9) {
//				count[9]++;
//			}
//		}
//		int x=0;
//		for(int j = 0 ; j < count.length;j++)	{
//			while(x < count[j]) {
//				System.out.print("*");
//				x++;
//			}
//			System.out.printf(" %d \n", count[j]);
//			x=0;
//		}
//		
//		
		
		public String print(char ch , int num) {
			//char[] val = new char[num];
			String str = "";
			for (int i = 0; i<num; i++) {
				str+= ch;
			}return str;
		} 
	}


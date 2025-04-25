package Exam;

public class Exam {
	
	public int[] removeDuplicates(int[] x) {
		int[] n_arr = new int[5];
		
		for(int i = 0; i<n_arr.length;i++) {
			for(int j =0; j<x.length;j++) {
				
				if(n_arr[i]<i+1) {
					n_arr[i]=x[j];
				}	
			}
		}return n_arr;
	}
	
	
	public int sumOfDigits(int x) {
		//12345
		int sum =0;
		
		for(;x>0;) {
			sum=sum+x%10;
			x=x/10;
			
		}
		return sum;
	}
	
	public int findMax(int[] x) {
		int max =0;
		int[] f_arr = {3,2,5,7,9,4,2,1,6,8};
		for(int i =0; i<f_arr.length;i++) {
			for(int j =0;j<i;j++) {
				if(i>j) {
					max=i;
				}
			}
		}
		return max;
	}
}



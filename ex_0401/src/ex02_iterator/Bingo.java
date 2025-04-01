package ex02_iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Bingo {

	public static void main(String[] args) {
		//HashSet을 이용한 5*5 랜덤 빙고판 만들기
		//숫자는 1~50까지
		int x;
		HashSet<Integer> hs1 = new HashSet<>();
		Random r = new Random();
		while(hs1.size()!=25) {
			x=r.nextInt(50)+1;
			hs1.add(x);
		}
		int[][] board = new int[5][5];
		
		//shuffle(List);
		List<Integer> list = new ArrayList<>(hs1);
		
		Collections.shuffle(list);
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			for(int i =0; i<board.length;i++) {
					for(int j =0;j<board[i].length;j++) {				
							board[i][j] = iter.next();
								System.out.printf("%02d ",board[i][j]);
				}System.out.println();
			}
		}
	}
}
package ex05_enum;

public class TransportMain {

	public static void main(String[] args) {
		// 운송수단별 100을 갔을 때 금액
		//name : xxx, 100km - fare : xxx
		//							totalFare
		Transportation[] tp = Transportation.values();
		int distances = 400;
		
		
		for(Transportation tps : tp) {
			System.out.println("name : "+tps+", "+distances+"km - fare : "+tps.totalFare(distances));
		}
	}

}

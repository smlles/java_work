package ex04_overloading;

public class Converter {
	//cm을 m으로 변환하는 convert
	
	//m,inch를 cm으로 변환하는 convert
	//inch -> cm : inch*2.54
	
	public double convert(double x) {
		return x/100;
		//10 cm= 0.1m
		//100cm = 1m
	}
//	
//	public int convert(int x) {
//		//1m = 100cm
//		return x*100;
//	}
	
	public double convert(double value, String unit) {
	// 1in = 2.54cm
		if( unit.equals("m")) {
			return value *100.0;
		}else if (unit.equals("inch")) {
			return value * 2.54;
		}else {
			return 0;
		}
	}
}

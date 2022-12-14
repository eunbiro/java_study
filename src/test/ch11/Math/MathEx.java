package test.ch11.Math;

public class MathEx {

	public static void main(String[] args) {
		
		double v1 = Math.ceil(5.3);			// 올림
		double v2 = Math.floor(5.3);		// 내림
		System.out.println(v1 + ", " + v2);
		
		double v3 = Math.max(5.3, 2.5);
		long v4 = Math.min(3, 7);
		System.out.println("MAX : " + v3 + ", MIN : " + v4);
		
		double value = 12.3456;
		double temp1 = value * 100;			// 1234.56
		long temp2 = Math.round(temp1);		// 반올림
		long temp3 = Math.round(5.7);		// 반올림
		System.out.println(temp2);
		System.out.println(temp3);
		
		double v5 = temp2 / 100.0;			// 소수점 이하 2자리를 얻음
		System.out.println(v5);
		
	}

}

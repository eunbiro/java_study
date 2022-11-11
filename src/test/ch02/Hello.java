package test.ch02;

import javax.security.auth.x500.X500Principal;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello! java!");
		// Ctrl + f11 > 	run 실행
		// Ctrl + -, = > 	확대 축소
		/**
		 얘도 주석. api 도큐먼트 작성할 때
		 */
//		int a = 10;	// 리터럴

		int var1 = 0b1011;	// 2진수
		int var2 = 0206;	// 8진수
		int var3 = 365;		// 10진수
		int var4 = 0xB3;	// 16진수
//		long var5 = 100000000000000L;
		long var6 = 100000000000000L;
		char c1 = 'A';
		char c2 = 65;
		
//		float var6 = 0.1234545546554F;
		float var7 = 0.1234545546554f;
		double var8 = 0.1234545546554;
		double var9 = 3e6;		// 3.0 * 10^6
		double var10 = 2e-3;	// 2.0 * 10^-3
		float var11 = 3e6f;		// 3.0 * 10^6
		
		boolean stop = true;
		
		int x = 10;
		boolean result1 = (x == 20);
		
		System.out.println(result1);
		
		if (stop) {
			System.out.println("정지합니다");
		}
		
		String name = "노은비";
		String one = "A";
		System.out.println(name);
		
//		System.out.println(var1 + ":" + var2 + ":" + var3 + ":" + var4);
//		System.out.println(var5 + var6);
//		System.out.println(c1 + "," + c2);
//		System.out.println(var7 + ", " + var8);
//		System.out.println(var9);
//		System.out.println(var10 + ", " + var11);
	}

}

package test.ch11.System;

import java.io.IOException;

public class InEx {

	public static void main(String[] args) throws IOException { //IOException : 입출력관련 에러
		int speed = 0;
		int keycode = 0;
		
		while (true) {
			
			if (keycode != 13 && keycode != 10) {	// enter키를 읽지 않았을 때
				if (keycode == 49) {				// 숫자 1 키를 읽었을 경우
					speed++;
					
				} else if (keycode == 50) {			// 숫자 2 키를 읽었을 경우
					speed--;
					
				} else if (keycode == 51) {			// 숫자 3 키를 읽었을 경우
					break;

				}
				
				System.out.println("=============================");
				System.out.println(" 1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("=============================");
				System.out.println("현재속도 : " + speed);
				System.out.println("선택 : ");
			}
			keycode = System.in.read();		// 키를 입력할 때마다 하나씩 읽음
		}
		
		System.out.println("프로그램 종료");
	}

}

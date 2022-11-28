package test.ch11.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		Date now = new Date();				// 현재 날짜와 시간 생성
		System.out.println(now);
		
		String strNow1 = now.toString();	// 문자열 변경
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분 ss초");	// 포맷형태 객체생성
		
		String strNow2 = sdf.format(now);	// Date객체를 넣어준다.
		System.out.println(strNow2);
	}

}

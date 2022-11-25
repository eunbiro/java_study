package test.ch11.Date;

import java.util.Calendar;
import java.util.TimeZone;

public class CalenderEx2 {

	public static void main(String[] args) {
			// 타임존 객체 생성
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		
		Calendar now = Calendar.getInstance(timeZone);			// 현재의 날짜와 시간을 가져온다.
		
		int year = now.get(Calendar.YEAR);				// 칼랜더.년도를 가져온다.
		int month = now.get(Calendar.MONTH) + 1;		// 칼랜더.월을 가져온다.
		int day = now.get(Calendar.DAY_OF_MONTH);		// 칼랜더.일을 가져온다.
		int week = now.get(Calendar.DAY_OF_WEEK);		// 칼랜더.요일을 숫자로 가져온다. > 일요일 : 1 ~ 토요일 : 7
		
		String strWeek = null;
		
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		}
		
		System.out.println(year + "-" + month + "-" + day + " " + strWeek + "요일");
		System.out.println("======================");
		int amPm = now.get(Calendar.AM_PM);
		System.out.println(amPm);
		System.out.println("======================");
		System.out.println(Calendar.AM);
		System.out.println(Calendar.PM);
		
		if (amPm == Calendar.AM) {
			System.out.print("오전 ");
			
		} else {
			System.out.print("오후 ");
		}
		
		System.out.println(now.get(Calendar.HOUR) + ":" + now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND));
			// HOUR : 오전 / 오후 기준(0 ~ 11)
		
	}

}

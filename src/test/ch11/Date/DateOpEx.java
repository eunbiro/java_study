package test.ch11.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateOpEx {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();		// 현재 날짜 시간
		
			// 데이터 포맷 형태
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		now.format(dtf);	// 위 패턴대로 포맷
		
		System.out.println(now.format(dtf));
		
		
		LocalDateTime result1 = now.plusYears(1);		// 현재 년도에 1을 더함
		System.out.println(result1.format(dtf));

		
		LocalDateTime result2 = now.minusMonths(2);		// 현재 월에 2를 뺌
		System.out.println(result2.format(dtf));
		
		LocalDateTime result3 = now.plusDays(7);		// 현재 일에 7을 더함
		System.out.println(result3.format(dtf));
		
		
	}

}

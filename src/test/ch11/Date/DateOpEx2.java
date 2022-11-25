package test.ch11.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateOpEx2 {

	public static void main(String[] args) {
			// 데이터 포맷 형태
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		LocalDateTime startDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0);		// 2021.1.1 0시 0분 0초
		System.out.println("시작일 : " + startDateTime.format(dtf));
		
		LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 31, 23, 59, 59);		// 2021.12.31 0시 0분 0초
		System.out.println("종료일 : " + endDateTime.format(dtf));
		
		if (startDateTime.isBefore(endDateTime)) {			// isBefore :  이전 날짜인지
			System.out.println("진행 중입니다.");
		} else if (startDateTime.isEqual(endDateTime)) {	// isEqual : 같은 날짜인지
			System.out.println("종료합니다.");
		} else if (startDateTime.isAfter(endDateTime)) {	// isAfter : 이후 날짜인지
			System.out.println("종료됐습니다.");
		}
		
	}

}

package test.ch05;

import java.util.Calendar;

public class WeekEX {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		
		// ������ ���ڷ� ��´�.
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		// ���ڸ� ���� ����� ��ȯ�ؼ� ������ ����.
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		if (today == Week.SUNDAY) {
			System.out.println("�Ͽ��� �Դϴ�.");
		} else {
			System.out.println("�Ͽ����� �ƴմϴ�.");
		}
	}

}

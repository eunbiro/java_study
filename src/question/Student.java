package question;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public float getAverage() {
		float avg = getTotal()/3f;
		avg = Math.round(avg * 100)/100f;
		return avg;
	}

	@Override
	public String toString() {
		return "이름 : " + name + "반 : " + ban + "번호 : " + no;
	}
	
	
}

package test.ch03;						
						
public class ConditinalOperator {						
						
	public static void main(String[] args) {					
						
//		int score = 85;				
//		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');				
//		System.out.println(score + "점은" + grade + "등급입니다.");				
						
	       int fahrenheit = 100;					
	       float celcius = (((int)(((float)5/9)*(fahrenheit - 32) * 1000))%10) >= 5 ?					
	    		   			(((int)(((float)5/9)*(fahrenheit - 32) * 1000)) + 1) / 1000f : 
	    		   			((int)(((float)5/9)*(fahrenheit - 32) * 1000)) / 1000f;
	       					
	       System.out.println("Fahrenheit:"+fahrenheit);					
	       System.out.println("Celcius:"+celcius);					
						
//		char ch = 'A';				
//        char lowerCase = (ch >= 65 && ch <= 90) ? (char)(ch + 32) : ch;						
//        System.out.println("ch:"+ch);						
//        System.out.println("ch to lowerCase:"+lowerCase);						
//						
//        int num = 0;						
//        System.out.println((num > 0 ? "양수" : num < 0 ? "음수" : 0));						
						
						
	}					
						
}						

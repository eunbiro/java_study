package test.ch07;			
			
public class SmartPhone extends phone{			
			
	public boolean wifi;		
			
	public SmartPhone(String model, String color) {		
		super();	// 부모 생성자 호출
		System.out.println("자식 생성자 실행");	
		this.model = model;	
		this.color = color;	
	}		
			
	public void setWifi(boolean wifi) {		
		this.wifi = wifi;	
		System.out.println("와이파이 상태 변경");	
	}		
			
	public void internet() {		
		System.out.println("인터넷에 연결합니다.");	
	}		
}			

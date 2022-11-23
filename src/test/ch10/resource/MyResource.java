package test.ch10.resource;

public class MyResource implements AutoCloseable {	// AutoCloseable : 리소스를 자동으로 닫아주는 기능을 사용하기 위한 인터페이스 
	
	private String name;
	
	
	public MyResource(String name) {
		this.name = name;
		System.out.println("MyResource " + name + " Open");
	}
	
		// 메소드
	public String read1() {
		System.out.println("MyResource " + name + " Read");
		return "100";
	}
	
	public String read2() {
		System.out.println("MyResource " + name + " Read");
		return "abc";
	}

	@Override
	public void close() throws Exception {			// 닫아주는 메소드
			// 파일을 닫을 때 실행하고 싶은 코드 작성
		System.out.println("MyResource " + name + " Close");
		
	}
	
}

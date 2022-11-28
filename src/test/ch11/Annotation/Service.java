package test.ch11.Annotation;

//@PrintAnnotation			//		{ElementType.TYPE}추가 후 사용 가능
public class Service {
	
//	@PrintAnnotation		//		{ElementType.FIELD}추가 후 사용 가능
	String test;
	
//	@PrintAnnotation		//		{ElementType.CONSTRUCTOR}추가 후 사용 가능
	public Service() {}
	
	
	
	@PrintAnnotation
	public void method1() {
		System.out.println("method1");
		
	}
	
	@PrintAnnotation
	public void method2() {
		System.out.println("method2");
		
	}
	
	@PrintAnnotation(value = "#", number = 20)
	public void method3() {
		System.out.println("method3");
		
	}
	
	
}

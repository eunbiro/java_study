package test.ch12.MethodGenneric;

public class GennericEx {

	public static <T> Box <T> boxing(T t) {
		Box<T> box = new Box<T>();
		
		box.set(t);
		return box;
	}
	
	
	public static void main(String[] args) {
		Box<Integer> box1 = boxing(100);
		
		int boxInt = box1.get();
		System.out.println(boxInt);
		
		Box<String> box2 = boxing("Hello");
		
		String boxStr = box2.get();
		System.out.println(boxStr);
	}

}

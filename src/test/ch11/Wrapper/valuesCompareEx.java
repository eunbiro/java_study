package test.ch11.Wrapper;

public class valuesCompareEx {

	public static void main(String[] args) {
		
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		int vaule1 = obj1;
		int vaule2 = obj2;

		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println();

		/*
		 [값을 비교하는 타입]
		  Boolean
		  Character
		  Byte, Short, Integer는 값이 -128 ~ 127 사이에 있으면 값을 비교하고 그 이상일 경우 주소를 비교한다.
		 */
		
		Integer obj3 = 10;
		Integer obj4 = 10;
		
		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4));
		System.out.println();
	}

}

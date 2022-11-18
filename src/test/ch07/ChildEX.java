package test.ch07;

public class ChildEX {

	public static void main(String[] args) {
		
		Parent parent = new Child();	// Auto casting
		
		// instanceof : Operators provided by Java to check object type
		// if parent does not contain child objects, no coercion is possible.
		
		
		Child child = (Child)parent;	// compulsion casting
		child.b = 1;					// child instance in field access possible
		child.method3();				// child instance in method access possible
		
		
/*
		// child instance
		Child child = new Child();
		Parent parent = child;		// Auto type convert
		parent.method1();
		parent.method2();			// override method call
		parent.method3();			// child instance in method is not call
		
		parent.a = 2;
		parent.b = 1;				// child instance in field is not call
 */
	}
}

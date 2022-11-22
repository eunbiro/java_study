package test.ch08.interfaceEx;

public class ExtendsEX {

	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		InterfaceA ia = impl;		// 자동 형변환
		ia.methodA();
		ia.methodB();		// X
		ia.methodC();		// X
		
		InterfaceB ib = impl;		// 자동 형변환
		ib.methodA();		// X
		ib.methodB();
		ib.methodC();		// X
		
		// InterfaceC는 InterfaceA, InterfaceB를 상속으로 받았으므로 아래와 같이 호출가능
		InterfaceC ic = impl;		// 자동 형변환
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}

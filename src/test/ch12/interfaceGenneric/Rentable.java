package test.ch12.interfaceGenneric;

public interface Rentable<P> {
	
	P rent();		// Type이 정해지지않은 추상메소드(제너릭 추상메소드)
}

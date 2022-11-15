package test.ch06.hyundai;

import test.ch06.hankook.SnowTire;
import test.ch06.kumho.AllSeasonTire;

public class Car {
	// 다른 패키지에 있는 class는 반드시 패키지 import를 해줘야한다.
	SnowTire snowT = new SnowTire();
	AllSeasonTire allT = new AllSeasonTire();
	
	// 같은 패키지에 있는 class는 import 안해줘도 됨
	Test test = new Test();
	
	// 이렇게 쓰면 import는 딱히 안해줘도 됨
	test.ch06.hankook.Tire tire1 = new test.ch06.hankook.Tire();
}

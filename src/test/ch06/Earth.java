package test.ch06;

public class Earth {
	// ���(�������� �빮�ڷ� ����)
	// final : ���� ����X, static : ���� ����
	static final double EARTH_RADIUS = 6400;		// ���� �ѷ�
	static final double EARTH_SURFACE_AREA;
	
	// static : static �ʵ带 �ʱ�ȭ ���� �� ���
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	
}

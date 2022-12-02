package test.ch13.multiThread;

public class ThreadNameEx {
	
	public static void main (String[] args) {
			// main 스레드 이름 가져오기
		Thread mainThread = Thread.currentThread();				// main 스레드를 얻어온다. 
		System.out.println(mainThread.getName());
		
			// 스레드 3개 생성
		for (int i = 0; i < 3; i++) {
			Thread threadA = new Thread() {
				
				@Override
				public void run() {
					System.out.println(getName() + "실행");		// 스레드 이름을 가져온다.
				}
			};
			
			threadA.start();
		}
		
		// chat쓰레드 생성
		Thread chatThread = new Thread() {
			
			@Override
			public void run() {
				System.out.println(getName() + "실행");			// 스레드 이름을 가져온다.
			}
		};
		
		chatThread.setName("chat-thread");						// 스레드가 실행되기 전에 이름을 바꾼다.
		chatThread.start();
		
	}
}

package test.ch09.noname;

public class Home {
		/* 객체생성에서 익명사용 */
	private RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TVfmf zuqslek.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TVfmf Rmqslek.");
		}
	};
	
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
		/* 메서드내에서 익명사용 */
	public void use2() {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("AriControldmf zuqslek.");	
			}
			
			@Override
			public void turnOff() {
				System.out.println("AriControldmf Rmqslek.");	
			}
		};
		
		rc.turnOn();
		rc.turnOff();
	}
	
		/* 매개변수를 통해 익명사용 */
	public void use3(RemoteControl remoteControl) {
		remoteControl.turnOn();
		remoteControl.turnOff();
	}
}

package test.ch16.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteEx {

	public static void main(String[] args) {
		try {
				// 출력하는 스트림
			FileOutputStream fo = new FileOutputStream("C:/Temp/test1.db");		// 파일을 만든다
			
			byte a = 10;
			byte b = 20;
			byte C = 30;
			
			fo.write(a);	// 1byte씩 버퍼에 모아놓는다.
			fo.write(b);
			fo.write(C);
			
			fo.flush();		// buffer에 있는 byte를 출력하고 buffer를 비움(test1.db에 작성된다.)
			
			fo.close();		// 출력 스트림은 반드시 달아서 사용한 메모리를 해제한다.
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

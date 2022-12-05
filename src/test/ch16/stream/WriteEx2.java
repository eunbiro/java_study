package test.ch16.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteEx2 {

	public static void main(String[] args) {
		try {
				// 출력하는 스트림
			FileOutputStream fo = new FileOutputStream("C:/Temp/test2.db");		// 파일을 만든다
			
			byte[] array = { 10, 20, 30 };
			
			fo.write(array);
			
			fo.flush();		// buffer에 있는 byte를 출력하고 buffer를 비움(test2.db에 작성된다.)
							// 파일이 작성 되면서 비우는 느낌
			
			fo.close();		// 출력 스트림은 반드시 달아서 사용한 메모리를 해제한다.
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

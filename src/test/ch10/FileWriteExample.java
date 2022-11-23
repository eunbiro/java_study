package test.ch10;

import java.io.IOException;

public class FileWriteExample {

	public static void main(String[] args) throws Exception {
		try(FileWriter fw = new FileWriter("file.txt")) {
			fw.write("Java");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

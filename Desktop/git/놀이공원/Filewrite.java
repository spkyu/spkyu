package Ticketing;

import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {

	public void filewrite(String abc) {

		try {
			FileWriter fw = new FileWriter("C:\\Users\\kopo\\Desktop\\test.csv", true);
			fw.write(abc);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

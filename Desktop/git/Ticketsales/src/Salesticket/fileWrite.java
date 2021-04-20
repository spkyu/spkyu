package Salesticket;

import java.io.FileWriter;
import java.io.IOException;



public class fileWrite {
	public void filewrite(String abc) {

		try {
			FileWriter fw = new FileWriter(Numberss.adress, true);
			fw.write(abc);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

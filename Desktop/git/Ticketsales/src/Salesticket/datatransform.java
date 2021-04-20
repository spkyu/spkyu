package Salesticket;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class datatransform {

	public String[][] Stringarr() throws Exception {

		String line = "";

		String[][] indat = new String[10000][6];
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\kopo\\Desktop\\test.csv"));
		int row=Numberss.row
		;
		while ((line = reader.readLine()) != null) {
			for (int z = 0; z < 6; z++) {
				String[] arr = line.split(",");
				indat[row][z] = arr[z];

			}

			row++;
			Numberss.row++;
 
		}
		return indat;

	}
}

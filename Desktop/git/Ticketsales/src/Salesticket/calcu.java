package Salesticket;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class calcu {

	public void calday() throws IOException {
		ArrayList<String> array = new ArrayList();
		Scanner scan = new Scanner(System.in);

		String[][] indat = new String[10000][6];
		System.out.println("원하는 조회날짜를 입력해 주십시오." + "ex)2021.04.20");
		int sumday = 0;
		int sumnight = 0;
		int countday = 0;
		int countnight = 0;
		String today = "";
		String strday = "";
		String strnight = "";
		String line = "";

		BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\kopo\\eclipse-workspace\\Amunsement\\test.csv"));
		int row = 0;
		while ((line = reader.readLine()) != null) {
			for (int z = 0; z < 6; z++) {
				String[] arr = line.split(",");
				indat[row][z] = arr[z];
				// System.out.println(line);
				// System.out.print(arr[z]);

			}
			System.out.println();
			row++;

		}
		String date = scan.nextLine();
		
		for (int i= 0; i < row-1; i++) {

			if (indat[i][0].equals(date) && indat[i][1].equals("주간")) {
				sumday += Integer.parseInt(indat[i][4]);
				countday += Integer.parseInt(indat[i][3]);
				today = indat[i][0];
				strday = "주간" + today + "주간합계" + sumday + "주간매수" + countday;

			} else if (indat[i][0].equals(date) && indat[i][1].equals("야간")) {
				sumnight += Integer.parseInt(indat[i][4]);
				countnight += Integer.parseInt(indat[i][3]);
				today = indat[i][0];
				strnight = "야간" + today + "야간합계" + sumnight + "야간매수" + countnight;

			}

		}
		System.out.println(strday);
		System.out.println(strnight);
	}

}

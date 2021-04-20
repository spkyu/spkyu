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

		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\kopo\\Desktop\\test.csv"));
		int row = 0;
		while ((line = reader.readLine()) != null) {
			for (int z = 0; z < 6; z++) {
				String[] arr = line.split(",");
				indat[row][z] = arr[z];
				// System.out.println(line);
				// System.out.print(arr[z]);

			}

			row++;

		}
		String date = scan.nextLine();

		for (int i = 0; i < row - 1; i++) {

			if (indat[i][0].equals(date) && indat[i][1].equals("주간")) {
				sumday += Integer.parseInt(indat[i][4]);
				countday += Integer.parseInt(indat[i][3]);
				today = indat[i][0];

			} else if (indat[i][0].equals(date) && indat[i][1].equals("야간")) {
				sumnight += Integer.parseInt(indat[i][4]);
				countnight += Integer.parseInt(indat[i][3]);
				today = indat[i][0];

			}

		}
		int amounttket_day_new = 0;
		int amounttket_day_child = 0;
		int amounttket_day_teenager = 0;
		int amounttket_day_adult = 0;
		int amounttket_day_senior = 0;
		for (int i = 0; i < row - 1; i++) {
			if (indat[i][1].equals("주간") && indat[i][2].equals("유아")) {
				amounttket_day_new += Integer.parseInt(indat[i][3]);
			} else if (indat[i][1].equals("주간") && indat[i][2].equals("청소년")) {
				amounttket_day_teenager += Integer.parseInt(indat[i][3]);
			} else if (indat[i][1].equals("주간") && indat[i][2].equals("소아")) {
				amounttket_day_child += Integer.parseInt(indat[i][3]);
			} else if (indat[i][1].equals("주간") && indat[i][2].equals("대인")) {
				amounttket_day_adult += Integer.parseInt(indat[i][3]);
			} else if (indat[i][1].equals("주간") && indat[i][2].equals("노인")) {
				amounttket_day_senior += Integer.parseInt(indat[i][3]);
			}
		}
		int amounttket_night_new = 0;
		int amounttket_night_child = 0;
		int amounttket_night_teenager = 0;
		int amounttket_night_adult = 0;
		int amounttket_night_senior = 0;
		for (int i = 0; i < row - 1; i++) {
			if (indat[i][1].equals("야간") && indat[i][2].equals("유아")) {
				amounttket_night_new += Integer.parseInt(indat[i][3]);
			} else if (indat[i][1].equals("야간") && indat[i][2].equals("청소년")) {
				amounttket_night_teenager += Integer.parseInt(indat[i][3]);
			} else if (indat[i][1].equals("야간") && indat[i][2].equals("소아")) {
				amounttket_night_child += Integer.parseInt(indat[i][3]);
			} else if (indat[i][1].equals("야간") && indat[i][2].equals("대인")) {
				amounttket_night_adult += Integer.parseInt(indat[i][3]);
			} else if (indat[i][1].equals("야간") && indat[i][2].equals("노인")) {
				amounttket_night_senior += Integer.parseInt(indat[i][3]);
			}
		}

		strday = today + "," + "주" + "," + sumday + "," + countday + "(" + amounttket_day_new + ","
				+ amounttket_day_child + "," + amounttket_day_teenager + "," + amounttket_day_adult + "," + ""
				+ amounttket_day_senior + ")";
		strnight = today + "," + "야" + "," + sumnight + "," + countnight + "(" + amounttket_night_new + ","
				+ amounttket_night_child + "," + amounttket_night_teenager + "," + amounttket_night_adult + ","
				+ amounttket_night_senior + ")";

		fileWrite fwfw = new fileWrite();
		String head = "날짜/" + "주야구분/" + "판매금액/" + "매수(유아 소아 청소년 대인 노인)";
		System.out.println(head);
		System.out.println(strday);
		System.out.println(strnight);
		fwfw.filewrite(head + "\n" + strday + "\n" + strnight + "\n");
	}

}

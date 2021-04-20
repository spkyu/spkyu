package Salesticket;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class calcu {

	public void calday() throws Exception {
		Scanner scan = new Scanner(System.in);
		calcu cal = new calcu();
		// String[][] indat = new String[10000][6];
		System.out.println("원하는 조회날짜를 입력해 주십시오." + "ex)2021.04.20");
		Numberss.date = cal.date();
		int sumday = 0;
		int sumnight = 0;
		int countday = 0;
		int countnight = 0;
		String today = "";
		String strday = "";
		String strnight = "";
		String line = "";

		datatransform dataform = new datatransform();
		Numberss.indat = dataform.Stringarr();

		sumday = cal.sumday();
		countday = cal.countday();
		today = cal.today();
		sumnight = cal.sumnight();
		countnight = cal.countnight();

		int amounttket_day_new = cal.amounttket_day_new();
		int amounttket_day_teenager = cal.amounttket_day_teenager();
		int amounttket_day_child = cal.amounttket_day_child();
		int amounttket_day_adult = cal.amounttket_day_adult();
		int amounttket_day_senior = cal.amounttket_day_senior();

		int amounttket_night_new = cal.amounttket_night_new();
		int amounttket_night_teenager = cal.amounttket_night_teenager();
		int amounttket_night_child = cal.amounttket_night_child();
		int amounttket_night_adult = cal.amounttket_night_adult();
		int amounttket_night_senior = cal.amounttket_night_senior();

		ArrayPrint array = new ArrayPrint();

		String head = array.head();
		strday = array.Arrayprintday(today, sumday, countday, amounttket_day_new, amounttket_day_child,
				amounttket_day_teenager, amounttket_day_adult, amounttket_day_senior);
		strnight = array.Arrayprintnight(today, sumnight, countnight, amounttket_night_new, amounttket_night_child,
				amounttket_night_teenager, amounttket_night_adult, amounttket_night_senior);
		fileWrite fwfw = new fileWrite();
		fwfw.filewrite(head + "\n" + strday + "\n" + strnight + "\n");
	}

	public int sumday() throws Exception {
		String date = Numberss.date;
		int sumday = 0;
		for (int i = 0; i < Numberss.row; i++) {
			if (Numberss.indat[i][0].equals(date) && Numberss.indat[i][1].equals("주간"))
				sumday += Integer.parseInt(Numberss.indat[i][4]);
		}
		return sumday;
	}

	public int countday() throws Exception {

		String date = Numberss.date;

		int countday = 0;

		for (int i = 0; i < Numberss.row; i++) {
			if (Numberss.indat[i][0].equals(date) && Numberss.indat[i][1].equals("주간"))
				countday += Integer.parseInt(Numberss.indat[i][3]);
		}
		return countday;
	}

	public String today() throws Exception {

		String date = Numberss.date;

		String today = "";

		for (int i = 0; i < Numberss.row; i++) {
			if (Numberss.indat[i][0].equals(date)) {

				today = Numberss.indat[i][0];
			}
		}
		return today;
	}

	public int sumnight() throws Exception {

		String date = Numberss.date;
		int sumnight = 0;
		for (int i = 0; i < Numberss.row; i++) {
			if (Numberss.indat[i][0].equals(date) && Numberss.indat[i][1].equals("야간"))
				sumnight += Integer.parseInt(Numberss.indat[i][4]);
		}
		return sumnight;
	}

	public int countnight() throws Exception {

		String date = Numberss.date;

		int countnight = 0;

		for (int i = 0; i < Numberss.row; i++) {
			if (Numberss.indat[i][0].equals(date) && Numberss.indat[i][1].equals("야간"))
				countnight += Integer.parseInt(Numberss.indat[i][3]);
		}
		return countnight;
	}

	public String date() throws Exception {
		Scanner scan = new Scanner(System.in);
		String date = "";
		date = scan.nextLine();

		return date;

	}

	public int amounttket_night_new() throws Exception {

		int amounttket_night_new = 0;
		for (int i = 0; i < Numberss.row; i++) {
			if (Numberss.indat[i][1].equals("야간") && Numberss.indat[i][2].equals("유아")) {
				amounttket_night_new += Integer.parseInt(Numberss.indat[i][3]);
			}

		}
		return amounttket_night_new;

	}

	public int amounttket_night_teenager() throws Exception {

		int amounttket_night_teenager = 0;
		for (int i = 0; i < Numberss.row; i++) {
			if (Numberss.indat[i][1].equals("야간") && Numberss.indat[i][2].equals("청소년")) {
				amounttket_night_teenager += Integer.parseInt(Numberss.indat[i][3]);
			}

		}
		return amounttket_night_teenager;

	}

	public int amounttket_night_child() throws Exception {

		int amounttket_night_child = 0;
		for (int i = 0; i < Numberss.row; i++) {
			if (Numberss.indat[i][1].equals("야간") && Numberss.indat[i][2].equals("소아")) {
				amounttket_night_child += Integer.parseInt(Numberss.indat[i][3]);
			}

		}
		return amounttket_night_child;
	}

	public int amounttket_night_adult() throws Exception {

		int amounttket_night_adult = 0;
		for (int i = 0; i < Numberss.row; i++) {
			if (Numberss.indat[i][1].equals("야간") && Numberss.indat[i][2].equals("대인")) {
				amounttket_night_adult += Integer.parseInt(Numberss.indat[i][3]);
			}

		}
		return amounttket_night_adult;
	}

	public int amounttket_night_senior() throws Exception {

		int amounttket_night_senior = 0;
		for (int i = 0; i < Numberss.row; i++) {
			if (Numberss.indat[i][1].equals("야간") && Numberss.indat[i][2].equals("노인")) {
				amounttket_night_senior += Integer.parseInt(Numberss.indat[i][3]);
			}

		}
		return amounttket_night_senior;
	}

	public int amounttket_day_new() throws Exception {

		int amounttket_day_new = 0;
		for (int i = 0; i < Numberss.row; i++) {
			if (Numberss.indat[i][1].equals("주간") && Numberss.indat[i][2].equals("유아")) {
				amounttket_day_new += Integer.parseInt(Numberss.indat[i][3]);
			}

		}
		return amounttket_day_new;

	}

	public int amounttket_day_teenager() throws Exception {

		int amounttket_day_teenager = 0;
		for (int i = 0; i < Numberss.row; i++) {
			if (Numberss.indat[i][1].equals("주간") && Numberss.indat[i][2].equals("청소년")) {
				amounttket_day_teenager += Integer.parseInt(Numberss.indat[i][3]);
			}

		}
		return amounttket_day_teenager;

	}

	public int amounttket_day_child() throws Exception {

		int amounttket_day_child = 0;
		for (int i = 0; i < Numberss.row; i++) {
			if (Numberss.indat[i][1].equals("주간") && Numberss.indat[i][2].equals("소아")) {
				amounttket_day_child += Integer.parseInt(Numberss.indat[i][3]);
			}

		}
		return amounttket_day_child;
	}

	public int amounttket_day_adult() throws Exception {

		int amounttket_day_adult = 0;
		for (int i = 0; i < Numberss.row; i++) {
			if (Numberss.indat[i][1].equals("주간") && Numberss.indat[i][2].equals("대인")) {
				amounttket_day_adult += Integer.parseInt(Numberss.indat[i][3]);
			}

		}
		return amounttket_day_adult;
	}

	public int amounttket_day_senior() throws Exception {

		int amounttket_day_senior = 0;
		for (int i = 0; i < Numberss.row; i++) {
			if (Numberss.indat[i][1].equals("주간") && Numberss.indat[i][2].equals("노인")) {
				amounttket_day_senior += Integer.parseInt(Numberss.indat[i][3]);
			}

		}
		return amounttket_day_senior;
	}
}

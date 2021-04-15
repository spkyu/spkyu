package exchagemoney;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class OutputclassEuro {
	public void changeToEUR(double KORmoney) {// usd 얼마를 바꿀지 매소드
		OutputclassEuro euro = new OutputclassEuro();

		double ReturnMoney;
		double Change, ChangedMoney;
		ReturnMoney = KORmoney / 상수.EUR_RATE;
		if (checkBalanceEUR(ReturnMoney)) {
			euro.outputResultEUR(ReturnMoney);

			Change = ReturnMoney % 1;
			ChangedMoney = Math.floor(Change * 상수.EUR_RATE);
			euro.outputResultWon(ChangedMoney);
			상수.BALANCE_EUR -= ReturnMoney;
		} else {
			euro.printErrorMessage(ReturnMoney);
		}
	}

	private boolean checkBalanceEUR(double requestEUR) {
		if (requestEUR <= 상수.EUR_RATE) {
			return true;
		} else {
			return false;
		}
	}

	public void printErrorMessage(double a) {

		System.out.println("잔고부족 남은잔액" + 상수.BALANCE_EUR + "유로 환전을 실행하지않음");
		Filewrite fwfw = new Filewrite();
		String str = "잔고부족 남은잔액" + 상수.BALANCE_EUR + "유로 환전을 실행하지않음" + "\r\n";
		try {
			fwfw.filewrite(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void outputResultEUR(double ReturnMoney) {
		double OutPutMoney;
		double realbill2, realbill3, realbill4;
		double realbill5;

		OutPutMoney = Math.floor(ReturnMoney / 200);
		realbill2 = Math.floor((ReturnMoney - OutPutMoney * 200) / 100);
		realbill3 = Math.floor((ReturnMoney - OutPutMoney * 200 - realbill2 * 100) / 50);
		realbill4 = Math.floor((ReturnMoney - OutPutMoney * 200 - realbill2 * 100 - realbill3 * 50) / 10);
		realbill5 = Math
				.floor(((ReturnMoney - OutPutMoney * 200 - realbill2 * 100 - realbill3 * 50 - realbill4 * 10) / 5));
		printResultEUR(ReturnMoney, OutPutMoney, realbill2, realbill3, realbill4, realbill5);

	}

	public void printResultEUR(double ReturnMoney, double OutPutMoney, double realbill2, double realbill3,
			double realbill4, double realbill5) {
		Calendar calt = Calendar.getInstance();
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		Filewrite fwfw = new Filewrite();

		System.out.println(sdt.format(calt.getTime()));
		System.out.println("환전결과:	" + Math.floor(ReturnMoney) + " euro" + "\n");
		System.out.print("	200 euro " + OutPutMoney);
		System.out.print("	100 euro " + realbill2);
		System.out.print("	50 euro " + realbill3);
		System.out.print("	10 euro " + realbill4);
		System.out.println("	5 euro " + realbill5);
		String str = sdt.format(calt.getTime()) + "\r\n" + "환전결과 :" + Math.floor(ReturnMoney) + " euro" + "\r\n"
				+ "	200 euro " + OutPutMoney + "	100 euro " + realbill2 + "	50 euro " + realbill3 + "	10 euro "
				+ realbill4 + "	5 euro " + realbill5 + "\r\n";

		try {
			fwfw.filewrite(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void printResultWon(double ChangedMoney, double korchange1, double korchange2, double korchange3,
			double korchange4) {
		Filewrite fwfw = new Filewrite();
		System.out.println("\n" + "잔돈:	" + ChangedMoney + " WON" + "\n");
		System.out.print("	500 WON " + korchange1);
		System.out.print("	100 WON " + korchange2);
		System.out.print("	50 WON " + korchange3);
		System.out.println("	10 WON " + korchange4);
		String str = "\r\n" + "잔돈:	" + ChangedMoney + " WON" + "\r\n" + "	500 WON " + korchange1 + "	100 WON "
				+ korchange2 + "	50 WON " + korchange3 + "	10 WON " + korchange4 + "\r\n";

		try {
			fwfw.filewrite(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void outputResultWon(double ChangedMoney) {
		double korchange1, korchange2, korchange3, korchange4;

		korchange1 = Math.floor(ChangedMoney / 500);
		korchange2 = Math.floor((ChangedMoney - korchange1 * 500) / 100);
		korchange3 = Math.floor((ChangedMoney - korchange1 * 500 - korchange2 * 100) / 50);
		korchange4 = Math.floor((ChangedMoney - korchange1 * 500 - korchange2 * 100 - korchange3 * 50) / 10);

		printResultWon(ChangedMoney, korchange1, korchange2, korchange3, korchange4);

	}
}

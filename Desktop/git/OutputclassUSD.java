package exchagemoney;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class OutputclassUSD {
	public void changeToUSD(double KORmoney) {// usd 얼마를 바꿀지 매소드
		OutputclassUSD usd = new OutputclassUSD();

		double ReturnMoney;
		double Change, ChangedMoney;
		ReturnMoney = KORmoney / 상수.USD_RATE;
		if (checkBalanceUSD(ReturnMoney)) {
			usd.outputResultUSD(ReturnMoney);

			Change = ReturnMoney % 1;
			ChangedMoney = Math.floor(Change * 상수.USD_RATE);
			usd.outputResultWon(ChangedMoney);
			상수.BALANCE_USD -= ReturnMoney;
		} else {
			usd.printErrorMessage(ReturnMoney);
		}
	}

	private boolean checkBalanceUSD(double requestUSD) {
		if (requestUSD <= 상수.BALANCE_USD) {
			return true;
		} else {
			return false;
		}
	}

	public void printErrorMessage(double a) {
		System.out.println("잔고부족 남은잔액" + 상수.BALANCE_USD + "달러 환전을 실행하지않음");
		Filewrite fwfw = new Filewrite();
		String str = "잔고부족 남은잔액" + 상수.BALANCE_USD + "달러 환전을 실행하지않음" + "\r\n";
		try {
			fwfw.filewrite(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void outputResultUSD(double ReturnMoney) {
		double OutPutMoney;
		double realbill2, realbill3, realbill4;
		double realbill5;

		OutPutMoney = Math.floor(ReturnMoney / 100);
		realbill2 = Math.floor((ReturnMoney - OutPutMoney * 100) / 50);
		realbill3 = Math.floor((ReturnMoney - OutPutMoney * 100 - realbill2 * 50) / 10);
		realbill4 = Math.floor((ReturnMoney - OutPutMoney * 100 - realbill2 * 50 - realbill3 * 10) / 5);
		realbill5 = Math
				.floor(((ReturnMoney - OutPutMoney * 100 - realbill2 * 50 - realbill3 * 10 - realbill4 * 5) / 1));

		printResultUSD(ReturnMoney, OutPutMoney, realbill2, realbill3, realbill4, realbill5);

	}

	public void printResultUSD(double ReturnMoney, double OutPutMoney, double realbill2, double realbill3,
			double realbill4, double realbill5) {
		Calendar calt = Calendar.getInstance();
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		Filewrite fwfw = new Filewrite();
		System.out.println(sdt.format(calt.getTime()));
		System.out.println("환전결과: " + Math.floor(ReturnMoney) + " dollar" + "\n");
		System.out.print("	100 dollar " + OutPutMoney);
		System.out.print("	50 dollar " + realbill2);
		System.out.print("	10 dollar " + realbill3);
		System.out.print("	5 dollar " + realbill4);
		System.out.println("	1 dollar " + realbill5);
		String str = sdt.format(calt.getTime())+"\r\n" + "환전결과: " + Math.floor(ReturnMoney) + " dollar" + "\n" + "	100 dollar "
				+ OutPutMoney + "	50 dollar " + realbill2 + "	10 dollar " + realbill3 + "	5 dollar " + realbill4
				+ "	1 dollar " + realbill5+"\r\n";
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

	public void printResultWon(double ChangedMoney, double korchange1, double korchange2, double korchange3,
			double korchange4) {
		Filewrite fwfw = new Filewrite();
		System.out.println("\n" + "잔돈:	" + ChangedMoney + " WON" + "\n");
		System.out.print("	500 WON " + korchange1);
		System.out.print("	100 WON " + korchange2);
		System.out.print("	50 WON " + korchange3);
		System.out.println("	10 WON " + korchange4);
		String str = "\n" + "잔돈:	" + ChangedMoney + " WON" + "\r\n" + "	500 WON " + korchange1 + "	100 WON "
				+ korchange2 + "	50 WON " + korchange3 + "	10 WON " + korchange4+"\r\n";

		try {
			fwfw.filewrite(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

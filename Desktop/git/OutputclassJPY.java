package exchagemoney;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class OutputclassJPY {

	public void changeToJPY(double KORmoney) {// usd 얼마를 바꿀지 매소드
		OutputclassJPY jpy = new OutputclassJPY();

		double ReturnMoney;
		double Change, ChangedMoney;
		ReturnMoney = KORmoney / 상수.JPY_RATE;
		if (checkBalanceJPY(ReturnMoney)) {
			jpy.outputResultJPY(ReturnMoney);

			Change = ReturnMoney % 1;
			ChangedMoney = Math.floor(Change * 상수.JPY_RATE);
			jpy.outputResultWon(ChangedMoney);
			상수.BALANCE_JPY -= ReturnMoney;
		} else {
			jpy.printErrorMessage(ReturnMoney);
		}
	}

	public void printErrorMessage(double a) {
		System.out.println("잔고부족 남은잔액" + 상수.BALANCE_JPY + "엔 환전을 실행하지않음");
		Filewrite fwfw = new Filewrite();
		String str = "잔고부족 남은잔액" + 상수.BALANCE_JPY + "엔 환전을 실행하지않음" + "\r\n";
		try {
			fwfw.filewrite(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	private boolean checkBalanceJPY(double requestJPY) {
		if (requestJPY <= 상수.BALANCE_JPY) {
			return true;
		} else {
			return false;
		}
	}

	public void outputResultJPY(double ReturnMoney) {
		double OutPutMoney;
		double realbill2, realbill3, realbill4;
		double realbill5;

		OutPutMoney = Math.floor(ReturnMoney / 10000);
		realbill2 = Math.floor((ReturnMoney - OutPutMoney * 10000) / 5000);
		realbill3 = Math.floor((ReturnMoney - OutPutMoney * 10000 - realbill2 * 5000) / 2000);
		realbill4 = Math.floor((ReturnMoney - OutPutMoney * 10000 - realbill2 * 5000 - realbill3 * 2000) / 1000);
		printResultJPY(ReturnMoney, OutPutMoney, realbill2, realbill3, realbill4);

	}

	public void printResultJPY(double ReturnMoney, double OutPutMoney, double realbill2, double realbill3,
			double realbill4) {
		Calendar calt = Calendar.getInstance();
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		Filewrite fwfw = new Filewrite();
		System.out.println(sdt.format(calt.getTime()));
		System.out.println("환전결과:	" + Math.floor(ReturnMoney) + " JPY" + "\n");
		System.out.print("	10000 JPY " + OutPutMoney);
		System.out.print("	5000 JPY " + realbill2);
		System.out.print("	2000 JPY " + realbill3);
		System.out.println("	1000 JPY " + realbill4);

		String str = sdt.format(calt.getTime())+"\r\n" + "환전결과:	" + Math.floor(ReturnMoney) + " JPY" + "\r\n" + "	10000 JPY "
				+ OutPutMoney + "	5000 JPY " + realbill2 + "	2000 JPY " + realbill3 + "	1000 JPY " + realbill4+"\r\n";

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
				+ korchange2 + "	50 WON " + korchange3 + "	10 WON " + korchange4+"\r\n";
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

package exchagemoney;

import java.io.IOException;
import java.util.Scanner;

public class imoirtcalse {
	public double inputfromclass() {
		Scanner scan = new Scanner(System.in);
		Filewrite fwfw = new Filewrite();
		double KORmoney;
		System.out.println("바꾸자고 하는 원화");
		KORmoney = scan.nextDouble();
		String str = "바꾸자고 하는 원화" + "\r\n" + KORmoney+ "\r\n";
		try {
			fwfw.filewrite(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return KORmoney;

	}

	public int inputfromclass2() {
		Scanner scan = new Scanner(System.in);
		Filewrite fwfw = new Filewrite();
		int kindmoney = 0;
		System.out.println("어떤종류로 바꾸시겠습니까?" + "		1.USD " + "		2.EURO " + "		3.JPY ");
		kindmoney = scan.nextInt();

		String str = "어떤종류로 바꾸시겠습니까?" + "		1.USD " + "		2.EURO " + "		3.JPY " + "\r\n" + kindmoney+ "\r\n";
		try {
			fwfw.filewrite(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return kindmoney;
	}

}

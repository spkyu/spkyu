package Ticketing;

import java.util.Scanner;

public class Inputclass {

	public int inputday() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �����ϼ���.\n" + "1. �ְ���\n" + "2. �߰���");
		int daynight = scan.nextInt();
		return daynight;
	}

	public int ammount() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ƽ���� ���屸���Ͻðڽ��ϱ�?");
		int amountticket = scan.nextInt();

		return amountticket;
	}

	public int discount() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� �����ϼ���.\n" + "1. ����\n" + "2. �����\n" + "3. ����������\n" + "4. ���ڳ� \n" + "5. �ӻ��");
		int discount = scan.nextInt();

		return discount;
	}

	public int agedata() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ���.");
		String agedata = scan.next();
		int realage = Integer.parseInt(agedata.substring(0, 2));
		return realage;
	}

	public int continuee() {
		Scanner scan = new Scanner(System.in);
		System.out.println("��ӹ߱��Ͻðٽ��ϱ�" + "1. Ƽ�Ϲ߱�" + "2.����");
		int countinue = scan.nextInt();
		return countinue;
	}
}

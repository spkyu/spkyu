package Ticketing;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Mainticket {
	
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> arralist = new ArrayList();
		Scanner scan = new Scanner(System.in);
		Filewrite fwfw = new Filewrite();
		//Calendar calt = Calendar.getInstance();
		//SimpleDateFormat sdt = new SimpleDateFormat("YYYY.MM.dd");
		Cacuage calage= new Cacuage();
		Cacuage discountt =new Cacuage();
		Printarray arrayee = new Printarray();
		int totalsum = 0;
		int count = 0;
		String strdaynight = "";
		String strold = "";
		String strdiscount = "";
		int ticketprice = 0;
		
		int daynight;
		String agedata;
		int amountticket;
		int discount;
		int countinue;
		
		while (true) {
			System.out.println("������ �����ϼ���.\n" + "1. �ְ���\n" + "2. �߰���");
			daynight = scan.nextInt();
			System.out.println("�ֹι�ȣ�� �Է��ϼ���.");
			agedata = scan.next();
			System.out.println("Ƽ���� ���屸���Ͻðڽ��ϱ�?");
			amountticket = scan.nextInt();
			System.out.println("�������� �����ϼ���.\n" + "1. ����\n" + "2. �����\n" + "3. ����������\n" + "4. ���ڳ� \n" + "5. �ӻ��");
			discount = scan.nextInt();

			int realage = Integer.parseInt(agedata.substring(0, 2));

			
			if (daynight == 1) {
				strdaynight = "�ְ�";
				ticketprice = calage.calage(realage,amountticket);
				
				ticketprice= discountt.discount(discount, ticketprice);
				strdiscount= discountt.discountString(discount);
				strold=discountt.ageString(realage);
				
			}
			
			else if (daynight == 2) {
				strdaynight = "�߰�";
				ticketprice = calage.calage(realage,amountticket);
				
				ticketprice= discountt.discount(discount, ticketprice);
				strdiscount= discountt.discountString(discount);
				strold=discountt.ageString(realage);
			}
			
			totalsum += ticketprice;
			count++;
			
			
			ArrayList<String> arralist=arrayee.printarray(strdaynight, strold, amountticket, ticketprice, strdiscount);
			
			System.out.println("�հ�ݾ�" + ticketprice);
			System.out.println("��ӹ߱��Ͻðٽ��ϱ�" + "1. Ƽ�Ϲ߱�" + "2.����");
			countinue = scan.nextInt();
			// �߱ǳ��� �����ֱ�
			if (countinue == 2) {
				System.out.println("�߱ǳ���\n");
				for (int z = 0; z < count; z++)
					System.out.println(arralist);

				System.out.printf("����� �Ѿ�: %8d ", totalsum);
				try {
					for (int z = 0; z < count; z++) {
						fwfw.filewrite(arralist + "\r\n");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;

			}

		}
	}
}

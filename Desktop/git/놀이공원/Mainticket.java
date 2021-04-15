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
			System.out.println("권종을 선택하세요.\n" + "1. 주간권\n" + "2. 야간권");
			daynight = scan.nextInt();
			System.out.println("주민번호를 입력하세요.");
			agedata = scan.next();
			System.out.println("티켓을 몇장구매하시겠습니까?");
			amountticket = scan.nextInt();
			System.out.println("우대사항을 선택하세요.\n" + "1. 없음\n" + "2. 장애인\n" + "3. 국가유공자\n" + "4. 다자녀 \n" + "5. 임산부");
			discount = scan.nextInt();

			int realage = Integer.parseInt(agedata.substring(0, 2));

			
			if (daynight == 1) {
				strdaynight = "주간";
				ticketprice = calage.calage(realage,amountticket);
				
				ticketprice= discountt.discount(discount, ticketprice);
				strdiscount= discountt.discountString(discount);
				strold=discountt.ageString(realage);
				
			}
			
			else if (daynight == 2) {
				strdaynight = "야간";
				ticketprice = calage.calage(realage,amountticket);
				
				ticketprice= discountt.discount(discount, ticketprice);
				strdiscount= discountt.discountString(discount);
				strold=discountt.ageString(realage);
			}
			
			totalsum += ticketprice;
			count++;
			
			
			ArrayList<String> arralist=arrayee.printarray(strdaynight, strold, amountticket, ticketprice, strdiscount);
			
			System.out.println("합계금액" + ticketprice);
			System.out.println("계속발권하시겟습니까" + "1. 티켓발권" + "2.종료");
			countinue = scan.nextInt();
			// 발권내용 보여주기
			if (countinue == 2) {
				System.out.println("발권내용\n");
				for (int z = 0; z < count; z++)
					System.out.println(arralist);

				System.out.printf("입장료 총액: %8d ", totalsum);
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

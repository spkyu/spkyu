package Ticketing;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Scanner;

public class Mainticket {

	public static void main(String[] args) {

		while (true) {
			ArrayList<String> arralist = new ArrayList();
			Numbers.count = 0;
			Numbers.totalsum = 0;
			Inputclass input = new Inputclass();
			Printarray print = new Printarray();

			while (true) {

				Filewrite fwfw = new Filewrite();
				Cacuage calage = new Cacuage();
				Cacuage discountt = new Cacuage();
				Printarray arrayee = new Printarray();
				Numbers.daynight = input.inputday();
				Numbers.realage = input.agedata();
				Numbers.amountticket = input.ammount();
				Numbers.discount = input.discount();
				Numbers.strdaynight = calage.strdaynight(Numbers.daynight);
				Numbers.ticketprice = calage.calage(Numbers.daynight, Numbers.realage, Numbers.amountticket);
				Numbers.ticketprice = discountt.discount(Numbers.discount, Numbers.ticketprice);
				Numbers.strdiscount = discountt.discountString(Numbers.discount);
				Numbers.strold = discountt.ageString(Numbers.realage);
				Numbers.totalsum += Numbers.ticketprice;
				Numbers.count++;
				arralist.add(print.printarray(Numbers.strdaynight, Numbers.strold, Numbers.amountticket,
						Numbers.ticketprice, Numbers.strdiscount));
				System.out.println("합계금액" + Numbers.ticketprice);
				Numbers.countinue = input.continuee();
				if (Numbers.countinue == 2) {
					System.out.println("발권내용\n");
					for (int z = 0; z < Numbers.count; z++) {
						System.out.println(arralist.get(z));
						fwfw.filewrite(arralist.get(z) + "\r\n");
					}
					System.out.printf("입장료 총액: %8d \n ", Numbers.totalsum);
					break;
				}
			}
			Numbers.countinue2 = input.continuee2();
			if (Numbers.countinue2 == 2) {
				System.out.println("발권종료");
				break;
			}
		}
	}
}

package Ticketing;

import java.util.Scanner;

public class Inputclass {

	public int inputday() {
		Scanner scan = new Scanner(System.in);
		System.out.println("권종을 선택하세요.\n" + "1. 주간권\n" + "2. 야간권");
		int daynight = scan.nextInt();
		return daynight;
	}

	public int ammount() {
		Scanner scan = new Scanner(System.in);
		System.out.println("티켓을 몇장구매하시겠습니까?");
		int amountticket = scan.nextInt();

		return amountticket;
	}

	public int discount() {
		Scanner scan = new Scanner(System.in);
		System.out.println("우대사항을 선택하세요.\n" + "1. 없음\n" + "2. 장애인\n" + "3. 국가유공자\n" + "4. 다자녀 \n" + "5. 임산부");
		int discount = scan.nextInt();

		return discount;
	}

	public int agedata() {
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.");
		String agedata = scan.next();
		int realage = Integer.parseInt(agedata.substring(0, 2));
		return realage;
	}

	public int continuee() {
		Scanner scan = new Scanner(System.in);
		System.out.println("계속발권하시겟습니까" + "1. 티켓발권" + "2.종료");
		int countinue = scan.nextInt();
		return countinue;
	}
	
	public int continuee2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("재주문 하시겠습니까?? 1.yes 2.no");
		int continue2 = scan.nextInt();
		return continue2;
	
	}
}

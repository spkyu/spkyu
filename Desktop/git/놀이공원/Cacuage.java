package Ticketing;

public class Cacuage {
	public int calage(int realage, int amountticket) {

		int ticketprice = 0;

		if ((realage <= 21) && (realage >= 20)) {
			ticketprice = 0;
			return ticketprice;
		} else if ((realage <= 19) && (realage >= 10)) {
			ticketprice = 37000 * amountticket;
			return ticketprice;
		} else if ((realage <= 9) && (realage >= 4)) {
			ticketprice = 40000 * amountticket;
			return ticketprice;
		} else if (((realage <= 3) && (realage >= 0)) || ((realage <= 99) && (realage >= 58))) {
			ticketprice = 46000 * amountticket;
			return ticketprice;
		} else if ((realage <= 57) && (realage > 22)) {
			ticketprice = 37000 * amountticket;
			return ticketprice;
		} else {
			return ticketprice;
		}

	}

	public String ageString(int realage) {

		String str = "";

		if ((realage <= 21) && (realage >= 20)) {
			str = "유아";
			return str;
		} else if ((realage <= 19) && (realage >= 10)) {
			str = "청소년";
			return str;
		} else if ((realage <= 9) && (realage >= 4)) {
			str = "소아";
			return str;
		} else if (((realage <= 3) && (realage >= 0)) || ((realage <= 99) && (realage >= 58))) {
			str = "대인";
			return str;
		} else if ((realage <= 57) && (realage > 22)) {
			str = "노인";
			return str;
		} else {
			return str;
		}
	}

	public int discount(int discount, int ticketprice) {

		if (discount == 1) {
			ticketprice = ticketprice;// 없음
			return ticketprice;
		} else if (discount == 2) {// 장애인
			ticketprice = ticketprice * 60 / 100;
			return ticketprice;
		} else if (discount == 3) {// 국가유공자
			ticketprice = ticketprice * 50 / 100;
			return ticketprice;
		} else if (discount == 4) {// 다자녀
			ticketprice = ticketprice * 80 / 100;
			return ticketprice;
		} else if (discount == 5) {// 임산부
			ticketprice = ticketprice * 75 / 100;
			return ticketprice;
		} else {
			return ticketprice;
		}

	}

	public String discountString(int discount) {
		String str = "";
		if (discount == 1) {
			str = "없음";// 없음
			return str;
		} else if (discount == 2) {// 장애인
			str = "장애인";// 없음
			return str;
		} else if (discount == 3) {// 국가유공자
			str = "국가유공자";// 없음
			return str;
		} else if (discount == 4) {// 다자녀
			str = "다자녀";// 없음
			return str;
		} else if (discount == 5) {// 임산부
			str = "임산부";// 없음
			return str;
		} else {
			return str;
		}

	}
}

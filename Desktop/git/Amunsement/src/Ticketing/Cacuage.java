package Ticketing;

public class Cacuage {
	public double calage(int daynight, int realage, double amountticket) {
//wow
		double ticketprice = 0;
		if (daynight == 1) {
			if ((realage <= 21) && (realage >= 20)) {
				ticketprice = Numbers.ticket_Price_Day_new;// 애
				return ticketprice;
			} else if ((realage <= 19) && (realage >= 10)) {
				ticketprice = Numbers.ticket_Price_Day_child * amountticket;// 초등학생
				return ticketprice;
			} else if ((realage <= 9) && (realage >= 4)) {
				ticketprice = Numbers.ticket_Price_Day_teenager * amountticket;// 청소년
				return ticketprice;
			} else if (((realage <= 3) && (realage >= 0)) || ((realage <= 99) && (realage >= 58))) {
				ticketprice = Numbers.ticket_Price_Day_adult * amountticket;// 어른
				return ticketprice;
			} else if ((realage <= 57) && (realage > 22)) {
				ticketprice = Numbers.ticket_Price_Day_senior * amountticket;// 노인
				return ticketprice;
			} else {
				return ticketprice;
			}

		} else if (daynight == 2) {
			if ((realage <= 21) && (realage >= 20)) {
				ticketprice = Numbers.ticket_Price_Night_new;
				return ticketprice;
			} else if ((realage <= 19) && (realage >= 10)) {
				ticketprice = Numbers.ticket_Price_Night_child * amountticket;
				return ticketprice;
			} else if ((realage <= 9) && (realage >= 4)) {
				ticketprice = Numbers.ticket_Price_Night_teenager * amountticket;
				return ticketprice;
			} else if (((realage <= 3) && (realage >= 0)) || ((realage <= 99) && (realage >= 58))) {
				ticketprice = Numbers.ticket_Price_Night_adult * amountticket;
				return ticketprice;
			} else if ((realage <= 57) && (realage > 22)) {
				ticketprice = Numbers.ticket_Price_Night_senior * amountticket;
				return ticketprice;
			} else {
				return ticketprice;
			}
		}
		return ticketprice;
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

	public double discount(double discount, double ticketprice) {

		if (discount == 1) {
			ticketprice = ticketprice * Numbers.Discount_no;// 없음
			return ticketprice;
		} else if (discount == 2) {// 장애인
			ticketprice = ticketprice * Numbers.Discount_disable;
			return ticketprice;
		} else if (discount == 3) {// 국가유공자
			ticketprice = ticketprice * Numbers.Discount_nationmerit;
			return ticketprice;
		} else if (discount == 4) {// 다자녀
			ticketprice = ticketprice * Numbers.Discount_manychild;
			return ticketprice;
		} else if (discount == 5) {// 임산부
			ticketprice = ticketprice * Numbers.Discount_pregnant;
			return ticketprice;
		} else {
			return ticketprice;
		}

	}

	public String discountString(double discount) {
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

	public String strdaynight(int daynight) {
		String str = "";
		if (daynight == 1) {
			str = "주간";
			return str;
		} else if (daynight == 2) {
			str = "야간";
			return str;
		} else {
			return str;

		}
	}

}

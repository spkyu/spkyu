package Salesticket;

public class ArrayPrint {

	public String Arrayprintday(String today, int sumday, int countday, int amounttket_day_new, int amounttket_day_child,
			int amounttket_day_teenager, int amounttket_day_adult, int amounttket_day_senior) {

		String strday = today + "," + "주" + "," + sumday + "," + countday + "(" + amounttket_day_new + ","
				+ amounttket_day_child + "," + amounttket_day_teenager + "," + amounttket_day_adult + "," + ""
				+ amounttket_day_senior + ")";
System.out.println(strday);
		return strday;
	}
	public String Arrayprintnight(String today, int sumnight, int countnight, int amounttket_night_new, int amounttket_night_child,
			int amounttket_night_teenager, int amounttket_night_adult, int amounttket_night_senior) {

		String strnight = today + "," + "야" + "," + sumnight + "," + countnight + "(" + amounttket_night_new + ","
				+ amounttket_night_child + "," + amounttket_night_teenager + "," + amounttket_night_adult + "," + ""
				+ amounttket_night_senior + ")";
System.out.println(strnight);
		return strnight;
	}
	public String head() {
		String head = "날짜/" + "주야구분/" + "판매금액/" + "매수(유아 소아 청소년 대인 노인)";
		System.out.println(head);
		return head;
	}
}

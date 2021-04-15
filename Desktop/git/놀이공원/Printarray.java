package Ticketing;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Printarray {

	public ArrayList<String> printarray(String strdaynight, String strold, int amountticket, int ticketprice, String strdiscount) {

		ArrayList<String> arralist = new ArrayList<String>();
		Calendar calt = Calendar.getInstance();
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY.MM.dd");

		arralist.add(sdt.format(calt.getTime()) + "," + strdaynight + "," + strold + "," + amountticket + ","
				+ ticketprice + "," + strdiscount);

		return arralist;

	}
}

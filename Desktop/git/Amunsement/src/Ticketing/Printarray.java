package Ticketing;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Printarray {

	public String printarray(String strdaynight, String strold, int amountticket, int ticketprice,
			String strdiscount) {

		
		Calendar calt = Calendar.getInstance();
		SimpleDateFormat sdt = new SimpleDateFormat("YYYY.MM.dd");
		
		String str=(sdt.format(calt.getTime()) + "," + strdaynight + "," + strold + "," + amountticket + ","
					+ ticketprice + "," + strdiscount);
			
		return str;

	}
}

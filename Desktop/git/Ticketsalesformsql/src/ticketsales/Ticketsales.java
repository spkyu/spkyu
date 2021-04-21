package ticketsales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ticketsales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sumday = 0;
		int sumnight = 0;
		int count_ticket = 0;

		int count_new = 0;
		int count_adult = 0;
		int count_teenager = 0;
		int count_senior = 0;
		int count_child = 0;

		int discount_no = 0;
		int discount_disable = 0;
		int discount_nationmerit = 0;
		int discount_pregnant = 0;
		int discount_manychild = 0;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdb", "root", "123456");
			Statement stmt = conn.createStatement();

			ResultSet rset = stmt.executeQuery("SELECT * FROM `report`");
			System.out.println("권종 가격");
			while (rset.next()) {
				System.out.println("값 :" + rset.getString(2) + " " + rset.getInt(5));
				count_ticket += rset.getInt(4);

				if (rset.getString(2).equals("주간")) {
					sumday += rset.getInt(5);
				} else if (rset.getString(2).equals("야간")) {
					sumnight += rset.getInt(5);
				} else {

				}
				if (rset.getString(3).equals("대인")) {
					count_adult += rset.getInt(4);
				} else if (rset.getString(3).equals("소아")) {
					count_child += rset.getInt(4);
				} else if (rset.getString(3).equals("청소년")) {
					count_teenager += rset.getInt(4);
				} else if (rset.getString(3).equals("노인")) {
					count_senior += rset.getInt(4);
				} else if (rset.getString(3).equals("유아"))
					count_new += rset.getInt(4);

				if (rset.getString(6).equals("없음")) {
					discount_no += rset.getInt(4);
				} else if (rset.getString(6).equals("임산부")) {
					discount_pregnant += rset.getInt(4);
				} else if (rset.getString(6).equals("장애인")) {
					discount_disable += rset.getInt(4);
				} else if (rset.getString(6).equals("다자녀")) {
					discount_manychild += rset.getInt(4);
				} else if (rset.getString(6).equals("국가유공자"))
					discount_nationmerit += rset.getInt(4);

			}
			rset.close();
			stmt.close();
			conn.close();
			System.out.print(" 주간총금액 " + sumday);
			System.out.println(" 야간총금액 " + sumnight);
			System.out.println(" 총판매갯수 " + count_ticket);
			System.out.println(" 유아 " + count_new + " 소아 " + count_child + " 청소년 " + count_teenager + " 대인 "
					+ count_adult + " 노인 " + count_senior);
			System.out.println(" 할인권종류 (" + " 없음 " + discount_no + " 임산부 " + discount_pregnant + " 장애인 "
					+ discount_disable + " 다자녀 " + discount_manychild+ " 국가유공자 "+discount_nationmerit+")");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

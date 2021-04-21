package Ticketing;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DATAbasewrite {



	public void databasewrite(String str) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection conn =DriverManager.getConnection
					 ("jdbc:mysql://127.0.0.1:3306/testdb","root","123456");
			 Statement stmt =conn.createStatement();
			
			 stmt.execute("INSERT INTO `report` (`date`, `typedaynight`, `age`, `ammount`, `sumprice`, `discount`) "
			 		+"VALUES (' "+str+"');");
			 
			 ResultSet rset = stmt.executeQuery("SELECT * FROM `report`");
			 System.out.println("권종 가격");
			 while (rset.next()) {
				 System.out.println("값 :"+ rset.getString(2)+" "+rset.getInt(5));
			 }
			 rset.close();
			 stmt.close();
			 conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}


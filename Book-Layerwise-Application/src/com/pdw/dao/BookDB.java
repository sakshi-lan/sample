package com.pdw.dao;
import java.sql.*;
public class BookDB  //12.
{
  public static Connection getConnection1() //13
  throws Exception
  {

	 String driverName = "oracle.jdbc.driver.OracleDriver";
	  Class.forName(driverName);
	  Connection conn = DriverManager.getConnection(
	             "jdbc:oracle:thin:@localhost:1521:XE","sakshi11","sakshi11");
	
	return conn; //14.
  }

}

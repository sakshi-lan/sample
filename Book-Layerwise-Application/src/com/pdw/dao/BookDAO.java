package com.pdw.dao;
import com.pdw.beans.BookBean;

import java.sql.*;
import java.util.ArrayList;
public class BookDAO  implements BookDaoI //9.
{   public int addBook(BookBean bookBean) //10.
  {	  Connection con = null;
	  PreparedStatement pstmt = null;
	  try
	  {  
		 con=BookDB.getConnection1(); //11,
		  //con  15.
		  String ins_str = "insert into book values(?,?,?,?)";
		  pstmt = con.prepareStatement(ins_str);
		  pstmt.setInt(1,bookBean.getBookId());
		  pstmt.setString(2,bookBean.getTitle());
		  pstmt.setFloat(3,bookBean.getPrice());
		  pstmt.setString(4,bookBean.getGrade());                  
		  int updateCount = pstmt.executeUpdate();  //16,
		       //17.
		  con.close();
		  return updateCount; //18,1
	  }
	  catch(Exception ex)
	  {
		  System.out.println(ex);
		  return 0;
	  }
  }
  
  
  // Below method, Search by ID Module.    
  public ArrayList getBookDetailsById(int bookId)
			throws Exception
			{
				Connection con = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				
				con = BookDB.getConnection1();
				
		    String sel_str ="Select title,price from book where bookId=?";
				  
				  
				  pstmt = con.prepareStatement(sel_str);
				  pstmt.setInt(1,bookId);
				  rs = pstmt.executeQuery();
				  
				  ArrayList result = new ArrayList();
				  if(rs.next())
				  {
					  result.add(rs.getString(1));
					  result.add(rs.getString(2));
					  
				  }
				  else
				  {
					  result.add("Invalid Id");
				  }
				  return result;
				
			}
}

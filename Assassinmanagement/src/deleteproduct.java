import java.sql.*;

public class deleteproduct {
	public void delete() throws Exception{
				 String url = "jdbc:mysql://127.0.0.1:3306/assassinmanagement";
				 String username = "root";
				 String password = "4693";
				 String Query = " delete from product where productid = 1 ";
				 Connection con = DriverManager.getConnection(url, username,password);
				 PreparedStatement pst = con.prepareStatement(Query);
				 pst.executeUpdate();
				 con.close();
				 
				 
	}
				public static void main(String[]args)throws Exception {
					deleteproduct obj = new deleteproduct();
					obj.delete();
					
		}


}

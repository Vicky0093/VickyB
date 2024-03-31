import java.sql.*;

public class insertproduct {
	public void insert() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/assassinmanagement	";
		String username = "root";
		String password = "4693";
		String Query = "insert into product values(?,?,?,?,?)";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setInt(1,1);
		pst.setString(2, "sword");
		pst.setInt(3,50000);
		pst.setString(4,"black");
		pst.setString(5, "weapon");
		pst.executeUpdate();
		con.close();		
}
public static void main (String[]args)throws Exception{ 
	insertproduct obj = new insertproduct();
	obj.insert();

}
}
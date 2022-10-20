package p1;
import java.sql.*;
import javax.servlet.http.*;
@SuppressWarnings("unused")
public class UpdateDAO {
   public int i=0;
	public int getUpdate(UserBean ub)
	{
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("update user144 set addr=?,mailid=?,phno=? where uname=? and pword=?");
			ps.setString(1, ub.getAddr());
			ps.setString(2, ub.getMailID());
			ps.setLong(3, ub.getPhNo());
			ps.setString(4, ub.getuName());
			ps.setString(5, ub.getpWord());
			
			 i=ps.executeUpdate();
			
		}catch(Exception e) {e.printStackTrace();}
		return i;
	}
	
}

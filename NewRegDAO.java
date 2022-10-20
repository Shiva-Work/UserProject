package p1;
import java.sql.*;
public class NewRegDAO {
	
	public int i=0;
	
	public int reg(UserBean ub)
	{
		try {
			
			Connection con=DBConnection.getCon();
			
			PreparedStatement ps=con.prepareStatement("insert into user144 values(?,?,?,?,?,?,?)");
					
					ps.setString(1,ub.getuName());
			        ps.setString(2, ub.getpWord());
			        ps.setString(3,ub.getfName());
			        ps.setString(4, ub.getlName());
			        ps.setString(5, ub.getAddr());
			        ps.setString(6, ub.getMailID());
			        ps.setLong(7, ub.getPhNo());
			        
			        i=ps.executeUpdate();
			        
		}catch(Exception e) {e.printStackTrace();}
		
		return i;
	}

}

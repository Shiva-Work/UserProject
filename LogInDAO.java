package p1;
import java.sql.*; 

import javax.servlet.http.*;
public class LogInDAO {
	
	UserBean ub=null;
	
	public UserBean lDAO(HttpServletRequest req)
	{
		
		try {
			
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from user144 where uname=? and pword=?");
            ps.setString(1, req.getParameter("un"));
            ps.setString(2, req.getParameter("pw"));
            
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
            	ub=new UserBean();
            	ub.setuName(rs.getString(1));
            	ub.setpWord(rs.getString(2));
            	ub.setfName(rs.getString(3));
            	ub.setlName(rs.getString(4));
            	ub.setAddr(rs.getString(5));
            	ub.setMailID(rs.getString(6));
            	ub.setPhNo(rs.getLong(7));
            }
            
		}catch(Exception e) {e.printStackTrace();}
		
		return ub;
		
	}

	
	
}

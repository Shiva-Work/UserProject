package p1;
import java.io.*;  
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/log1")
public class LogInServlet extends HttpServlet{

	
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		
		UserBean ub=new LogInDAO().lDAO(req);
	
		
		if(ub==null)
		{
			RequestDispatcher rd=req.getRequestDispatcher("Invalid1.jsp");
			rd.forward(req, res);
		}
		else
		{
			HttpSession hs=req.getSession();
			hs.setAttribute("Bean", ub);
			
			RequestDispatcher rd=req.getRequestDispatcher("LogIn.jsp");
			rd.forward(req, res);
		}
		
	}

}

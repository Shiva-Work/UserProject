package p1;
import java.io.*; 
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession hs=req.getSession(false);
		if(hs==null)
		{
			RequestDispatcher rd=req.getRequestDispatcher("Invalid1.jsp");
			rd.forward(req, res);
		}
		else
		{
			UserBean ub=(UserBean)hs.getAttribute("Bean");
			ub.setAddr(req.getParameter("ad"));
			ub.setMailID(req.getParameter("mid"));
			ub.setPhNo(Long.parseLong(req.getParameter("pn")));
			
			int i=new UpdateDAO().getUpdate(ub);
			if(i>0)
			{
				RequestDispatcher rd=req.getRequestDispatcher("Update.jsp");
				rd.forward(req, res);
			}
			else
			{
				PrintWriter pw=res.getWriter();
				res.setContentType("text/html");
				pw.println(ub.getfName()+" "+ub.getlName()+" "+ub.getuName()+" "+ub.getpWord());
			}
			
			
		}
	}

}

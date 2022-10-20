package p1;
import java.io.*; 
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/reg")
public class NewRegServlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		UserBean ub=new UserBean();
		ub.setuName(req.getParameter("un"));
		ub.setpWord(req.getParameter("pw"));
		ub.setfName(req.getParameter("fn"));
		ub.setlName(req.getParameter("ln"));
		ub.setAddr(req.getParameter("ad"));
		ub.setMailID(req.getParameter("mid"));
		ub.setPhNo(Long.parseLong(req.getParameter("pn")));
		
		int i=new NewRegDAO().reg(ub);
		
		if(i>0)
		{
			//req.setAttribute("msg","Registered SuccessFully");
			
			RequestDispatcher rd=req.getRequestDispatcher("Reg.jsp");
			rd.forward(req, res);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("Invalid.jsp");
			rd.forward(req, res);
		}
		
	}

}

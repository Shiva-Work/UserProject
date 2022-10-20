package p1;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException ,IOException
	{
		HttpSession hs=req.getSession(false);
		if(hs==null)
		{
			RequestDispatcher rd=req.getRequestDispatcher("Invalid1.jsp");
			rd.forward(req, res);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("Edit.jsp");
			rd.forward(req, res);
		}
	}

}

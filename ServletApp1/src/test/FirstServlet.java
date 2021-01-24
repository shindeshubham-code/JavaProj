package test;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class FirstServlet extends GenericServlet{
	public void init()throws ServletException{
		
	}

	@Override
	public void service(ServletRequest req,ServletResponse res) throws ServletException, IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
String userName = req.getParameter("uname");
pw.println("welcome to Servlet programming....");
pw.println("<br>WELCOME USER "+userName);
		
	}
	public void destroy(){
		//No Code
	}

}

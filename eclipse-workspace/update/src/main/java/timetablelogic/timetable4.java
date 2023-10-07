package timetablelogic;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/xer4")
public class timetable4 extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		
		res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
	    res.setHeader("Pragma", "no-cache"); // HTTP 1.0.
	    res.setHeader("Expires", "0");
		System.out.println("In 4");
		HttpSession session = req.getSession();
		boolean z1 =(boolean) session.getAttribute("z1");
		int ts = (int) session.getAttribute("ts");
		int t1 = (int) session.getAttribute("t1");
		boolean r=true;
		if(!z1) {
		try{
		ts=Integer.parseInt(req.getParameter("ts"));
		}
		catch(NumberFormatException e) {
			r=false;
			RequestDispatcher rd = req.getRequestDispatcher("tsel.jsp");
            rd.forward(req, res);
		}
		}
		if(r) {
		session.setAttribute("ts",ts);
		if(ts==1) {
		if(t1==2) {
			RequestDispatcher rd = req.getRequestDispatcher("timesel.jsp");
            rd.forward(req, res);
			}
			else {
				RequestDispatcher rd = req.getRequestDispatcher("timesel2.jsp");
	            rd.forward(req, res);
			}
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("xer7");
            rd.forward(req, res);
			
		}
		}
		
	}

}

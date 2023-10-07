package timetablelogic;

import java.io.IOException;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/xer5")
public class timetable5 extends HttpServlet  {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
	    res.setHeader("Pragma", "no-cache"); // HTTP 1.0.
	    res.setHeader("Expires", "0");
		
		System.out.println("In 5");
		HttpSession session = req.getSession();
		boolean eve = (boolean) session.getAttribute("eve");
		int t1 = (int) session.getAttribute("t1");
		List<Integer> startime = (List<Integer>) session.getAttribute("startime");
		boolean z =(boolean) session.getAttribute("z");
		System.out.println("Value of eve: "+eve);
		try {
			if(!eve) {
			startime.clear();
			startime.add(Integer.parseInt(req.getParameter("classTimeMonday")));
			startime.add(Integer.parseInt(req.getParameter("classTimeTuesday")));
			startime.add(Integer.parseInt(req.getParameter("classTimeWednesday")));
			startime.add(Integer.parseInt(req.getParameter("classTimeThursday")));
			startime.add(Integer.parseInt(req.getParameter("classTimeFriday")));
			session.setAttribute("startime", startime);
			System.out.println(startime);
			}
//			m++;
			z=false;
			session.setAttribute("z", z);
			if(t1==2) {
				RequestDispatcher rd = req.getRequestDispatcher("timesel1.jsp");
	            rd.forward(req, res);
			}
			else {
				RequestDispatcher rd = req.getRequestDispatcher("timesel3.jsp");
	            rd.forward(req, res);
			}
			}
			catch(NumberFormatException e) {
				if(t1==2) {
					RequestDispatcher rd = req.getRequestDispatcher("timesel.jsp");
		            rd.forward(req, res);
					}
					else {
						RequestDispatcher rd = req.getRequestDispatcher("timesel2.jsp");
			            rd.forward(req, res);
					}
			}
	}

}

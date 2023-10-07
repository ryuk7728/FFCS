package timetablelogic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/xer2")
public class timetable2 extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		
		res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
	    res.setHeader("Pragma", "no-cache"); // HTTP 1.0.
	    res.setHeader("Expires", "0");
		
		HttpSession session = req.getSession();
//		int t1 =(int) session.getAttribute("z99");
//		System.out.println("VALUE OF T1:"+t1);
		List<Brute> tcombinations = (List<Brute>) session.getAttribute("tcombinations");
//		System.out.println("TCOMBTEACHER in 2"+tcombinations.get(0).theory);
		int v=0;
		boolean z =(boolean) session.getAttribute("z");
		boolean r=true;
		if(!z) {
			try {
			v=Integer.parseInt(req.getParameter("tea"));
			session.setAttribute("v", v);
			}
			catch(NullPointerException e) {
				r=false;
				System.out.println("In null pointer");
				RequestDispatcher rd = req.getRequestDispatcher("teasel.jsp");
	            rd.forward(req, res);
			}
			catch(NumberFormatException e) {
				r=false;
				System.out.println("In number format");
				RequestDispatcher rd = req.getRequestDispatcher("teasel.jsp");
	            rd.forward(req, res);
			}
			}
			if(r) {
			
			v=(int)session.getAttribute("v");
			System.out.println("The value of v is: "+v);
			if(v==2) {
				RequestDispatcher rd = req.getRequestDispatcher("xer3");
	            rd.forward(req, res);
			}
			if(z||v==1) {
				System.out.println("We're in");
				RequestDispatcher rd = req.getRequestDispatcher("teasel1.jsp");
	            rd.forward(req, res);

			}
			}
	}

}

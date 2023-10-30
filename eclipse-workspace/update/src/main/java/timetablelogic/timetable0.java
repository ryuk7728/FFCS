package timetablelogic;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/xerw")
public class timetable0 extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
	    res.setHeader("Pragma", "no-cache"); // HTTP 1.0.
	    res.setHeader("Expires", "0");
	    System.out.println("INSIDE XERS");
		HttpSession session = req.getSession(); 
		String ID = session.getId();
        System.out.println("THE ID IS:  "+ID);
		int time =Integer.parseInt(req.getParameter("time"));
		System.out.println("THE TIME IS"+time);
	    session.setAttribute("time", time);
		RequestDispatcher rd = req.getRequestDispatcher("rex");
        rd.forward(req, res);
		
		
	}

}

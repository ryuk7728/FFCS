package timetablelogic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/xer1")
public class timetable1 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
	    res.setHeader("Pragma", "no-cache"); // HTTP 1.0.
	    res.setHeader("Expires", "0");
		HttpSession session = req.getSession();

	    HashMap<String, HashMap<String, HashSet<String>>> theory = (HashMap<String, HashMap<String, HashSet<String>>>) session.getAttribute("theory");
	    HashMap<String, HashMap<String, HashSet<String>>> lab = (HashMap<String, HashMap<String, HashSet<String>>>) session.getAttribute("lab");
	    HashMap<String, HashMap<String, List<List<String>>>> embedded = (HashMap<String, HashMap<String, List<List<String>>>>) session.getAttribute("embedded");

	    HashMap<String, HashMap<String, HashSet<String>>> theory2=(HashMap<String, HashMap<String, HashSet<String>>>) session.getAttribute("theory2");

	    HashMap<String, HashMap<String, HashSet<String>>> lab2=(HashMap<String, HashMap<String, HashSet<String>>>) session.getAttribute("lab2");

	    HashMap<String, HashMap<String, List<List<String>>>> embedded2=(HashMap<String, HashMap<String, List<List<String>>>>) session.getAttribute("embedded2");
	    
	    HashMap<String, HashMap<String, HashSet<String>>> theory3=(HashMap<String, HashMap<String, HashSet<String>>>) session.getAttribute("theory3");

	    HashMap<String, HashMap<String, HashSet<String>>> lab3=(HashMap<String, HashMap<String, HashSet<String>>>) session.getAttribute("lab3");

	    HashMap<String, HashMap<String, List<List<String>>>> embedded3=(HashMap<String, HashMap<String, List<List<String>>>>) session.getAttribute("embedded3");
        System.out.println("Theory value:"+theory2);
	    System.out.println("lab size:"+theory2.size());
	    System.out.println("lab size:"+lab2.size());
	    System.out.println("lab size:"+embedded2.size());
	    System.out.println("lab size:"+theory3.size());
	    System.out.println("lab size:"+lab3.size());
	    System.out.println("lab size:"+embedded3.size());
	    
	    List<Brute> tcombinations = new ArrayList<>();
		
		List<Brute> allcomb = new ArrayList<>();
		timetable ob = new timetable();
		int w = (int)(session.getAttribute("w"));
		System.out.println("The value of w is:"+w);
		ob = (timetable)session.getAttribute("ob");
		if(w==1) {
			List<String> selectedSubjects = Arrays.asList(req.getParameterValues("subjects"));
	        System.out.println("The subjects are: "+selectedSubjects);
	        ob.subjects(selectedSubjects,theory,lab,embedded,theory2,lab2,embedded2,theory3,lab3,embedded3);
	        session.setAttribute("theory", theory);
	        session.setAttribute("lab", lab);
	        session.setAttribute("embedded", embedded);
	        session.setAttribute("theory2", theory2);
	        session.setAttribute("lab2", lab2);
	        session.setAttribute("embedded2", embedded2);
	        session.setAttribute("theory3", theory3);
	        session.setAttribute("lab3", lab3);
	        session.setAttribute("embedded3", embedded3);
			}
		
		
		allcomb=ob.bruteForce(theory3,lab3,embedded3,tcombinations);
		int z99 = 10000;
		System.out.println("ALLCOMB:"+allcomb.get(0).theory);
		System.out.println("Allcomb size in 1:"+allcomb.size());
		session.setAttribute("allcomb", allcomb);
		session.setAttribute("tcombinations", tcombinations);
		System.out.println("allcomb size1:"+allcomb.size());
		System.out.println("TCOMBTEACHER in 1"+tcombinations.get(0).theory);
		session.setAttribute("ob", ob);
		session.setAttribute("z99", z99);
		RequestDispatcher rd = req.getRequestDispatcher("teasel.jsp");
        rd.forward(req, res);
		
	}

}

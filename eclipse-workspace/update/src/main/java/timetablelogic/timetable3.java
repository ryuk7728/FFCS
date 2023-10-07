package timetablelogic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/xer3")
public class timetable3 extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
	    res.setHeader("Pragma", "no-cache"); // HTTP 1.0.
	    res.setHeader("Expires", "0");
		HttpSession session = req.getSession();
		List<Brute> tcombinations = (List<Brute>) session.getAttribute("tcombinations");
		System.out.println("TCOMBTEACHER"+tcombinations.get(0).theory);

		List<Brute> tcombinations1 = new ArrayList<>();

		List<Brute> tcombinations3 = new ArrayList<>();
		List<Brute> allcomb = new ArrayList<>();
		String teachersInput="";
		String[] arr = new String[1];
		int v = (int) session.getAttribute("v");
		boolean z = (boolean) session.getAttribute("z");
		timetable ob = new timetable();
		ob= (timetable)session.getAttribute("ob");
		timetable ob1 = new timetable();
		boolean r = true;
		if(v==1) {
			try {
			teachersInput = req.getParameter("teacher");
			System.out.println("Value of teacher input:"+ teachersInput.length());
			}
			catch(NullPointerException e) {
				System.out.println("Inside nullpointer exception");
				r=false;
				RequestDispatcher rd = req.getRequestDispatcher("teasel1.jsp");
	            rd.forward(req, res);
			}
			if(r) {
			teachersInput=teachersInput.replaceAll("\\s+", "");
			String[] teachersArray = teachersInput.split(","); 
            List<String> teacher = Arrays.asList(teachersArray);
            teacher=convertListElements(teacher);
            if(!z) {
            System.out.println("We're so back");
            ob1 = new timetable(ob);
            session.setAttribute("ob1", ob1);
            }
			System.out.println(teacher);
			allcomb = ob.teachers(teacher,arr,tcombinations,tcombinations1,tcombinations3);
			session.setAttribute("allcomb", allcomb);
			session.setAttribute("tcombinations", tcombinations);
			session.setAttribute("tcombinations1", tcombinations1);
			session.setAttribute("tcombinations3", tcombinations3);
			if (allcomb==null) {
				ob1=(timetable) session.getAttribute("ob1");
				ob.timetable1(ob1);
				session.setAttribute("ob", ob);
				z=true;
				session.setAttribute("z", z);
			    // Generate the HTML content
				String htmlContent = "<html>"
		                  + "<head>"
		                  + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
		                  + "</head>"
		                  + "<body>"
		                  + "<p>" + arr[0] + "</p>"
		                  + "<a href=\"xer2\">"
		                  + "<button>Retry</button>"
		                  + "</a>"
		                  + "</body>"
		                  + "</html>";

			                        

			    // Set the response content type to HTML
			    res.setContentType("text/html");

			    // Get the PrintWriter to write the HTML content to the response
			    PrintWriter out = res.getWriter();

			    // Print the HTML content
			    out.println(htmlContent);
			    
			}
			else {
//			System.out.println("TCOMBTEACHER"+tcombinations.get(0).theory);	
			session.setAttribute("ob", ob);
			RequestDispatcher rd = req.getRequestDispatcher("tsel.jsp");
            rd.forward(req, res);
			}
			}
			}
			else {
				
//				System.out.println("TCOMBTEACHER"+tcombinations.get(0).theory);
				
					RequestDispatcher rd = req.getRequestDispatcher("tsel.jsp");
		            rd.forward(req, res);
			}
		
	
	}
	
	public static List<String> convertListElements(List<String> inputList) {
        List<String> convertedList = new ArrayList<>();
        
        for (String element : inputList) {
            String convertedElement = capitalizeFirstLetter(element);
            convertedList.add(convertedElement);
        }
        
        return convertedList;
    }
	
	public static String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        String firstLetter = input.substring(0, 1).toUpperCase();
        String restOfString = input.substring(1).toLowerCase();
        
        return firstLetter + restOfString;
    }

}

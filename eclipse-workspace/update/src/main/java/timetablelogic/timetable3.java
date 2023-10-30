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
			int teacherCount = Integer.parseInt(req.getParameter("teacherCount"));
			String[] teachersArray=teachersArray= new String[teacherCount];
			try {
			 for (int i = 0; i < teacherCount; i++) {
		            teachersArray[i] = req.getParameter("teacher" + (i + 1));
		            System.out.println(teachersArray[i]);
		        }
			}
			catch(NullPointerException e) {
				System.out.println("Inside nullpointer exception");
				r=false;
				RequestDispatcher rd = req.getRequestDispatcher("teasel1.jsp");
	            rd.forward(req, res);
			}
			if(r) { 
            List<String> teacher = Arrays.asList(teachersArray);
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
				        + "<meta charset=\"UTF-8\">"
				        + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
				        + "<title>Timetable Generator</title>"
				        + "<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">"
				        + "<style>"
				        + "body {"
				        + "    margin: 0;"
				        + "    padding: 0;"
				        + "    font-family: 'Raleway', sans-serif;"
				        + "    background: #34495E;"
				        + "    color: #fff;"
				        + "    display: flex;"
				        + "    justify-content: center;"
				        + "    align-items: center;"
				        + "    min-height: 100vh;"
				        + "    overflow: hidden;"
				        + "}"
				        + ".container {"
				        + "    background: rgba(0, 0, 0, 0.6);"
				        + "    padding: 20px;"
				        + "    border-radius: 10px;"
				        + "    box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.5);"
				        + "    width: 600px;"
				        + "    text-align: center;"
				        + "}"
				        + "p {"
				        + "    font-size: 18px;"
				        + "    margin-bottom: 10px;"
				        + "}"
				        + "a {"
				        + "    text-decoration: none;"
				        + "}"
				        + "button {"
				        + "    padding: 10px 20px;"
				        + "    font-size: 18px;"
				        + "    font-family: 'Raleway', sans-serif;"
				        + "    background-color: #2ecc71;"
				        + "    border: none;"
				        + "    border-radius: 5px;"
				        + "    color: #fff;"
				        + "    cursor: pointer;"
				        + "    transition: background-color 0.3s ease, transform 0.3s ease;"
				        + "    margin: 10px;"
				        + "}"
				        + "button:hover {"
				        + "    background-color: #27ae60;"
				        + "    transform: scale(1.1);"
				        + "}"
				        + "</style>"
				        + "</head>"
				        + "<body>"
				        + "<div class=\"container\">"
				        + "    <h3>" + arr[0] + "</h3>"
				        + "    <a href=\"xer2\">"
				        + "        <button>Retry</button>"
				        + "    </a>"
				        + "</div>"
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

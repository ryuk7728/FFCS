package timetablelogic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/xer6")
public class timetable6 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
	    res.setHeader("Pragma", "no-cache"); // HTTP 1.0.
	    res.setHeader("Expires", "0");
		
		System.out.println("In 6");
		HttpSession session = req.getSession();
		List<Brute> tcombinations = (List<Brute>) session.getAttribute("tcombinations");

		List<Brute> tcombinations1 = (List<Brute>) session.getAttribute("tcombinations1");
		List<Brute> tcombinations2 = new ArrayList<>();
		boolean eve = (boolean) session.getAttribute("eve");
		int t1 = (int) session.getAttribute("t1");
		List<Integer> endtime = new ArrayList<Integer>();
		List<Integer> startime = (List<Integer>) session.getAttribute("startime");
		boolean z =(boolean) session.getAttribute("z");
		boolean z1 =(boolean) session.getAttribute("z1");
		timetable ob = (timetable) session.getAttribute("ob");
		timetable ob2 = (timetable) session.getAttribute("ob2");
		List<Brute> allcomb = new ArrayList<>();
		String arr[] = new String[1];
		int[] arr1 = new int[1];
		arr1[0]=0;
		try {
			eve=false;
			session.setAttribute("eve", eve);
			endtime.clear();
			endtime.add(Integer.parseInt(req.getParameter("classEndTimeMonday")));
			endtime.add(Integer.parseInt(req.getParameter("classEndTimeTuesday")));
			endtime.add(Integer.parseInt(req.getParameter("classEndTimeWednesday")));
			endtime.add(Integer.parseInt(req.getParameter("classEndTimeThursday")));
			endtime.add(Integer.parseInt(req.getParameter("classEndTimeFriday")));
			session.setAttribute("endtime", endtime);
			System.out.println(endtime);
			if(!z) {
			ob2=new timetable(ob);
			session.setAttribute("ob2",ob2);
			}
			System.out.println("TCOMBINATION SIZE:"+tcombinations.size());
			List<Brute> tcombinations77 = new ArrayList<>();
            List<Brute> tcombinations78 = new ArrayList<>();
           
            tcombinations77.addAll(tcombinations);
            try {
            tcombinations78.addAll(tcombinations1);
            }
            catch(Exception e) {
            	tcombinations1=new ArrayList<>();
            	tcombinations78.addAll(tcombinations1);
            }
			session.setAttribute("tcombinations", tcombinations77);
			session.setAttribute("tcombinations1", tcombinations78);
			allcomb=ob.startend(t1, startime, endtime,arr,arr1,tcombinations,tcombinations2,tcombinations1);
			tcombinations = (List<Brute>) session.getAttribute("tcombinations");
			System.out.println("UPDATES TCOMBINATIONS SIZE:"+tcombinations.size());
			System.out.println("Allcomb size in 6");
			session.setAttribute("allcomb", allcomb);
			session.setAttribute("ob", ob);
			if(allcomb==null) {
				z=true;
				session.setAttribute("z", z);
				z1=true;
				session.setAttribute("z1", z1);
				if(arr1[0]==1) {
                eve=true;
				}
				else {
                eve =false;
				}
				session.setAttribute("eve", eve);
				ob.timetable1(ob2);
				session.setAttribute("ob", ob);
				if(arr1[0]!=1) {
					String htmlContent = "<html>"
			                  + "<head>"
			                  + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
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
			                  + "    <p>" + arr[0] + "</p>"
			                  + "    <a href=\"xer4\">"
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
					String htmlContent = "<html>"
			                  + "<head>"
			                  + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
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
			                  + "    <p>" + arr[0] + "</p>"
			                  + "    <a href=\"xer5\">"
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
			}
			else {
//				m++;
				RequestDispatcher rd = req.getRequestDispatcher("xer7");
	            rd.forward(req, res);
			}
			}
			catch(NumberFormatException e) {
				if(t1==2) {
					RequestDispatcher rd = req.getRequestDispatcher("timesel1.jsp");
		            rd.forward(req, res);
				}
				else {
					RequestDispatcher rd = req.getRequestDispatcher("timesel3.jsp");
		            rd.forward(req, res);
				}
			}
	}

}

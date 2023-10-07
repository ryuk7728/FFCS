package timetablelogic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/xer7")
public class timetable7 extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
	    res.setHeader("Pragma", "no-cache"); // HTTP 1.0.
	    res.setHeader("Expires", "0");
		
		
		System.out.println("In 7");
		HttpSession session = req.getSession();
		List<Brute> allcomb = (List<Brute>) session.getAttribute("allcomb");
		int l35=0;
		System.out.println("We're in 7");
		System.out.println(allcomb.size());
		String htmlContent = "<html>"
                  + "<head>"
                  + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
                  + "<title>Possible Timetable Combinations:</title>"
                  + "</head>"
                  + "<body>"
                  + "<h1>Possible Timetable Combinations:</h1>";


for (Brute ob1 : allcomb) {
l35++;
htmlContent += "<h2>Timetable #" + l35 +":"+ "</h2>";
// Details for pure theory subjects
htmlContent += "<div><h2>Details for pure theory subjects:</h2><ul>";
for (Map.Entry<String, HashMap<String, HashSet<String>>> get : ob1.theory.entrySet()) {
    htmlContent += "<li><strong>" + get.getKey() + "</strong>:<ul>";
    for (Map.Entry<String, HashSet<String>> get1 : get.getValue().entrySet()) {
        htmlContent += "<li>" + removeNumbers(get1.getKey()) + " : " + get1.getValue() + "</li>";
    }
    htmlContent += "</ul></li>";
}
htmlContent += "</ul></div>";

// Details for pure lab subjects
htmlContent += "<div><h2>Details for pure lab subjects:</h2><ul>";
for (Map.Entry<String, HashMap<String, HashSet<String>>> entry : ob1.lab.entrySet()) {
    htmlContent += "<li><strong>" + entry.getKey() + "</strong>:<ul>";
    for (Map.Entry<String, HashSet<String>> innerEntry : entry.getValue().entrySet()) {
        htmlContent += "<li>" + removeNumbers(innerEntry.getKey()) + " : " + innerEntry.getValue() + "</li>";
    }
    htmlContent += "</ul></li>";
}
htmlContent += "</ul></div>";

// Details for embedded subjects
htmlContent += "<div><h2>Details for embedded subjects:</h2><ul>";
for (Map.Entry<String, HashMap<String, List<List<String>>>> subjectEntry : ob1.embedded.entrySet()) {
    htmlContent += "<li><strong>" + subjectEntry.getKey() + "</strong>:<ul>";
    for (Map.Entry<String, List<List<String>>> teacherEntry : subjectEntry.getValue().entrySet()) {
        htmlContent += "<li><strong>" + removeNumbers(teacherEntry.getKey()) + "</strong>:<ul>";
        htmlContent += "<li>Theory slots: " + teacherEntry.getValue().get(0) + "</li>";
        htmlContent += "<li>Lab slots: " + teacherEntry.getValue().get(1) + "</li>";
        htmlContent += "</ul></li>";
    }
    htmlContent += "</ul></li>";
}
htmlContent += "</ul></div>";

htmlContent += "<hr>";
if(l35==100) {
	break;
}
}

htmlContent += "</body>"
            + "</html>";

//Set the response content type to HTML
res.setContentType("text/html");

//Get the PrintWriter to write the HTML content to the response
PrintWriter out = res.getWriter();

//Print the HTML content
out.println(htmlContent);

session.invalidate();

	}
	
	public static String removeNumbers(String input) {
        return input.replaceAll("\\d", ""); // Regular expression to replace digits
    }
	
	

}

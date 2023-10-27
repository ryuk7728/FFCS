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
		String htmlContent = "<!DOCTYPE html>"
                + "<html>"
                + "<head>"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
                + "<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">"
                + "    <style>"
                + "        body {"
                + "            margin: 0;"
                + "            padding: 0;"
                + "            font-family: 'Raleway', sans-serif;"
                + "            background: #34495E;"
                + "            color: #fff;"
                + "            display: flex;"
                + "            justify-content: center;"
                + "            align-items: center;"
                + "            min-height: 100vh;"
                + "        }"
                + "        .container {"
                + "            background: rgba(0, 0, 0, 0.6);"
                + "            padding: 20px;"
                + "            border-radius: 10px;"
                + "            box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.5);"
                + "            width: 600px;"
                + "            text-align: center;"
                + "        }"
                + "        p {"
                + "            font-size: 18px;"
                + "            margin-bottom: 10px;"
                + "        }"
                + "        a {"
                + "            text-decoration: none;"
                + "        }"
                + "        button {"
                + "            padding: 10px 20px;"
                + "            font-size: 18px;"
                + "            font-family: 'Raleway', sans-serif;"
                + "            background-color: #2ecc71;"
                + "            border: none;"
                + "            border-radius: 5px;"
                + "            color: #fff;"
                + "            cursor: pointer;"
                + "            transition: background-color 0.3s ease, transform 0.3s ease;"
                + "            margin: 10px;"
                + "        }"
                + "        button:hover {"
                + "            background-color: #27ae60;"
                + "            transform: scale(1.1);"
                + "        }"
                + "    </style>"
                + "    <title>Possible Timetable Combinations:</title>"
                + "</head>"
                + "<body>"
                + "    <div class=\"container\">"
                + "        <h1>Possible Timetable Combinations:</h1>";

for (Brute ob1 : allcomb) {
    l35++;
    htmlContent += "<h2>Timetable #" + l35 + ":" + "</h2>";
    
    // Details for pure theory subjects
    htmlContent += "<div><h2>Details for pure theory subjects:</h2>";
    for (Map.Entry<String, HashMap<String, HashSet<String>>> get : ob1.theory.entrySet()) {
        htmlContent += "<p><strong>" + get.getKey() + "</strong>:";
        for (Map.Entry<String, HashSet<String>> get1 : get.getValue().entrySet()) {
            htmlContent += "<p>" + removeNumbers(get1.getKey()) + " : " + get1.getValue() + "</p>";
        }
    }
    htmlContent += "</div>";

    // Details for pure lab subjects
    htmlContent += "<div><h2>Details for pure lab subjects:</h2>";
    for (Map.Entry<String, HashMap<String, HashSet<String>>> entry : ob1.lab.entrySet()) {
        htmlContent += "<p><strong>" + entry.getKey() + "</strong>:";
        for (Map.Entry<String, HashSet<String>> innerEntry : entry.getValue().entrySet()) {
            htmlContent += "<p>" + removeNumbers(innerEntry.getKey()) + " : " + innerEntry.getValue() + "</p>";
        }
    }
    htmlContent += "</div>";

    // Details for embedded subjects
    htmlContent += "<div><h2>Details for embedded subjects:</h2>";
    for (Map.Entry<String, HashMap<String, List<List<String>>>> subjectEntry : ob1.embedded.entrySet()) {
        htmlContent += "<p><strong>" + subjectEntry.getKey() + "</strong>:";
        for (Map.Entry<String, List<List<String>>> teacherEntry : subjectEntry.getValue().entrySet()) {
            htmlContent += "<p><strong>" + removeNumbers(teacherEntry.getKey()) + "</strong>:";
            htmlContent += "<p>Theory slots: " + teacherEntry.getValue().get(0) + "</p>";
            htmlContent += "<p>Lab slots: " + teacherEntry.getValue().get(1) + "</p>";
        }
    }
    htmlContent += "</div>";

    htmlContent += "<hr>";
    if (l35 == 100) {
        break;
    }
}

htmlContent += "</div>" + "</body>"
        + "</html>";

// Set the response content type to HTML
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

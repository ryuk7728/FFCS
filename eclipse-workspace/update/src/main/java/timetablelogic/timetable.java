package timetablelogic;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;


@WebServlet("/xer")
public class timetable extends HttpServlet {
	
	String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
    


	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
	    res.setHeader("Pragma", "no-cache"); // HTTP 1.0.
	    res.setHeader("Expires", "0");
		List<Integer> startime = new ArrayList<>();
		List<Integer> endtime = new ArrayList<>();
		int ts=0;
	    int m = 0;
	    int v=-1;
	    int w=0;
	    boolean z = false;
	    boolean z1 = false;
	    boolean eve=false;
	    boolean xy=false;
	    int t1=0;
	    timetable ob;
	    int u = 0;
		HttpSession session = req.getSession();
	    t1 = (int)(session.getAttribute("t2"));
        w = (int)(session.getAttribute("w"));
        ob = (timetable)session.getAttribute("ob");
		System.out.println("m is getting printed");
		System.out.println(m);
		if(m==0) {
		System.out.println("t1: "+t1);
		System.out.println("w: "+w);
//		timetable ob = (timetable) req.getAttribute("ob");
//		this.theory2=ob.theory2;
//		this.lab2=ob.lab2;
//		this.embedded2=ob.embedded2;
//		this.theory3=ob.theory3;
//		this.lab3=ob.lab3;
//		this.embedded3=ob.embedded3;
		System.out.println("I am going to print w");
		System.out.println(w);
		session.setAttribute("z", z);
		session.setAttribute("z1", z1);
		session.setAttribute("ts", ts);
		session.setAttribute("t1", t1);
		session.setAttribute("eve", eve);
		session.setAttribute("startime",startime);
		session.setAttribute("startime",endtime);
		session.setAttribute("u", u);
//        m++;
        if(w==1) {
        RequestDispatcher rd = req.getRequestDispatcher("subsel.jsp");
        rd.forward(req, res);
        }
        else {
        	RequestDispatcher rd = req.getRequestDispatcher("xer1");
            rd.forward(req, res);
        }
            
        
		}
//		if (m==1) {
//			if(w==1) {
//			List<String> selectedSubjects = Arrays.asList(req.getParameterValues("subjects"));
//	        this.subjects(selectedSubjects);
//			}
//            allcomb=this.bruteForce();
//            System.out.println("allcomb size1:"+allcomb.size());
//            m++;
//            System.out.println("Execute");
//			RequestDispatcher rd = req.getRequestDispatcher("teasel.jsp");
//            rd.forward(req, res);
//            
//		}
//		if(m==2) {
//			System.out.println("Inside m==2");
//			boolean r=true;
//			if(!z) {
//			try {
//			v=Integer.parseInt(req.getParameter("tea"));
//			}
//			catch(NullPointerException e) {
//				r=false;
//				System.out.println("In null pointer");
//				RequestDispatcher rd = req.getRequestDispatcher("teasel.jsp");
//	            rd.forward(req, res);
//			}
//			catch(NumberFormatException e) {
//				r=false;
//				System.out.println("In number format");
//				RequestDispatcher rd = req.getRequestDispatcher("teasel.jsp");
//	            rd.forward(req, res);
//			}
//			}
//			if(r) {
//			System.out.println("The value of v is: "+v);
//			m=3;
//			System.out.println("The value of mmmm is:"+m);
//			if(v==2) {
//				this.doGet(req, res);
//			}
//			if(z||v==1) {
//				System.out.println("We're in");
//				RequestDispatcher rd = req.getRequestDispatcher("teasel1.jsp");
//	            rd.forward(req, res);
//
//			}
//			}
//			
//			
//		}
//		if(m==3) {
//			String teachersInput="";
//			boolean r = true;
//			System.out.println("We're in m==3");
//			if(v==1) {
//			try {
//			teachersInput = req.getParameter("teacher");
//			System.out.println("Value of teacher input:"+ teachersInput.length());
//			}
//			catch(NullPointerException e) {
//				System.out.println("Inside nullpointer exception");
//				r=false;
//				RequestDispatcher rd = req.getRequestDispatcher("teasel1.jsp");
//	            rd.forward(req, res);
//			}
//			if(r) {
//			teachersInput=teachersInput.replaceAll("\\s+", "");
//			String[] teachersArray = teachersInput.split(","); 
//            List<String> teacher = Arrays.asList(teachersArray);
//            teacher=convertListElements(teacher);
//            if(!z) {
//            System.out.println("We're so back");
//            ob1 = new timetable(this);
//            }
//			System.out.println(teacher);
////			allcomb = this.teachers(teacher);
//			if (allcomb==null) {
//				this.timetable1(ob1);
//				m--;
//				z=true;
//			    // Generate the HTML content
//				String htmlContent = "<html>"
//		                  + "<head>"
//		                  + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
//		                  + "</head>"
//		                  + "<body>"
//		                  + "<p>" + teacherError + "</p>"
//		                  + "<a href=\"xer\">"
//		                  + "<button>Retry</button>"
//		                  + "</a>"
//		                  + "</body>"
//		                  + "</html>";
//
//			                        
//
//			    // Set the response content type to HTML
//			    res.setContentType("text/html");
//
//			    // Get the PrintWriter to write the HTML content to the response
//			    PrintWriter out = res.getWriter();
//
//			    // Print the HTML content
//			    out.println(htmlContent);
//			}
//			else {
//			m++;
//			RequestDispatcher rd = req.getRequestDispatcher("tsel.jsp");
//            rd.forward(req, res);
//			}
//			}
//			}
//			else {
//				m++;
//				
//					RequestDispatcher rd = req.getRequestDispatcher("tsel.jsp");
//		            rd.forward(req, res);
//			}
//
//		}
//		if(m==4) {
//			boolean r=true;
//			if(!z1) {
//			try{
//			ts=Integer.parseInt(req.getParameter("ts"));
//			}
//			catch(NumberFormatException e) {
//				r=false;
//				RequestDispatcher rd = req.getRequestDispatcher("tsel.jsp");
//	            rd.forward(req, res);
//			}
//			}
//			if(r) {
//			if(ts==1) {
//			m++;
//			if(t1==2) {
//				RequestDispatcher rd = req.getRequestDispatcher("timesel.jsp");
//	            rd.forward(req, res);
//				}
//				else {
//					RequestDispatcher rd = req.getRequestDispatcher("timesel2.jsp");
//		            rd.forward(req, res);
//				}
//			}
//			else {
//				m=7;
//				this.doGet(req, res);
//				
//			}
//			}
//		}
//		if(m==5) {
//			try {
//			if(!eve) {
//			startime.clear();
//			startime.add(Integer.parseInt(req.getParameter("classTimeMonday")));
//			startime.add(Integer.parseInt(req.getParameter("classTimeTuesday")));
//			startime.add(Integer.parseInt(req.getParameter("classTimeWednesday")));
//			startime.add(Integer.parseInt(req.getParameter("classTimeThursday")));
//			startime.add(Integer.parseInt(req.getParameter("classTimeFriday")));
//			System.out.println(startime);
//			}
//			m++;
//			z=false;
//			if(t1==2) {
//				RequestDispatcher rd = req.getRequestDispatcher("timesel1.jsp");
//	            rd.forward(req, res);
//			}
//			else {
//				RequestDispatcher rd = req.getRequestDispatcher("timesel3.jsp");
//	            rd.forward(req, res);
//			}
//			}
//			catch(NumberFormatException e) {
//				if(t1==2) {
//					RequestDispatcher rd = req.getRequestDispatcher("timesel.jsp");
//		            rd.forward(req, res);
//					}
//					else {
//						RequestDispatcher rd = req.getRequestDispatcher("timesel2.jsp");
//			            rd.forward(req, res);
//					}
//			}
//		}
//		if(m==6) {
//			try {
//			eve=false;
//			endtime.clear();
//			endtime.add(Integer.parseInt(req.getParameter("classEndTimeMonday")));
//			endtime.add(Integer.parseInt(req.getParameter("classEndTimeTuesday")));
//			endtime.add(Integer.parseInt(req.getParameter("classEndTimeWednesday")));
//			endtime.add(Integer.parseInt(req.getParameter("classEndTimeThursday")));
//			endtime.add(Integer.parseInt(req.getParameter("classEndTimeFriday")));
//			System.out.println(endtime);
//			if(!z) {
//			ob2=new timetable(this);
//			}
////			allcomb=this.startend(t1, startime, endtime);
//			if(allcomb==null) {
//				z=true;
//				z1=true;
//				if(!eve) {
//				m=4;
//				}
//				else {
//					m--;
//				}
//				this.timetable1(ob2);
//				String htmlContent = "<html>"
//		                  + "<head>"
//		                  + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
//		                  + "</head>"
//		                  + "<body>"
//		                  + "<p>" + startEndError + "</p>"
//		                  + "<a href=\"xer\">"
//		                  + "<button>Retry</button>"
//		                  + "</a>"
//		                  + "</body>"
//		                  + "</html>";
//
//			                        
//
//			    // Set the response content type to HTML
//			    res.setContentType("text/html");
//
//			    // Get the PrintWriter to write the HTML content to the response
//			    PrintWriter out = res.getWriter();
//
//			    // Print the HTML content
//			    out.println(htmlContent);
//			}
//			else {
//				m++;
//				this.doGet(req, res);
//			}
//			}
//			catch(NumberFormatException e) {
//				if(t1==2) {
//					RequestDispatcher rd = req.getRequestDispatcher("timesel1.jsp");
//		            rd.forward(req, res);
//				}
//				else {
//					RequestDispatcher rd = req.getRequestDispatcher("timesel3.jsp");
//		            rd.forward(req, res);
//				}
//			}
//		}
//		if(m==7) {
//			int l35=0;
//			System.out.println("We're in 7");
//			System.out.println(allcomb.size());
//			String htmlContent = "<html>"
//	                  + "<head>"
//	                  + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
//	                  + "<title>Possible Timetable Combinations:</title>"
//	                  + "</head>"
//	                  + "<body>"
//	                  + "<h1>Possible Timetable Combinations:</h1>";
//
//
//for (Brute ob1 : allcomb) {
//	l35++;
//	htmlContent += "<h2>Timetable #" + l35 +":"+ "</h2>";
//    // Details for pure theory subjects
//    htmlContent += "<div><h2>Details for pure theory subjects:</h2><ul>";
//    for (Map.Entry<String, HashMap<String, HashSet<String>>> get : ob1.theory.entrySet()) {
//        htmlContent += "<li><strong>" + get.getKey() + "</strong>:<ul>";
//        for (Map.Entry<String, HashSet<String>> get1 : get.getValue().entrySet()) {
//            htmlContent += "<li>" + removeNumbers(get1.getKey()) + " : " + get1.getValue() + "</li>";
//        }
//        htmlContent += "</ul></li>";
//    }
//    htmlContent += "</ul></div>";
//
//    // Details for pure lab subjects
//    htmlContent += "<div><h2>Details for pure lab subjects:</h2><ul>";
//    for (Map.Entry<String, HashMap<String, HashSet<String>>> entry : ob1.lab.entrySet()) {
//        htmlContent += "<li><strong>" + entry.getKey() + "</strong>:<ul>";
//        for (Map.Entry<String, HashSet<String>> innerEntry : entry.getValue().entrySet()) {
//            htmlContent += "<li>" + removeNumbers(innerEntry.getKey()) + " : " + innerEntry.getValue() + "</li>";
//        }
//        htmlContent += "</ul></li>";
//    }
//    htmlContent += "</ul></div>";
//
//    // Details for embedded subjects
//    htmlContent += "<div><h2>Details for embedded subjects:</h2><ul>";
//    for (Map.Entry<String, HashMap<String, List<List<String>>>> subjectEntry : ob1.embedded.entrySet()) {
//        htmlContent += "<li><strong>" + subjectEntry.getKey() + "</strong>:<ul>";
//        for (Map.Entry<String, List<List<String>>> teacherEntry : subjectEntry.getValue().entrySet()) {
//            htmlContent += "<li><strong>" + removeNumbers(teacherEntry.getKey()) + "</strong>:<ul>";
//            htmlContent += "<li>Theory slots: " + teacherEntry.getValue().get(0) + "</li>";
//            htmlContent += "<li>Lab slots: " + teacherEntry.getValue().get(1) + "</li>";
//            htmlContent += "</ul></li>";
//        }
//        htmlContent += "</ul></li>";
//    }
//    htmlContent += "</ul></div>";
//
//    htmlContent += "<hr>";
//    if(l35==100) {
//    	break;
//    }
//}
//
//htmlContent += "</body>"
//                + "</html>";
//
//// Set the response content type to HTML
//res.setContentType("text/html");
//
//// Get the PrintWriter to write the HTML content to the response
//PrintWriter out = res.getWriter();
//
//// Print the HTML content
//out.println(htmlContent);
//
//xy=true;
//
//
//
//		    
//		}
	}


	    public static String removeNumbers(String input) {
	        return input.replaceAll("\\d", ""); // Regular expression to replace digits
	    }

	   


//    @Override
//    public void destroy() {
//    	System.out.println("I am become death the destroyer of worlds");
//        this.resetInstanceVariables();
//    }
	
//    private void resetInstanceVariables() {
//    	try {
//        allcomb.clear();
//        startime.clear();
//        endtime.clear();
//    	}
//    	catch(NullPointerException e) {
//    		
//    	}
//        ob1 = null;
//        ob2 = null;
//        ts = 0;
//        m = 0;
//        v = -1;
////        w = 0;
//        z = false;
//        z1 = false;
//        eve = false;
////        t1 = 0;
//        startEndError = "";
//        teacherError = "";
//        // You might also need to reset other variables if they are present
//    }
	public timetable() {
		if(lstart.size()==0) {
	        lstart.add(lstartm);
	        lstart.add(lstartt);
	        lstart.add(lstartw);
	        lstart.add(lstartth);
	        lstart.add(lstartf);
	        }
	        if(tend.size()==0) {
	        tend.add(tendm);
	        tend.add(tendt);
	        tend.add(tendw);
	        tend.add(tendth);
	        tend.add(tendf);
	        }
	        if(tstart.size()==0) {
	        tstart.add(tstartm);
	        tstart.add(tstartt);
	        tstart.add(tstartw);
	        tstart.add(tstartth);
	        tstart.add(tstartf);
	        }
	        
	        if(lend.size()==0) {
	        lend.add(lendm);
	        lend.add(lendt);
	        lend.add(lendw);
	        lend.add(lendth);
	        lend.add(lendf);
	        }

     
	}
	public timetable(timetable other) {
        this.numsub = other.numsub;
        this.list = other.list.clone();
        this.list1 = other.list1.clone();
        this.tstartm = other.tstartm.clone();
        this.tstartt = other.tstartt.clone();
        this.tstartw = other.tstartw.clone();
        this.tstartth = other.tstartth.clone();
        this.tstartf = other.tstartf.clone();
        this.tendm = other.tendm.clone();
        this.tendt = other.tendt.clone();
        this.tendw = other.tendw.clone();
        this.tendth = other.tendth.clone();
        this.tendf = other.tendf.clone();
        
        // Deep copy the ArrayLists
        this.lstart = new ArrayList<>();
        for (String[] array : other.lstart) {
            this.lstart.add(array.clone());
        }
        
        this.tend = new ArrayList<>();
        for (String[] array : other.tend) {
            this.tend.add(array.clone());
        }
        
        this.tstart = new ArrayList<>();
        for (String[] array : other.tstart) {
            this.tstart.add(array.clone());
        }
        
        this.lend = new ArrayList<>();
        for (String[] array : other.lend) {
            this.lend.add(array.clone());
        }
        
        // Deep copy the HashMaps
//        this.theory = deepCopyHashMap(other.theory);
//        this.lab = deepCopyHashMap(other.lab);
//        this.embedded = deepCopyEmbedded(other.embedded);
//        this.theory2 = deepCopyHashMap(other.theory2);
//        this.lab2 = deepCopyHashMap(other.lab2);
//        this.embedded2 = deepCopyEmbedded(other.embedded2);
//        this.theory3 = deepCopyHashMap(other.theory3);
//        this.lab3 = deepCopyHashMap(other.lab3);
//        this.embedded3 = deepCopyEmbedded(other.embedded3);
//        
//        // Deep copy the Lists
//        this.tcombinations = new ArrayList<>();
//        for (Brute obj : other.tcombinations) {
//            this.tcombinations.add(new Brute(obj));
//        }
//        
//        this.tcombinations1 = new ArrayList<>();
//        for (Brute obj : other.tcombinations1) {
//            this.tcombinations1.add(new Brute(obj));
//        }
//        
//        this.tcombinations2 = new ArrayList<>();
//        for (Brute obj : other.tcombinations2) {
//            this.tcombinations2.add(new Brute(obj));
//        }
//        
//        this.tcombinations3 = new ArrayList<>();
//        for (Brute obj : other.tcombinations3) {
//            this.tcombinations3.add(new Brute(obj));
//        }
//        
//        // Deep copy the ArrayList of teachers1
//        this.teachers1 = new ArrayList<>(other.teachers1);
        if(lstart.size()==0) {
        lstart.add(lstartm);
        lstart.add(lstartt);
        lstart.add(lstartw);
        lstart.add(lstartth);
        lstart.add(lstartf);
        }
        if(tend.size()==0) {
        tend.add(tendm);
        tend.add(tendt);
        tend.add(tendw);
        tend.add(tendth);
        tend.add(tendf);
        }
        if(tstart.size()==0) {
        tstart.add(tstartm);
        tstart.add(tstartt);
        tstart.add(tstartw);
        tstart.add(tstartth);
        tstart.add(tstartf);
        }
        
        if(lend.size()==0) {
        lend.add(lendm);
        lend.add(lendt);
        lend.add(lendw);
        lend.add(lendth);
        lend.add(lendf);
        }

      
    }
	public void timetable1(timetable other) {
        this.numsub = other.numsub;
        this.list = other.list.clone();
        this.list1 = other.list1.clone();
        this.tstartm = other.tstartm.clone();
        this.tstartt = other.tstartt.clone();
        this.tstartw = other.tstartw.clone();
        this.tstartth = other.tstartth.clone();
        this.tstartf = other.tstartf.clone();
        this.tendm = other.tendm.clone();
        this.tendt = other.tendt.clone();
        this.tendw = other.tendw.clone();
        this.tendth = other.tendth.clone();
        this.tendf = other.tendf.clone();
        
        // Deep copy the ArrayLists
        this.lstart = new ArrayList<>();
        for (String[] array : other.lstart) {
            this.lstart.add(array.clone());
        }
        
        this.tend = new ArrayList<>();
        for (String[] array : other.tend) {
            this.tend.add(array.clone());
        }
        
        this.tstart = new ArrayList<>();
        for (String[] array : other.tstart) {
            this.tstart.add(array.clone());
        }
        
        this.lend = new ArrayList<>();
        for (String[] array : other.lend) {
            this.lend.add(array.clone());
        }
        
        // Deep copy the HashMaps
//        this.theory = deepCopyHashMap(other.theory);
//        this.lab = deepCopyHashMap(other.lab);
//        this.embedded = deepCopyEmbedded(other.embedded);
//        this.theory2 = deepCopyHashMap(other.theory2);
//        this.lab2 = deepCopyHashMap(other.lab2);
//        this.embedded2 = deepCopyEmbedded(other.embedded2);
//        this.theory3 = deepCopyHashMap(other.theory3);
//        this.lab3 = deepCopyHashMap(other.lab3);
//        this.embedded3 = deepCopyEmbedded(other.embedded3);
//        
//        // Deep copy the Lists
//        this.tcombinations = new ArrayList<>();
//        for (Brute obj : other.tcombinations) {
//            this.tcombinations.add(new Brute(obj));
//        }
//        
//        this.tcombinations1 = new ArrayList<>();
//        for (Brute obj : other.tcombinations1) {
//            this.tcombinations1.add(new Brute(obj));
//        }
//        
//        this.tcombinations2 = new ArrayList<>();
//        for (Brute obj : other.tcombinations2) {
//            this.tcombinations2.add(new Brute(obj));
//        }
//        
//        this.tcombinations3 = new ArrayList<>();
//        for (Brute obj : other.tcombinations3) {
//            this.tcombinations3.add(new Brute(obj));
//        }
//        
//        // Deep copy the ArrayList of teachers1
//        this.teachers1 = new ArrayList<>(other.teachers1);
        lstart.add(lstartm);
        lstart.add(lstartt);
        lstart.add(lstartw);
        lstart.add(lstartth);
        lstart.add(lstartf);

        tend.add(tendm);
        tend.add(tendt);
        tend.add(tendw);
        tend.add(tendth);
        tend.add(tendf);

        tstart.add(tstartm);
        tstart.add(tstartt);
        tstart.add(tstartw);
        tstart.add(tstartth);
        tstart.add(tstartf);

        lend.add(lendm);
        lend.add(lendt);
        lend.add(lendw);
        lend.add(lendth);
        lend.add(lendf);

 
    }

    // Helper method for deep copying HashMaps
    private HashMap<String, HashMap<String, HashSet<String>>> deepCopyHashMap(HashMap<String, HashMap<String, HashSet<String>>> original) {
        HashMap<String, HashMap<String, HashSet<String>>> copy = new HashMap<>();
        for (String key : original.keySet()) {
            HashMap<String, HashSet<String>> innerMap = original.get(key);
            copy.put(key, new HashMap<>(innerMap));
        }
        return copy;
    }
    private HashMap<String, HashMap<String, List<List<String>>>> deepCopyEmbedded(HashMap<String, HashMap<String, List<List<String>>>> original) {
        HashMap<String, HashMap<String, List<List<String>>>> copy = new HashMap<>();
        for (String key : original.keySet()) {
            HashMap<String, List<List<String>>> innerMap = original.get(key);
            HashMap<String, List<List<String>>> innerCopyMap = new HashMap<>();

            for (String innerKey : innerMap.keySet()) {
                List<List<String>> innerList = innerMap.get(innerKey);
                List<List<String>> innerCopyList = new ArrayList<>();

                for (List<String> sublist : innerList) {
                    // Create a new ArrayList and populate it with deep copies of sublist elements
                    List<String> sublistCopy = new ArrayList<>(sublist);
                    innerCopyList.add(sublistCopy);
                }

                innerCopyMap.put(innerKey, innerCopyList);
            }

            copy.put(key, innerCopyMap);
        }
        return copy;
    }


	
	Scanner in = new Scanner(System.in);

    int numsub=0; //Count number of subjects that user chooses
    String list[] = {"A1", "B1", "C1", "D1", "E1", "F1", "G1", "TA1", "TB1", "TC1", "V1", "TE1", "TF1", "TG1", "TAA1", "V2", "TCC1", "TD1"};
    String[] list1 = {"L1", "L2", "L3", "L4", "L5", "L6", "L7", "L8", "L9", "L10",
            "L11", "L12", "L13", "L14", "L15", "L16", "L17", "L18", "L19", "L20",
            "L21", "L22", "L23", "L24", "L25", "L26", "L27", "L28", "L29", "L30"};
    String[] tstartm = {"A1","F1","D1","TB1","TG1"};
    String[] tstartt = {"B1","G1","E1","TC1","TAA1"};
    String [] tstartw = {"C1","A1","F1"};
    String [] tstartth = {"D1","B1","G1","TE1","TCC1"};
    String[] tstartf = {"E1","C1","TA1","TF1","TD1"};
    String[] tendm = {"A2","F2","D2","TB2","TG2"};
    String[] tendt = {"B2","G2","E2","TC2","TAA2"};
    String [] tendw = {"C2","A2","F2","TD2","TBB2"};
    String [] tendth = {"D2","B2","G2","TE2","TCC2"};
    String[] tendf = {"E2","C2","TA2","TF2","TDD2"};

    String[] lstartm = {"L1","L3","L5"};
    String[] lstartt = {"L7", "L9", "L11"};
    String [] lstartw = {"L13", "L15", "L17"};
    String [] lstartth = {"L19", "L21","L23"};
    String[] lstartf = {"L25", "L27", "L29"};
    String[] lendm = {"L31", "L33", "L35"};
    String[] lendt = {"L37", "L39", "L41"};
    String [] lendw = {"L43", "L45", "L47"};
    String [] lendth = {"L49", "L51", "L53"};
    String[] lendf = {"L55", "L57", "L59"};

    List<String[]> lstart = new ArrayList<>();

    List<String[]> tend = new ArrayList<>();

    List<String[]> tstart = new ArrayList<>();

    List<String[]> lend = new ArrayList<>();



    List<String> theory1 = Arrays.asList(list);
    List<String> lab1 = Arrays.asList(list1);
//    public HashMap<String, HashMap<String, HashSet<String>>> theory = new HashMap<>();
//    public HashMap<String, HashMap<String, HashSet<String>>> lab = new HashMap<>();
//    public HashMap<String, HashMap<String, List<List<String>>>> embedded = new HashMap<>();
//
//    public HashMap<String, HashMap<String, HashSet<String>>> theory2=new HashMap<>();
//
//    public HashMap<String, HashMap<String, HashSet<String>>> lab2=new HashMap<>();
//
//    public HashMap<String, HashMap<String, List<List<String>>>> embedded2=new HashMap<>();
//
//    public HashMap<String, HashMap<String, HashSet<String>>> theory3=new HashMap<>();
//
//    public HashMap<String, HashMap<String, HashSet<String>>> lab3=new HashMap<>();
//
//    public HashMap<String, HashMap<String, List<List<String>>>> embedded3=new HashMap<>();
//
//    List<Brute> tcombinations = new ArrayList<>();
//
//    List<Brute> tcombinations1 = new ArrayList<>();
//
//    List<Brute> tcombinations2 = new ArrayList<>();
//
//
//    List<Brute> tcombinations3 = new ArrayList<>();
//
//    List<String> teachers1 = new ArrayList<>();
    
    public timetable(HashMap<String, HashMap<String, HashSet<String>>> theory1, HashMap<String, HashMap<String, HashSet<String>>> lab1, HashMap<String, HashMap<String, List<List<String>>>> embedded1,HashMap<String, HashMap<String, HashSet<String>>> theory3, HashMap<String, HashMap<String, HashSet<String>>> lab3, HashMap<String, HashMap<String, List<List<String>>>> embedded3,List<String> teachers1) {
//        this.theory = theory1;
//        this.lab = lab1;
//        this.embedded = embedded1;
        lstart.add(lstartm);
        lstart.add(lstartt);
        lstart.add(lstartw);
        lstart.add(lstartth);
        lstart.add(lstartf);

        tend.add(tendm);
        tend.add(tendt);
        tend.add(tendw);
        tend.add(tendth);
        tend.add(tendf);

        tstart.add(tstartm);
        tstart.add(tstartt);
        tstart.add(tstartw);
        tstart.add(tstartth);
        tstart.add(tstartf);

        lend.add(lendm);
        lend.add(lendt);
        lend.add(lendw);
        lend.add(lendth);
        lend.add(lendf);

//        this.teachers1=teachers1;

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
    
    public void mORe(int t, HashMap<String, HashMap<String, HashSet<String>>> theory, HashMap<String, HashMap<String, HashSet<String>>> lab, HashMap <String, HashMap<String, List<List<String>>>> embedded,HashMap<String, HashMap<String, HashSet<String>>> theory2, HashMap<String, HashMap<String, HashSet<String>>> lab2, HashMap <String, HashMap<String, List<List<String>>>> embedded2,HashMap<String, HashMap<String, HashSet<String>>> theory3, HashMap<String, HashMap<String, HashSet<String>>> lab3, HashMap <String, HashMap<String, List<List<String>>>> embedded3) {
        System.out.println("Value of Time in MORE IS:"+t);
    	if (t == 1) {
            for (Map.Entry<String, HashMap<String, HashSet<String>>> get : theory.entrySet()) {
                theory2.put(get.getKey(),new HashMap<>());
                for (Map.Entry<String, HashSet<String>> get1 : get.getValue().entrySet()) {
                    if (!theory1.contains(get1.getValue().iterator().next())) {
                        theory2.get(get.getKey()).put(get1.getKey(), get1.getValue());
                    }
                }
            }

            for (Map.Entry<String, HashMap<String, HashSet<String>>> get : lab.entrySet()) {
                lab2.put(get.getKey(),new HashMap<>());
                for (Map.Entry<String, HashSet<String>> get1 : get.getValue().entrySet()) {
                    if (lab1.contains(get1.getValue().iterator().next())) {
                        lab2.get(get.getKey()).put(get1.getKey(), get1.getValue());

                    }

                }
            }

            for (Map.Entry<String, HashMap<String, List<List<String>>>> get : embedded.entrySet()) {
                embedded2.put(get.getKey(),new HashMap<>());
                for (Map.Entry<String, List<List<String>>> get1 : get.getValue().entrySet()) {

                    if (!theory1.contains(get1.getValue().get(0).get(0))) {
                        embedded2.get(get.getKey()).put(get1.getKey(), get1.getValue());

                    }
                }
            }
            
            theory3.putAll(theory2);;
            lab3.putAll(lab2);
            embedded3.putAll(embedded2);



        } else {

            for (Map.Entry<String, HashMap<String, HashSet<String>>> get : theory.entrySet()) {
                theory2.put(get.getKey(),new HashMap<>());
                for (Map.Entry<String, HashSet<String>> get1 : get.getValue().entrySet()) {
                    if (theory1.contains(get1.getValue().iterator().next())) {
                        theory2.get(get.getKey()).put(get1.getKey(), get1.getValue());


                    }
                }
            }

            for (Map.Entry<String, HashMap<String, HashSet<String>>> get : lab.entrySet()) {
                lab2.put(get.getKey(),new HashMap<>());
                for (Map.Entry<String, HashSet<String>> get1 : get.getValue().entrySet()) {
                    if (!lab1.contains(get1.getValue().iterator().next())) {
                        lab2.get(get.getKey()).put(get1.getKey(), get1.getValue());


                    }

                }
            }

            for (Map.Entry<String, HashMap<String, List<List<String>>>> get : embedded.entrySet()) {
                embedded2.put(get.getKey(),new HashMap<>());
                for (Map.Entry<String, List<List<String>>> get1 : get.getValue().entrySet()) {

                    if (theory1.contains(get1.getValue().get(0).get(0))) {
                        embedded2.get(get.getKey()).put(get1.getKey(), get1.getValue());


                    }
                }
            }
            
            theory3.putAll(theory2);;
            lab3.putAll(lab2);
            embedded3.putAll(embedded2);







        }


    }

    public void subjects(List<String> sub,HashMap<String, HashMap<String, HashSet<String>>> theory, HashMap<String, HashMap<String, HashSet<String>>> lab, HashMap <String, HashMap<String, List<List<String>>>> embedded,HashMap<String, HashMap<String, HashSet<String>>> theory2, HashMap<String, HashMap<String, HashSet<String>>> lab2, HashMap <String, HashMap<String, List<List<String>>>> embedded2,HashMap<String, HashMap<String, HashSet<String>>> theory3, HashMap<String, HashMap<String, HashSet<String>>> lab3, HashMap <String, HashMap<String, List<List<String>>>> embedded3) throws IOException {
        theory.clear();
        lab.clear();
        embedded.clear();
        theory3.clear();
        lab3.clear();
        embedded3.clear();
        List<String> list3=sub;
        numsub=list3.size();
        for (Map.Entry<String, HashMap<String, HashSet<String>>> get : theory2.entrySet()) {
            if (list3.contains(get.getKey())) {
                theory.put(get.getKey(),get.getValue());

            }
        }
        for (Map.Entry<String, HashMap<String, HashSet<String>>> get : lab2.entrySet()) {

            if (list3.contains(get.getKey())) {
                lab.put(get.getKey(),get.getValue());

            }

        }

        for (Map.Entry<String, HashMap<String, List<List<String>>>> get : embedded2.entrySet()) {
            if (list3.contains(get.getKey())) {
                embedded.put(get.getKey(),get.getValue());

            }
        }
        
        theory3.putAll(theory);;
        lab3.putAll(lab);
        embedded3.putAll(embedded);

    }

    public List<Brute> bruteForce(HashMap<String, HashMap<String, HashSet<String>>> theory, HashMap<String, HashMap<String, HashSet<String>>> lab, HashMap <String, HashMap<String, List<List<String>>>> embedded,List<Brute> tcombinations) {
        List<HashMap<String, HashMap<String, HashSet<String>>>> combinations = generateCombinations(theory);
        List<HashMap<String, HashMap<String, HashSet<String>>>> combinations1 = generateCombinations(lab);
        List<HashMap<String, HashMap<String, List<List<String>>>>> combinations2 = generateCombinations1(embedded);
        HashSet<String> t = new HashSet<>();
        HashSet<String> l = new HashSet<>();
        HashSet<String> e = new HashSet<>();
        HashMap<String,HashSet<String>> teachers = new HashMap<>();
        HashSet<String> slots = new HashSet<>();


        for (HashMap<String, HashMap<String, HashSet<String>>> combination : combinations) {
            t.clear();
            for (Map.Entry<String, HashMap<String, HashSet<String>>> get : combination.entrySet()) {
                for (Map.Entry<String, HashSet<String>> get1 : get.getValue().entrySet()) {
                    for (String x :
                            get1.getValue()) {
                        t.add(x);
                    }
                }

            }

            for (HashMap<String, HashMap<String, HashSet<String>>> combination1 : combinations1) {
                l.clear();
                for (Map.Entry<String, HashMap<String, HashSet<String>>> get2 : combination1.entrySet()) {
                    for (Map.Entry<String, HashSet<String>> get3 : get2.getValue().entrySet()) {
                        for (String y :
                                get3.getValue()) {
                            l.add(y);
                        }
                    }
                }


                        for (HashMap<String, HashMap<String, List<List<String>>>> combination2 : combinations2) {
                            e.clear();
                            boolean k1 = false;
                            for (Map.Entry<String, HashMap<String, List<List<String>>>> get4 : combination2.entrySet()) {
                                for (Map.Entry<String, List<List<String>>> get5 : get4.getValue().entrySet()) {
                                    for (List<String> x1 :
                                            get5.getValue()) {
                                        for (String x2 :
                                                x1) {
                                            if (t.contains(x2) || l.contains(x2)) {
                                                k1 = true;
                                                e.clear();
                                                break;
                                            }
                                        }
                                        if (k1) {
                                            break;
                                        }
                                    }
                                    if (k1) {
                                        break;
                                    }

                                }
                                if (k1) {
                                    break;
                                }
                            }
                            if (!k1) {
                                teachers = findTeachers(combination, combination1, combination2);
                                slots = findSlots(combination, combination1, combination2);
                                Brute ob = new Brute(combination, combination1, combination2,teachers,slots);
                                tcombinations.add(ob);
                            }
                        }




            }


        }
        return tcombinations;
    }

    private HashSet<String> findSlots(HashMap<String, HashMap<String, HashSet<String>>> combination, HashMap<String, HashMap<String, HashSet<String>>> combination1, HashMap<String, HashMap<String, List<List<String>>>> combination2) {
        HashSet<String> slots = new HashSet<>();
        for (Map.Entry<String, HashMap<String, HashSet<String>>> get : combination.entrySet()) {
            for (Map.Entry<String, HashSet<String>> get1 : get.getValue().entrySet()) {
                slots.addAll(get1.getValue());
            }
        }
        for (Map.Entry<String, HashMap<String, HashSet<String>>> entry : combination1.entrySet()) {
            for (Map.Entry<String, HashSet<String>> innerEntry : entry.getValue().entrySet()) {
                slots.addAll(innerEntry.getValue());
            }
        }
        for (Map.Entry<String, HashMap<String, List<List<String>>>> subjectEntry : combination2.entrySet()) {
            for (Map.Entry<String, List<List<String>>> teacherEntry : subjectEntry.getValue().entrySet()) {
                for(List<String> x:teacherEntry.getValue()){
                    slots.addAll(x);
                }
            }
        }
        return slots;
    }

    private HashMap<String,HashSet<String>> findTeachers(HashMap<String, HashMap<String, HashSet<String>>> combination, HashMap<String, HashMap<String, HashSet<String>>> combination1, HashMap<String, HashMap<String, List<List<String>>>> combination2) {
        HashMap<String,HashSet<String>> teachers = new HashMap<>();
        for (Map.Entry<String, HashMap<String, HashSet<String>>> get : combination.entrySet()) {
            teachers.put(get.getKey(),new HashSet<>());
            for (Map.Entry<String, HashSet<String>> get1 : get.getValue().entrySet()) {
                teachers.get(get.getKey()).add(get1.getKey());
            }
        }
        for (Map.Entry<String, HashMap<String, HashSet<String>>> entry : combination1.entrySet()) {
            teachers.put(entry.getKey(),new HashSet<>());
            for (Map.Entry<String, HashSet<String>> innerEntry : entry.getValue().entrySet()) {
                teachers.get(entry.getKey()).add(innerEntry.getKey());
            }
        }
        for (Map.Entry<String, HashMap<String, List<List<String>>>> subjectEntry : combination2.entrySet()) {
            teachers.put(subjectEntry.getKey(),new HashSet<>());
            for (Map.Entry<String, List<List<String>>> teacherEntry : subjectEntry.getValue().entrySet()) {
                teachers.get(subjectEntry.getKey()).add(teacherEntry.getKey());
            }
        }
        return teachers;
    }

    private static List<HashMap<String, HashMap<String, HashSet<String>>>> generateCombinations(HashMap<String, HashMap<String, HashSet<String>>> theoryT) {
        List<HashMap<String, HashMap<String, HashSet<String>>>> combinations = new ArrayList<>();
        generateCombinationsHelper(theoryT, new ArrayList<>(), combinations);
        return combinations;
    }
    private static List<HashMap<String, HashMap<String, List<List<String>>>>> generateCombinations1(HashMap<String, HashMap<String, List<List<String>>>> theoryT) {
        List<HashMap<String, HashMap<String, List<List<String>>>>> combinations = new ArrayList<>();
        generateCombinationsHelper1(theoryT, new ArrayList<>(), combinations);
        return combinations;
    }

    private static void generateCombinationsHelper(HashMap<String, HashMap<String, HashSet<String>>> theoryT,
                                                   List<SubjectTeacherSlot> currentCombination,
                                                   List<HashMap<String, HashMap<String, HashSet<String>>>> combinations) {
        // If all subjects have been covered, add the current combination to the list of combinations
        if (currentCombination.size() == theoryT.size()) {
            combinations.add(new HashMap<>());
            for (SubjectTeacherSlot comb1: currentCombination) {
                if(!combinations.get(combinations.size()-1).containsKey(comb1.subject)){
                    combinations.get(combinations.size()-1).put(comb1.subject,new HashMap<>());
                }
                combinations.get(combinations.size()-1).get(comb1.subject).put(comb1.teacher, comb1.slot);
            }
            return;
        }

        // Get the next subject
        String[] subjects = theoryT.keySet().toArray(new String[0]);
        String subject = subjects[currentCombination.size()];

        // Get the teachers for the current subject
        HashMap<String, HashSet<String>> teachers = theoryT.get(subject);

        // Iterate over the teachers and their slots for the current subject
        for (Map.Entry<String, HashSet<String>> entry : teachers.entrySet()) {
            String teacher = entry.getKey();
            HashSet<String> slots = entry.getValue();

            // For each slot of the current teacher, check if it clashes with any of the existing slots in the current combination

            if (!isSlotTaken(currentCombination, slots)) {
                // If no clash, create a new SubjectTeacherSlot object with the subject, teacher, and slot and add it to the current combination
                SubjectTeacherSlot sts = new SubjectTeacherSlot(subject, teacher, slots);
                currentCombination.add(sts);
                // Call itself recursively with the updated current combination
                generateCombinationsHelper(theoryT, currentCombination, combinations);
                // Remove the SubjectTeacherSlot object from the current combination
                currentCombination.remove(sts);
            }


        }
    }
    private static void generateCombinationsHelper1(HashMap<String, HashMap<String, List<List<String>>>> theoryT,
                                                   List<SubjectTeacherSlotEmbedded> currentCombination,
                                                   List<HashMap<String, HashMap<String, List<List<String>>>>> combinations) {
        // If all subjects have been covered, add the current combination to the list of combinations
        if (currentCombination.size() == theoryT.size()) {
            combinations.add(new HashMap<>());
            for (SubjectTeacherSlotEmbedded comb1: currentCombination) {
                if(!combinations.get(combinations.size()-1).containsKey(comb1.subject)){
                    combinations.get(combinations.size()-1).put(comb1.subject,new HashMap<>());
                }
                combinations.get(combinations.size()-1).get(comb1.subject).put(comb1.teacher, comb1.slot);
            }
            return;
        }

        // Get the next subject
        String[] subjects = theoryT.keySet().toArray(new String[0]);
        String subject = subjects[currentCombination.size()];

        // Get the teachers for the current subject
        HashMap<String, List<List<String>>> teachers = theoryT.get(subject);

        // Iterate over the teachers and their slots for the current subject
        for (Map.Entry<String, List<List<String>>> entry : teachers.entrySet()) {
            String teacher = entry.getKey();
            List<List<String>> slots = entry.getValue();

            // For each slot of the current teacher, check if it clashes with any of the existing slots in the current combination

            if (!isSlotTaken1(currentCombination, slots)) {
                // If no clash, create a new SubjectTeacherSlot object with the subject, teacher, and slot and add it to the current combination
                SubjectTeacherSlotEmbedded sts = new SubjectTeacherSlotEmbedded(subject, teacher, slots);
                currentCombination.add(sts);
                // Call itself recursively with the updated current combination
                generateCombinationsHelper1(theoryT, currentCombination, combinations);
                // Remove the SubjectTeacherSlot object from the current combination
                currentCombination.remove(sts);
            }


        }
    }
    private static boolean isSlotTaken(List<SubjectTeacherSlot> currentCombination, HashSet<String> slot) {
        for (SubjectTeacherSlot sts : currentCombination) {
            for(String x : sts.slot){
                if (slot.contains(x)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isSlotTaken1(List<SubjectTeacherSlotEmbedded> currentCombination, List<List<String>> slot) {
        boolean k = false;
        for (SubjectTeacherSlotEmbedded sts : currentCombination) {
            for(List<String> x : sts.slot){
                if(!k) {
                    for (String y: x)
                          {
                        if (slot.get(0).contains(y)){
                            return true;
                        }

                    }

                }
                else{
                    for (String y: x)
                    {
                        if (slot.get(1).contains(y)){
                            return true;
                        }

                    }
                }
                k=!k;
            }
        }
        return false;
    }

    void clearts1(){
        for(Map.Entry<String,HashSet<String>> get : Brute.teacherSubject1.entrySet()){
            get.getValue().clear();
        }
    }


    public List<Brute> teachers(List<String> teacher,String[] arr,List<Brute> tcombinations,List<Brute> tcombinations1,List<Brute> tcombinations3){
        tcombinations3.addAll(tcombinations);
        numsub=teacher.size();
        for (int i = 0; i < teacher.size(); i++) {
            String sub="";
            String x="";
            x = teacher.get(i);
            System.out.println(x);
            boolean k = false;
            if(i==0){
                for(Map.Entry<String,HashSet<String>> get : Brute.teacherSubject.entrySet()){
                    for(String y : get.getValue()){
                        if(x.length()==y.length() && x.equals(y)){
                            k= true;
                            sub=get.getKey();
                        }
                        if(y.length()>x.length() && x.equals(y.substring(0,x.length()))){
                            k=true;
                            sub=get.getKey();
                        }

                    }
                }
                if(!k){
                	arr[0] = teacher.get(i)+ " is not available in the dataset, please correct spelling";
                    return null;
                }


                for(Brute ob : tcombinations){
                    if((ob.theory.containsKey(sub)&&contains1(ob.theory.get(sub),x))||(ob.lab.containsKey(sub)&&contains1(ob.lab.get(sub),x))||(ob.embedded.containsKey(sub)&&contains2(ob.embedded.get(sub),x))){
                        tcombinations1.add(ob);
                        k=false;
                        HashMap<String,HashSet<String>> idk1 = findTeachers(ob.theory,ob.lab,ob.embedded);
                        for (Map.Entry<String,HashSet<String>> get:idk1.entrySet()) {
                            for(String a:get.getValue()){
                                if(!Brute.teacherSubject1.get(get.getKey()).contains(a)){
                                    Brute.teacherSubject1.get(get.getKey()).add(a);
                                }
                            }
                        }
                    }
                }
                if(k){
                        tcombinations.clear();
                        tcombinations.addAll(tcombinations3);
                        tcombinations1.clear();
                        clearts1();
                        arr[0] = teacher.get(i)+ " is not available due to inavailability in morning/evening please retry";
                        return null;
                }

            }
            else{
                if(i%2!=0){
                    tcombinations.clear();
                }
                else{
                    tcombinations1.clear();
                }
                k=false;
                for(Map.Entry<String,HashSet<String>> get : Brute.teacherSubject.entrySet()){
                    for(String y : get.getValue()){
                        if(x.length()==y.length() && x.equals(y)){
                            k= true;
                            sub=get.getKey();
                        }
                        if(y.length()>x.length() && x.equals(y.substring(0,x.length()))){
                            k=true;
                            sub=get.getKey();
                        }

                    }
                }
                if(!k){
                    tcombinations.clear();
                    tcombinations.addAll(tcombinations3);
                    tcombinations1.clear();
                    clearts1();
                    arr[0] = teacher.get(i)+ " is not available in the dataset please correct spelling";
                    return null;
                }



                k=true;
                System.out.println("Going to print sub: "+sub);

                for(String z:Brute.teacherSubject1.get(sub)){
                    if(x.equals(z)){
                        k=false;
                        break;
                    }
                    if(z.length()>x.length() && x.equals(z.substring(0,x.length()))){
                        k=false;
                        break;
                    }
                }

                while (k){
                	arr[0] = teacher.get(i)+" not available due to clash in slots with previously selected teachers or inavailability in morning theory/evening theory please select from the following teachers: (Ignore numbers)"+ Brute.teacherSubject1.get(sub);
                	return null;
                    
                }
                clearts1();


                if(i%2!=0){
                    for(Brute ob : tcombinations1){
                        if((ob.theory.containsKey(sub)&&contains1(ob.theory.get(sub),x))||(ob.lab.containsKey(sub)&&contains1(ob.lab.get(sub),x))||(ob.embedded.containsKey(sub)&&contains2(ob.embedded.get(sub),x))){
                            k=false;
                            tcombinations.add(ob);
                            HashMap<String,HashSet<String>> idk1 = findTeachers(ob.theory,ob.lab,ob.embedded);
                            for (Map.Entry<String,HashSet<String>> get:idk1.entrySet()) {
                                for(String a:get.getValue()){
                                    if(!Brute.teacherSubject1.get(get.getKey()).contains(a)){
                                        Brute.teacherSubject1.get(get.getKey()).add(a);
                                    }
                                }
                            }
                        }
                    }
                }
                else{
                    for(Brute ob : tcombinations){
                        if((ob.theory.containsKey(sub)&&contains1(ob.theory.get(sub),x))||(ob.lab.containsKey(sub)&&contains1(ob.lab.get(sub),x))||(ob.embedded.containsKey(sub)&&contains2(ob.embedded.get(sub),x))){
                            k=false;
                            tcombinations1.add(ob);
                            HashMap<String,HashSet<String>> idk1 = findTeachers(ob.theory,ob.lab,ob.embedded);
                            for (Map.Entry<String,HashSet<String>> get:idk1.entrySet()) {
                                for(String a:get.getValue()){
                                    if(!Brute.teacherSubject1.get(get.getKey()).contains(a)){
                                        Brute.teacherSubject1.get(get.getKey()).add(a);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if(numsub%2!=0){
            tcombinations.clear();
            return tcombinations1;
        }
        else{
            tcombinations1.clear();
            return tcombinations;
        }

    }

    boolean contains1(HashMap<String, HashSet<String>> tech,String x){
        for(Map.Entry<String,HashSet<String>> get: tech.entrySet()){
            String y = get.getKey();
            if(x.equals(y)){
                return true;
            }
            if(y.length()>x.length() && x.equals(y.substring(0,x.length()))){
                return true;
            }
        }
        return false;
    }
    boolean contains2(HashMap<String, List<List<String>>> tech,String x){
        for(Map.Entry<String,List<List<String>>> get: tech.entrySet()){
            String y = get.getKey();
            if(x.equals(y)){
                return true;
            }
            if(y.length()>x.length() && x.equals(y.substring(0,x.length()))){
                return true;
            }
        }
        return false;
    }
    List<Brute> theoryloop1(int s, int t,String arr[],List<Brute> tcombinations,List<Brute> tcombinations1) {
        System.out.println("INSIDE THEORY LOOP1");
        List<Brute> tcombinations7 = new ArrayList<>();
    	tcombinations1=tcombinations7;
        int k = 0;
        boolean x = false;
        System.out.println("Tcombinations:  "+tcombinations.size());
        for (Brute ob : tcombinations) {
            for (int i = 0; i < s - 1; i++) {
                if (ob.slots.contains(tstart.get(t)[i])) {
                    k = 1;
                    break;
                }
            }
            if (k == 0) {
                x = true;
                tcombinations1.add(ob);
            }
            k = 0;
        }
        if (!x) {
        	System.out.println("INSIDE FAIL CONDITION");
        	arr[0]="Class cannot start at this time on "+days[t]+", please select an earlier time";
        	System.out.println("THE VALUE IS"+arr[0]);
        	return null;
//            if (t == 0) {
//                do {
//                    System.out.println("Enter what is the minimum time at which class should start on Monday: \n1)8:00\n2)9:00\n3)10:00\n4)11:00\n5)12:00\n6)No morning");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s != 6) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s != 6);
//                return theoryloop1(s, t);
//            }
//            if (t == 1) {
//                do {
//                    System.out.println("Enter what is the minimum time at which class should start on Tuesday: \n1)8:00\n2)9:00\n3)10:00\n4)11:00\n5)12:00\n6)No morning");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s != 6) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s != 6);
//                return theoryloop1(s, t);
//            }
//            if (t == 2) {
//                do {
//                    System.out.println("Enter what is the minimum time at which class should start on Wednesday: \n1)8:00\n2)9:00\n3)10:00\n4)11:00\n5)12:00\n6)No morning");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s != 6) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s != 6);
//                return theoryloop1(s, t);
//            }
//            if (t == 3) {
//                do {
//                    System.out.println("Enter what is the minimum time at which class should start on Thursday: \n1)8:00\n2)9:00\n3)10:00\n4)11:00\n5)12:00\n6)No morning");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s != 6) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s != 6);
//                return theoryloop1(s, t);
//            }
//            if (t == 4) {
//                do {
//                    System.out.println("Enter what is the minimum time at which class should start on Friday: \n1)8:00\n2)9:00\n3)10:00\n4)11:00\n5)12:00\n6)No morning");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s != 6) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s != 6);
//                return theoryloop1(s, t);
//            }
        }
        return tcombinations1;
    }

    List<Brute> labloop1(int s, int t,String arr[],List<Brute> tcombinations,List<Brute> tcombinations1) {
    	 List<Brute> tcombinations7 = new ArrayList<>();
    	 tcombinations1=tcombinations7;
        int k = 0;
        if (s == 4) {
            s -= 4;
        }
        boolean x = false;

        for (Brute ob : tcombinations) {
            for (int i = s; i < lend.get(t).length; i++) {
                if (ob.slots.contains(lend.get(t)[i])) {
                    k = 1;
                    break;
                }
            }
            if (k == 0) {
                x = true;
                tcombinations1.add(ob);
            }
            k = 0;
        }
        if (!x) {
        	arr[0]="Class cannot end at this time on "+days[t]+", please select a later time";
            return null;
//            if (t == 0) {
//                do {
//                    System.out.println("Enter what is the maximum time at which class should end on Monday: \n1)3:40\n2)5:30\n3)7:20\n4)No evening");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s != 2 && s != 3 && s != 4);
//                return labloop1(s, t);
//            }
//            if (t == 1) {
//                do {
//                    System.out.println("Enter what is the maximum time at which class should end on Tuesday: \n1)3:40\n2)5:30\n3)7:20\n4)No evening");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s != 2 && s != 3 && s != 4);
//                return labloop1(s, t);
//            }
//            if (t == 2) {
//                do {
//                    System.out.println("Enter what is the maximum time at which class should end on Wednesday: \n1)3:40\n2)5:30\n3)7:20\n4)No evening");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s !=2 && s != 3 && s != 4);
//                return labloop1(s, t);
//            }
//            if (t == 3) {
//                do {
//                    System.out.println("Enter what is the maximum time at which class should end on Thursday: \n1)3:40\n2)5:30\n3)7:20\n4)No evening");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s != 2 && s != 3 && s != 4);
//                return labloop1(s, t);
//            }
//            if (t == 4) {
//                do {
//                    System.out.println("Enter what is the maximum time at which class should end on Friday: \n1)3:40\n2)5:30\n3)7:20\n4)No evening");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s != 2 && s != 3 && s != 4);
//                return labloop1(s, t);
//            }
        }
        return tcombinations1;
    }

    List<Brute> labloop(int s, int t,String arr[],List<Brute> tcombinations,List<Brute> tcombinations1) {
        List<Brute> tcombinations7 = new ArrayList<>();
    	tcombinations1 = tcombinations7;
    	
        int k = 0;
        boolean x = false;
        for (Brute ob : tcombinations) {
            for (int i = 0; i < s - 1; i++) {
                if (ob.slots.contains(lstart.get(t)[i])) {
                    k = 1;
                    break;
                }
            }
            if (k == 0) {
                x = true;
                tcombinations1.add(ob);
            }
            k = 0;
        }
        if (!x) {
        	
        	System.out.println("HELLOOOOOOOOO");
        	
        	System.out.println("FAIL LABLOOP");
        	arr[0]="Class cannot start at this time on "+days[t]+", please select an earlier time";
        	System.out.println(arr[0]);
            return null;
//            if (t == 0) {
//                do {
//                    System.out.println("Enter what is the minimum time at which class should start on Monday: \n1)8:00\n2)9:50\n3)11:40\n4)No morning");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s != 2 && s != 3 && s != 4);
//                return labloop(s, t);
//            }
//
//            if (t == 1) {
//                do {
//                    System.out.println("Enter what is the minimum time at which class should start on Tuesday: \n1)8:00\n2)9:50\n3)11:40\n4)No morning");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s != 2 && s != 3 && s != 4);
//                return labloop(s, t);
//            }
//
//            if (t == 2) {
//                do {
//                    System.out.println("Enter what is the minimum time at which class should start on Wednesday: \n1)8:00\n2)9:50\n3)11:40\n4)No morning");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s != 2 && s != 3 && s != 4);
//                return labloop(s, t);
//            }
//
//            if (t == 3) {
//                do {
//                    System.out.println("Enter what is the minimum time at which class should start on Thursday: \n1)8:00\n2)9:50\n3)11:40\n4)No morning");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s != 2 && s != 3 && s != 4);
//                return labloop(s, t);
//            }
//
//            if (t == 4) {
//                do {
//                    System.out.println("Enter what is the minimum time at which class should start on Friday: \n1)8:00\n2)9:50\n3)11:40\n4)No morning");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s != 2 && s != 3 && s != 4);
//                return labloop(s, t);
//            }
        }
        
        
        System.out.println("TCOMBINATION1 SIZEEE:"+tcombinations1.size());

        return tcombinations1;
    }

    List<Brute> theoryloop(int s, int t,String arr[],List<Brute> tcombinations,List<Brute> tcombinations1) {
    	List<Brute> tcombinations7 = new ArrayList<>();
    	tcombinations1=tcombinations7;
        int k = 0;
        if (s == 6) {
            s -= 6;
        }
        boolean x = false;

        for (Brute ob : tcombinations) {
            for (int i = s; i < tend.get(t).length; i++) {
                if (ob.slots.contains(tend.get(t)[i])) {
                    k = 1;
                    break;
                }
            }
            if (k == 0) {
                x = true;
                tcombinations1.add(ob);
            }
            k = 0;
        }
        if (!x) {
        	arr[0]="Class cannot end at this time on "+days[t]+", please select a later time";
            return null;
//            if (t == 0) {
//                do {
//                    System.out.println("Enter what is the maximum time at which class should end on Monday: \n1)2:50\n2)3:50\n3)4:50\n4)5:50\n5)6:50\n6)No evening");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s != 6) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s != 6);
//                return theoryloop(s, t);
//            }
//            if (t == 1) {
//                do {
//                    System.out.println("Enter what is the maximum time at which class should end on Tuesday: \n1)2:50\n2)3:50\n3)4:50\n4)5:50\n5)6:50\n6)No evening");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s !=6) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s != 6);
//                return theoryloop(s, t);
//            }
//            if (t == 2) {
//                do {
//                    System.out.println("Enter what is the maximum time at which class should end on Wednesday: \n1)2:50\n2)3:50\n3)4:50\n4)5:50\n5)6:50\n6)No evening");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s != 6) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s != 6);
//                return theoryloop(s, t);
//            }
//            if (t == 3) {
//                do {
//                    System.out.println("Enter what is the maximum time at which class should end on Thursday: \n1)2:50\n2)3:50\n3)4:50\n4)5:50\n5)6:50\n6)No evening");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s != 6) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s != 6);
//                return theoryloop(s, t);
//            }
//            if (t == 4) {
//                do {
//                    System.out.println("Enter what is the maximum time at which class should end on Friday: \n1)2:50\n2)3:50\n3)4:50\n4)5:50\n5)6:50\n6)No evening");
//                    s = in.nextInt();
//                    if (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s != 6) {
//                        System.out.println("Please retry");
//                    }
//                } while (s != 1 && s != 2 && s != 3 && s != 4 && s != 5 && s != 6);
//                return theoryloop(s, t);
//            }
        }
        
        return tcombinations1;
    }




    public List<Brute> startend(int t,List<Integer> startime,List<Integer> endtime,String arr[],int arr1[],List<Brute> tcombinations,List<Brute> tcombinations2,List<Brute> tcombinations1){
        
    	System.out.println("INSIDE STARTEND");
    	System.out.println(tcombinations.size());
    	if(tcombinations.isEmpty()){

            tcombinations.addAll(tcombinations1);
            tcombinations1.clear();

        }
        if(t==1){
            int s1=0,s2=0,s3=0,s4=0,s5=0;
            int e1=0,e2=0,e3=0,e4=0,e5=0;
//            while (s1!=1 && s1!=2 && s1!=3 && s1!=4) {
//                System.out.println("Enter what is the minimum time at which class should start on Monday: \n1)8:00\n2)9:50\n3)11:40\n4)No morning");
//                s1 = in.nextInt();
//                if(s1!=1 && s1!=2 && s1!=3 && s1!=4){
//                    System.out.println("Please retry");
//                }
//            }
            s1=startime.get(0);
            
            try {
            tcombinations2.addAll(labloop(s1,0,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	System.out.println("S1 FAILL");
            	System.out.println(arr[0]);
            	return null;
            }
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations2.clear();

//            while (s2!=1 && s2!=2 && s2!=3 && s2!=4) {
//                System.out.println("Enter what is the minimum time at which class should start on Tuesday: \n1)8:00\n2)9:50\n3)11:40\n4)No morning");
//                s2 = in.nextInt();
//                if(s2!=1 && s2!=2 && s2!=3 && s2!=4){
//                    System.out.println("Please retry");
//                }
//            }
            s2=startime.get(1);
            try {
            tcombinations2.addAll(labloop(s2,1,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	System.out.println(arr[0]);

            	return null;
            }
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations2.clear();

//            while (s3!=1 && s3!=2 && s3!=3 && s3!=4) {
//                System.out.println("Enter what is the minimum time at which class should start on Wednesday: \n1)8:00\n2)9:50\n3)11:40\n4)No morning");
//                s3 = in.nextInt();
//                if(s3!=1 && s3!=2 && s3!=3 && s3!=4){
//                    System.out.println("Please retry");
//                }
//            }
            s3=startime.get(2);
            try {
            tcombinations2.addAll(labloop(s3,2,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	System.out.println(arr[0]);

            	return null;
            }
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations2.clear();

//            while (s4!=1 && s4!=2 && s4!=3 && s4!=4) {
//                System.out.println("Enter what is the minimum time at which class should start on Thursday: \n1)8:00\n2)9:50\n3)11:40\n4)No morning");
//                s4 = in.nextInt();
//                if(s4!=1 && s4!=2 && s4!=3 && s4!=4){
//                    System.out.println("Please retry");
//                }
//            }
            s4=startime.get(3);
            try {
            tcombinations2.addAll(labloop(s4,3,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	System.out.println(arr[0]);

            	return null;
            }
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations2.clear();

//            while (s5!=1 && s5!=2 && s5!=3 && s5!=4) {
//                System.out.println("Enter what is the minimum time at which class should start on Friday: \n1)8:00\n2)9:50\n3)11:40\n4)No morning");
//                s5 = in.nextInt();
//                if(s5!=1 && s5!=2 && s5!=3 && s5!=4){
//                    System.out.println("Please retry");
//                }
//            }
            s5=startime.get(4);
            try {
            tcombinations2.addAll(labloop(s5,4,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	System.out.println(arr[0]);

            	return null;
            }
            List<Brute> tcombinations9 = new ArrayList<>();
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations1=tcombinations9;
            tcombinations2.clear();


//            while (e1!=1 && e1!=2 && e1!=3 && e1!=4 && e1!=5 && e1!=6) {
//                System.out.println("Enter what is the maximum time at which class should end on Monday: \n1)2:50\n2)3:50\n3)4:50\n4)5:50\n5)6:50\n6)No evening");
//                e1 = in.nextInt();
//                if(e1!=1 && e1!=2 && e1!=3 && e1!=4 && e1!=5 && e1!=6){
//                    System.out.println("Please retry");
//                }
//            }
            e1=endtime.get(0);
            try {
            tcombinations2.addAll(theoryloop(e1,0,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	
            	arr1[0]=1;
            	return null;
            }
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations2.clear();

//            while (e2!=1 && e2!=2 && e2!=3 && e2!=4 && e2!=5 && e2!=6) {
//                System.out.println("Enter what is the maximum time at which class should end on Tuesday: \n1)2:50\n2)3:50\n3)4:50\n4)5:50\n5)6:50\n6)No evening");
//                e2 = in.nextInt();
//                if(e2!=1 && e2!=2 && e2!=3 && e2!=4 && e2!=5 && e2!=6){
//                    System.out.println("Please retry");
//                }
//            }
            e2=endtime.get(1);
            try {
            tcombinations2.addAll(theoryloop(e2,1,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	
            	arr1[0]=1;
            	return null;
            }
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations2.clear();

//            while (e3!=1 && e3!=2 && e3!=3 && e3!=4 && e3!=5 && e3!=6) {
//                System.out.println("Enter what is the maximum time at which class should end on Wednesday: \n1)2:50\n2)3:50\n3)4:50\n4)5:50\n5)6:50\n6)No evening");
//                e3 = in.nextInt();
//                if(e3!=1 && e3!=2 && e3!=3 && e3!=4 && e3!=5 && e3!=6){
//                    System.out.println("Please retry");
//                }
//            }
            e3=endtime.get(2);
            try {
            tcombinations2.addAll(theoryloop(e3,2,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	
            	arr1[0]=1;
            	return null;
            }
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations2.clear();

//            while (e4!=1 && e4!=2 && e4!=3 && e4!=4 && e4!=5 && e4!=6) {
//                System.out.println("Enter what is the maximum time at which class should end on Thursday: \n1)2:50\n2)3:50\n3)4:50\n4)5:50\n5)6:50\n6)No evening");
//                e4 = in.nextInt();
//                if(e4!=1 && e4!=2 && e4!=3 && e4!=4 && e4!=5 && e4!=6){
//                    System.out.println("Please retry");
//                }
//            }
            e4=endtime.get(3);
            try {
            tcombinations2.addAll(theoryloop(e4,3,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	
            	arr1[0]=1;
            	return null;
            }
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations2.clear();

//            while (e5!=1 && e5!=2 && e5!=3 && e5!=4 && e5!=5 && e5!=6) {
//                System.out.println("Enter what is the maximum time at which class should end on Friday: \n1)2:50\n2)3:50\n3)4:50\n4)5:50\n5)6:50\n6)No evening");
//                e5 = in.nextInt();
//                if(e5!=1 && e5!=2 && e5!=3 && e5!=4 && e5!=5 && e5!=6){
//                    System.out.println("Please retry");
//                }
//            }
            e5=endtime.get(4);
            try {
            tcombinations2.addAll(theoryloop(e5,4,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	
            	arr1[0]=1;
            	return null;
            }
            List<Brute> tcombinations7 = new ArrayList<>();
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations1=tcombinations7;
            tcombinations2.clear();







        }
        else{
            int s1=0,s2=0,s3=0,s4=0,s5=0;
            int e1=0,e2=0,e3=0,e4=0,e5=0;
//            while (s1!=1 && s1!=2 && s1!=3 && s1!=4 && s1!=5 && s1!=6) {
//                System.out.println("Enter what is the minimum time at which class should start on Monday: \n1)8:00\n2)9:00\n3)10:00\n4)11:00\n5)12:00\n6)No morning");
//                s1 = in.nextInt();
//                if(s1!=1 && s1!=2 && s1!=3 && s1!=4 && s1!=5 && s1!=6){
//                    System.out.println("Please retry");
//                }
//            }
            s1=startime.get(0);
            try {
            tcombinations2.addAll(theoryloop1(s1,0,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	return null;
            }
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations2.clear();

//            while (s2!=1 && s2!=2 && s2!=3 && s2!=4 && s2!=5 && s2!=6) {
//                System.out.println("Enter what is the minimum time at which class should start on Tuesday: \n1)8:00\n2)9:00\n3)10:00\n4)11:00\n5)12:00\n6)No morning");
//                s2 = in.nextInt();
//                if(s2!=1 && s2!=2 && s2!=3 && s2!=4 && s2!=5 && s2!=6){
//                    System.out.println("Please retry");
//                }
//            }
            s2=startime.get(1);
            try {
            tcombinations2.addAll(theoryloop1(s2,1,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	return null;
            }
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations2.clear();

//            while (s3!=1 && s3!=2 && s3!=3 && s3!=4 && s3!=5 && s3!=6) {
//                System.out.println("Enter what is the minimum time at which class should start on Wednesday: \n1)8:00\n2)9:00\n3)10:00\n4)11:00\n5)12:00\n6)No morning");
//                s3 = in.nextInt();
//                if(s3!=1 && s3!=2 && s3!=3 && s3!=4 && s3!=5 && s3!=6){
//                    System.out.println("Please retry");
//                }
//            }
            s3=startime.get(2);
            try {
            tcombinations2.addAll(theoryloop1(s3,2,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	return null;
            }
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations2.clear();

//            while (s4!=1 && s4!=2 && s4!=3 && s4!=4 && s4!=5 && s4!=6) {
//                System.out.println("Enter what is the minimum time at which class should start on Thursday: \n1)8:00\n2)9:00\n3)10:00\n4)11:00\n5)12:00\n6)No morning");
//                s4 = in.nextInt();
//                if(s4!=1 && s4!=2 && s4!=3 && s4!=4 && s4!=5 && s4!=6){
//                    System.out.println("Please retry");
//                }
//            }
            s4=startime.get(3);
            try {
            tcombinations2.addAll(theoryloop1(s4,3,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	return null;
            }
            
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations2.clear();

//            while (s5!=1 && s5!=2 && s5!=3 && s5!=4 && s5!=5 && s5!=6) {
//                System.out.println("Enter what is the minimum time at which class should start on Friday: \n1)8:00\n2)9:00\n3)10:00\n4)11:00\n5)12:00\n6)No morning");
//                s5 = in.nextInt();
//                if(s5!=1 && s5!=2 && s5!=3 && s5!=4 && s5!=5 && s5!=6){
//                    System.out.println("Please retry");
//                }
//            }
            s5=startime.get(4);
            try {
            	tcombinations2.addAll(theoryloop1(s5,4,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	return null;
            }
            List<Brute> tcombinations9 = new ArrayList<>();
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations1=tcombinations9;
            tcombinations2.clear();

//            while (e1!=1 && e1!=2 && e1!=3 && e1!=4) {
//                System.out.println("Enter what is the maximum time at which class should end on Monday: \n1)3:40\n2)5:30\n3)7:20\n4)No evening");
//                e1 = in.nextInt();
//                if(e1!=1 && e1!=2 && e1!=3 && e1!=4){
//                    System.out.println("Please retry");
//                }
//            }
           
            e1=endtime.get(0);
            try {
            tcombinations2.addAll(labloop1(e1,0,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	
            	arr1[0]=1;
            	return null;
            }
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations2.clear();

//            while (e2!=1 && e2!=2 && e2!=3 && e2!=4) {
//                System.out.println("Enter what is the maximum time at which class should end on Tuesday: \n1)3:40\n2)5:30\n3)7:20\n4)No evening");
//                e2 = in.nextInt();
//                if(e2!=1 && e2!=2 && e2!=3 && e2!=4){
//                    System.out.println("Please retry");
//                }
//            }
            e2=endtime.get(1);
            try {
            tcombinations2.addAll(labloop1(e2,1,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	
            	arr1[0]=1;
            	return null;
            }
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations2.clear();

//            while (e3!=1 && e3!=2 && e3!=3 && e3!=4) {
//                System.out.println("Enter what is the maximum time at which class should end on Wednesday: \n1)3:40\n2)5:30\n3)7:20\n4)No evening");
//                e3 = in.nextInt();
//                if(e3!=1 && e3!=2 && e3!=3 && e3!=4){
//                    System.out.println("Please retry");
//                }
//            }
            e3=endtime.get(2);
            try {
            tcombinations2.addAll(labloop1(e3,2,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	
            	arr1[0]=1;
            	return null;
            }
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations2.clear();

//            while (e4!=1 && e4!=2 && e4!=3 && e4!=4) {
//                System.out.println("Enter what is the maximum time at which class should end on Thursday: \n1)3:40\n2)5:30\n3)7:20\n4)No evening");
//                e4 = in.nextInt();
//                if(e4!=1 && e4!=2 && e4!=3 && e4!=4){
//                    System.out.println("Please retry");
//                }
//            }
            e4=endtime.get(3);
            try {
            tcombinations2.addAll(labloop1(e4,3,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	
            	arr1[0]=1;
            	return null;
            }
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations2.clear();

//            while (e5!=1 && e5!=2 && e5!=3 && e5!=4) {
//                System.out.println("Enter what is the maximum time at which class should end on Friday: \n1)3:40\n2)5:30\n3)7:20\n4)No evening");
//                e5 = in.nextInt();
//                if(e5!=1 && e5!=2 && e5!=3 && e5!=4){
//                    System.out.println("Please retry");
//                }
//            }
            e5=endtime.get(4);
            try {
            tcombinations2.addAll(labloop1(e5,4,arr,tcombinations,tcombinations1));
            }
            catch(NullPointerException e) {
            	
            	arr1[0]=1;
            	return null;
            }
            tcombinations.clear();
            tcombinations.addAll(tcombinations2);
            tcombinations1.clear();
            tcombinations2.clear();

        }
        return tcombinations;
    }

}

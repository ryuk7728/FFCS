package timetablelogic;
import java.io.InputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.http.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;





@WebServlet("/rex")
public class Routing extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//		
//		res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
//	    res.setHeader("Pragma", "no-cache"); // HTTP 1.0.
//	    res.setHeader("Expires", "0");
    	
		InputStream is = Routing.class.getResourceAsStream("TimetableExtendedInput2.txt");
        Scanner reader = new Scanner(is);
        List<String> teachers = new ArrayList<>();
        HashMap<String, HashMap<String, HashSet <String>>> hash = new HashMap<>();
        HashMap<String,HashSet<String>> teacherSubject = new HashMap<>();
        HashMap<String,HashSet<String>> teacherSubject1 = new HashMap<>();//To create map of subjects to all corresponding teachers
//        System.out.println("Enter number of pure theory subjects");
        int t = Integer.parseInt(reader.nextLine());
        for (int i = 0; i < t; i++) {
//            System.out.println("Enter name of subject");
            String str = reader.nextLine();
            hash.put(str, new HashMap<>());
            teacherSubject.put(str,new HashSet<>()); // initialize map with subject and empty hashset
            teacherSubject1.put(str,new HashSet<>());
//            System.out.println("Enter no. of slots allotted for the subject");
            int k = Integer.parseInt(reader.nextLine());
//            System.out.println("Enter the no. of teachers in the subject");
            int q = Integer.parseInt(reader.nextLine());
            for (int j = 0; j < q; j++) {
//                System.out.println("Enter the name of the teacher");
                String str1 = reader.nextLine();
                teachers.add(str1);
                if(hash.get(str).containsKey(str1)){
                    str1+=Integer.toString(j);
                }
                hash.get(str).put(str1, new HashSet<>());
                teacherSubject.get(str).add(str1); // Putting the corresponding teacher in the subject key
//                System.out.println("Enter the slots");
                for (int l = 0; l < k; l++) {
                    String str2 = reader.nextLine();
                    hash.get(str).get(str1).add(str2);
                }
            }
        }

        HashMap<String, HashMap<String, HashSet<String>>> subjectTeachersSlotsMap = new HashMap<>();
//        System.out.println("Enter number of pure lab subjects");
        int numSubjects = Integer.parseInt(reader.nextLine());
        for (int i = 0; i < numSubjects; i++) {
//            System.out.println("Enter name of subject");
            String subjectName = reader.nextLine();
            teacherSubject.put(subjectName,new HashSet<>()); // initialize map with subject and empty hashset
            teacherSubject1.put(subjectName,new HashSet<>());
            subjectTeachersSlotsMap.put(subjectName, new HashMap<>());
//            System.out.println("Enter no. of slots allotted for the subject");
            int numSlots = Integer.parseInt(reader.nextLine());
//            System.out.println("Enter the no. of teachers in the subject");
            int numTeachers = Integer.parseInt(reader.nextLine());
            for (int j = 0; j < numTeachers; j++) {
//                System.out.println("Enter the name of the teacher");
                String teacherName = reader.nextLine();
                teachers.add(teacherName);
                if(subjectTeachersSlotsMap.get(subjectName).containsKey(teacherName)){
                    teacherName+=Integer.toString(j);
                }
                subjectTeachersSlotsMap.get(subjectName).put(teacherName, new HashSet<>());
                teacherSubject.get(subjectName).add(teacherName); // Putting the corresponding teacher in the subject key
//                System.out.println("Enter the slots");
                for (int k = 0; k < numSlots; k++) {
                    String slot = reader.nextLine();
                    subjectTeachersSlotsMap.get(subjectName).get(teacherName).add(slot);
                }
            }
        }

        HashMap<String, HashMap<String, List<List<String>>>> subjectsMap = new HashMap<>();

//        System.out.println("Enter the number of embedded theory and lab subjects:");
        int numOfSubjects = Integer.parseInt(reader.nextLine());

        for (int i = 0; i < numOfSubjects; i++) {
//            System.out.println("Enter the name of the subject:");
            String subjectName = reader.nextLine();
            subjectsMap.put(subjectName, new HashMap<>());

            teacherSubject.put(subjectName,new HashSet<>()); // initialize map with subject and empty hashset

            teacherSubject1.put(subjectName,new HashSet<>());

//            System.out.println("Enter the number of slots allotted for the theory component of the subject:");
            int numOfTheorySlots = Integer.parseInt(reader.nextLine());

//            System.out.println("Enter the number of slots allotted for the lab component of the subject:");
            int numOfLabSlots = Integer.parseInt(reader.nextLine());

//            System.out.println("Enter the number of teachers in the subject:");
            int numOfTeachers = Integer.parseInt(reader.nextLine());

            for (int j = 0; j < numOfTeachers; j++) {
//                System.out.println("Enter the name of the teacher:");
                String teacherName = reader.nextLine();
                teachers.add(teacherName);
                if(subjectsMap.get(subjectName).containsKey(teacherName)){
                    teacherName+=Integer.toString(j);
                }
                subjectsMap.get(subjectName).put(teacherName, new ArrayList<>());
                teacherSubject.get(subjectName).add(teacherName); // Putting the corresponding teacher in the subject key
                List<String> theorySlot = new ArrayList<>();

//                System.out.println("Enter the slots for the theory component of the subject:");
                for (int k = 0; k < numOfTheorySlots; k++) {
                    String slot = reader.nextLine();
                    theorySlot.add(slot);
                }
                subjectsMap.get(subjectName).get(teacherName).add(theorySlot);

                List<String> labSlot = new ArrayList<>();

//                System.out.println("Enter the slots for the lab component of the subject:");
                for (int l = 0; l < numOfLabSlots; l++) {
                    String slot = reader.nextLine();
                    labSlot.add(slot);
                }
                subjectsMap.get(subjectName).get(teacherName).add(labSlot);
            }
        }
        reader.close();
        HashMap<String, HashMap<String, HashSet<String>>> hash1 = new HashMap<>();
        HashMap<String, HashMap<String, HashSet<String>>> subjectTeachersSlotsMap1 = new HashMap<>();
        HashMap<String, HashMap<String, List<List<String>>>> subjectsMap1 = new HashMap<>();
        hash1.putAll(hash);
        subjectTeachersSlotsMap1.putAll(subjectTeachersSlotsMap);
        subjectsMap1.putAll(subjectsMap);
        Brute.teacherSubject=teacherSubject; // initializing static member of brute to the subject teacher map
        Brute.teacherSubject1=teacherSubject1;

//        PrintWriter out = res.getWriter();
        HttpSession session = req.getSession();
        
        String ID = session.getId();
        System.out.println("THE ID IS:  "+ID);
         
        int w=0;
        int u=0;
        int y=0;
        int t1=0;
        t1=(int)(session.getAttribute("time"));
        System.out.println("The TIME IS:"+t1);
        timetable ob = new timetable(hash,subjectTeachersSlotsMap,subjectsMap,hash1,subjectTeachersSlotsMap1,subjectsMap1,teachers);
        HashMap<String, HashMap<String, HashSet<String>>> theory2 = new HashMap<>();
        HashMap<String, HashMap<String, HashSet<String>>> lab2= new HashMap<>();
        HashMap <String, HashMap<String, List<List<String>>>> embedded2= new HashMap<>();
        HashMap<String, HashMap<String, HashSet<String>>> theory3 = new HashMap<>();
        HashMap<String, HashMap<String, HashSet<String>>> lab3= new HashMap<>();
        HashMap <String, HashMap<String, List<List<String>>>> embedded3= new HashMap<>();
        ob.mORe(t1,hash,subjectTeachersSlotsMap,subjectsMap,theory2,lab2,embedded2,theory3,lab3,embedded3);



        
       
        
        
        w=Integer.parseInt(req.getParameter("subb"));
        session.setAttribute("w", w);
        session.setAttribute("ob", ob);
        session.setAttribute("t2", t1);
        session.setAttribute("theory", hash);
        session.setAttribute("lab", subjectTeachersSlotsMap);
        session.setAttribute("embedded", subjectsMap);
        session.setAttribute("theory2", theory2);
        session.setAttribute("lab2", lab2);
        session.setAttribute("embedded2", embedded2);
        session.setAttribute("theory3", theory3);
        session.setAttribute("lab3", lab3);
        session.setAttribute("embedded3", embedded3);
        RequestDispatcher rd = req.getRequestDispatcher("xer");
        rd.forward(req, res);


//        List<Brute> allComb = ob.bruteForce();
//        while (u!=1&&u!=2) {
//            System.out.println("Enter 1 to choose specific teachers or 2 to see your options");
//            u = in.nextInt();
//            if(u!=1&&u!=2){
//                System.out.println("Please re-enter");
//            }
//        }
//        if(u==1) {
//            while(true){
//                allComb = ob.teachers();
//                if(allComb!=null){
//                    break;
//                }
//            }
//        }
//        while (y!=1&&y!=2) {
//            System.out.println("Enter 1 to apply time constraint or 2 to neglect it");
//            y = in.nextInt();
//            if(y!=1&&y!=2){
//                System.out.println("Please re-enter");
//            }
//
//        }
//        if(y==1) {
//            allComb = ob.startend(t1);
//        }
//        System.out.println();
//        System.out.println();
//        System.out.println("The possible timetables are:");
//        System.out.println();
//
//        for(Brute ob1: allComb) {
//
//
//            System.out.println("Details for pure theory subjects:");
//            System.out.println();
//            for (Map.Entry<String, HashMap<String, HashSet<String>>> get : ob1.theory.entrySet()) {
//                System.out.println(get.getKey() + ":");
//                for (Map.Entry<String, HashSet<String>> get1 : get.getValue().entrySet()) {
//                    System.out.println(get1.getKey() + " : " + get1.getValue());
//                }
//            }
//
//            System.out.println("Details for pure lab subjects:");
//            System.out.println();
//            for (Map.Entry<String, HashMap<String, HashSet<String>>> entry : ob1.lab.entrySet()) {
//                System.out.println(entry.getKey() + ":");
//                for (Map.Entry<String, HashSet<String>> innerEntry : entry.getValue().entrySet()) {
//                    System.out.println(innerEntry.getKey() + " : " + innerEntry.getValue());
//                }
//            }
//
//            System.out.println("Details for embedded subjects:");
//            System.out.println();
//            for (Map.Entry<String, HashMap<String, List<List<String>>>> subjectEntry : ob1.embedded.entrySet()) {
//                System.out.println(subjectEntry.getKey() + ":");
//                for (Map.Entry<String, List<List<String>>> teacherEntry : subjectEntry.getValue().entrySet()) {
//                    System.out.println("\t" + teacherEntry.getKey() + ":");
//                    System.out.println("\t\tTheory slots: " + teacherEntry.getValue().get(0));
//                    System.out.println("\t\tLab slots: " + teacherEntry.getValue().get(1));
//                }
//            }
//
//            System.out.println();
//            System.out.println("***********************************************");
//            System.out.println();
//        }
//        
//        out.println("done");
    	
    }

}


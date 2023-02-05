import java.util.ArrayList;

/**
 * @author Maharshi Naik
 */
public class Student {
    private String name; //name of student
    private int ptsEarned; //points of the student, sum of all the events student took part in
    private int grade; // grade of student
    private int eventsAttended=0; // by the student
    private int quarter;
    private String sportEventName;// to add the name to the  event list
    private String nonSportEventName;// to add the name to the  event list
    private int sportEventPoints; //To add the points to the points list
    private int nonSportEventPoints; //to add the points to the points list
    private int totalAmtPoints=0;//total points of a student (calculated in this class file)
    private ArrayList<String> studentList = new ArrayList<String>();  //list for students
    private ArrayList<String> sportEventsList = new ArrayList<String>();  //list for sport events
    private ArrayList<String> nonSportEventsList = new ArrayList<String>();  // list for non sport events
    ArrayList<Integer> nonSportEventPointsList = new ArrayList<Integer>();
    ArrayList<Integer> sportEventPointsList = new ArrayList<Integer>();
    
    
    public Student(String nm, int gr) {  //Constructor to make a Student object
        name = nm;
    //  ptsPossible = ptsP;  
        grade = gr;
       // eventsAttended = evA;
        //eventsPossible = evP;
       // quarter = qtr;
     
        studentList.add(name);//Adds the student to the list of students
    }

    public String getName() {//Returns the name of the student
        return name;
    }

    public int getPtsEarned() { //Returns the total number of points earned (Sum of all the points of the events the student took part in.)
        return totalAmtPoints;
    }

    public int getGrade() { //reeturns grade of the student
        return grade;
    }

    public int getEventsAttended(int sE, int nSE) { //returns number of events attended by the student
       eventsAttended = sE + nSE;
        return eventsAttended;
    }

    public int getQuarter() {//returns quarter
        return quarter; 
    }
      
    public void setSportEvents(String spEv, int spEvP) {//Adds name and amount of points
        sportEventName = spEv;
        sportEventPoints = spEvP;
        sportEventsList.add(sportEventName);
        sportEventPointsList.add(sportEventPoints);//makes an arraylist of the points of the evnets
        eventsAttended++;
    }

    public void setNonSportEvents(String nspEv, int nspEvP) {// adds name and amount of points for non sports
        nonSportEventName = nspEv;
        nonSportEventPoints = nspEvP;
        nonSportEventsList.add(nonSportEventName);
        nonSportEventPointsList.add(nonSportEventPoints);
        eventsAttended++;
    }
    

    public boolean getAboveFiveEvents( ) { //checks if the amount of events meet the requirments of 5 non sports and 5 sport events
        return ((nonSportEventsList.size() >=5) && (sportEventsList.size() >=5));
    }

    public void sumPointsEvents() {
              for(int num : nonSportEventPointsList) {//new method to sum up points
                totalAmtPoints += num;
              }
              for(int num : sportEventPointsList) {
                totalAmtPoints += num;
              }
              ptsEarned = totalAmtPoints;
    }

    public int calculateTotalPointsPossible() {
        for (Integer i : nonSportEventPointsList) {
            totalAmtPoints += i;
        }
        for (Integer i : sportEventPointsList) {
            totalAmtPoints += i;
        }
        return totalAmtPoints;
    }


    public int findRandWinner(int len) { // finds a random winner
        int winner = -1;
         winner = (int) (Math.random() * len);
        return (winner);
        
        //should store this and prevent any other random winners from being chosen during the quarter

    }

    public String findTopPointEarner() { //finds top point earner   
        int ptHi = 0;
        String ptHiName = "";
        for (int i=0;i<studentList.size();i++) {
            if (ptsEarned > ptHi) {
                ptHi=ptsEarned;
                ptHiName=name;
            }
        }
        return ptHiName;
    }

 
    
    public String toString() {
        return ("Name: " + name  
        + "\nPoints Earned: " + totalAmtPoints  +
         "\nGrade: " + grade + "\nEvents Attended: " + eventsAttended);
    }




}

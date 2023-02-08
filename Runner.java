import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JComboBox;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Maharshi Naik
 */
public class Runner {
  static ArrayList<Student> studentGr9 = new ArrayList<Student>();
  static ArrayList<Student> studentGr10 = new ArrayList<Student>();
  static ArrayList<Student> studentGr11 = new ArrayList<Student>();
  static ArrayList<Student> studentGr12 = new ArrayList<Student>();
  static String[] spirit_prizes = { "Free Wristband", "Free T-Shirt", "Free Keychain", "Free Pencil Case",
      "Free Lunch Bag", "Free Water Bottle", "Free Sticker", "Free Pencil", "Free Notebook", "Free Pen" };
  static String[] school_prizes = { "5 HW Passes", "Extended Lunch Pass", "Free TShirt", "Free Lunch",
      "Free Pencil Case", "Free Water Bottle" };
  static String[] food_prizes = { "Free $5 Starbucks Gift Card", "Free $5 Tim Hortons Gift Card",
      "Free $5 Pizza Pizza Gift Card", "Free $5 A&W Gift Card", "Free $5 Burger King Gift Card",
      "Free $5 KFC Gift Card" };

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String firstName, lastName;
    int grade;
    String yOrN = "y";
    int numOfStu = 0;
    while (yOrN.equalsIgnoreCase("y")) {
      System.out.print("Enter Student Name  (First): ");
      firstName = sc.next();
      System.out.print("\nEnter Student Name  (Last): ");
      lastName = sc.next();
      System.out.print("\nEnter Student Grade: ");
      grade = sc.nextInt();
      while (grade > 12 || grade < 9) {
        System.out.print("\nThe number you have entered is invalid. Please enter a grade between 9 and 12: ");
        grade = sc.nextInt();
      }

      if (grade == 9) {
        studentGr9.add(numOfStu, new Student((firstName + " " + lastName), grade));

        System.out.print("\nEnter the number of sport events the student took part in: ");
        int sportEventsAttended = sc.nextInt();
        while ((sportEventsAttended < 5)) { // to make sure the number of events is equal or over 5
          System.out.println("\nThe minimum number of events is 5, you entered " + sportEventsAttended
              + "\n Please enter the number of sport events equal to or greater than 5");
          sportEventsAttended = sc.nextInt();
        }

        for (int i = 0; i < sportEventsAttended; i++) { // adds the sport events the student took part in
          System.out.println("Enter Name of the SPORT Event and The Points Earned (on separate lines)");
          studentGr9.get(numOfStu).setSportEvents(sc.next(), sc.nextInt());
        }
        studentGr9.get(numOfStu).sumPointsEvents();
        System.out.println("Enter the number of NON-SPORT events the student took part in.");
        int nonSportEventsAttended = sc.nextInt();

        while ((nonSportEventsAttended < 5)) { // to make sure the number of events is equal or over 5
          System.out.println("The minimum number of events is 5, you entered " + nonSportEventsAttended
              + "\n Please enter the number of Sport events equal to or greater than 5");
          nonSportEventsAttended = sc.nextInt();
          // throw new UnsupportedOperationException("Not supported yet."); // To change
          // body of generated methods, choose
          // Tools | Templates.
        }

        studentGr9.get(numOfStu).sumPointsEvents();
        for (int i = 0; i < nonSportEventsAttended; i++) {
          System.out.println("Enter the Name of the NON-SPORT Event and The Points Earned (on separate lines)");
          studentGr9.get(numOfStu).setNonSportEvents(sc.next(), sc.nextInt());

        }
      }

      else if (grade == 10) {
        studentGr10.add(numOfStu, new Student((firstName + " " + lastName), grade));

        System.out.print("\nEnter the number of sport events the student took part in: ");
        int sportEventsAttended = sc.nextInt();
        while ((sportEventsAttended < 5)) { // to make sure the number of events is equal or over 5
          System.out.println("\nThe minimum number of events is 5, you entered " + sportEventsAttended
              + "\n Please enter the number of sport events equal to or greater than 5");
          sportEventsAttended = sc.nextInt();
        }

        for (int i = 0; i < sportEventsAttended; i++) { // adds the sport events the student took part in
          System.out.println("Enter Name of the SPORT Event and The Points Earned (on separate lines)");
          studentGr10.get(numOfStu).setSportEvents(sc.next(), sc.nextInt());
        }
        studentGr10.get(numOfStu).sumPointsEvents();
        System.out.println("Enter the number of NON-SPORT events the student took part in.");
        int nonSportEventsAttended = sc.nextInt();

        while ((nonSportEventsAttended < 5)) { // to make sure the number of events is equal or over 5
          System.out.println("The minimum number of events is 5, you entered " + nonSportEventsAttended
              + "\n Please enter the number of Sport events equal to or greater than 5");
          nonSportEventsAttended = sc.nextInt();
        }

        studentGr10.get(numOfStu).sumPointsEvents();
        for (int i = 0; i < nonSportEventsAttended; i++) {
          System.out.println("Enter the Name of the NON-SPORT Event and The Points Earned (on separate lines)");
          studentGr10.get(numOfStu).setNonSportEvents(sc.next(), sc.nextInt());

        }
      } else if (grade == 11) {
        studentGr11.add(numOfStu, new Student((firstName + " " + lastName), grade));

        System.out.print("\nEnter the number of sport events the student took part in: ");
        int sportEventsAttended = sc.nextInt();
        while ((sportEventsAttended < 5)) { // to make sure the number of events is equal or over 5
          System.out.println("\nThe minimum number of events is 5, you entered " + sportEventsAttended
              + "\n Please enter the number of sport events equal to or greater than 5");
          sportEventsAttended = sc.nextInt();
        }

        for (int i = 0; i < sportEventsAttended; i++) { // adds the sport events the student took part in
          System.out.println("Enter Name of the SPORT Event and The Points Earned (on separate lines)");
          studentGr11.get(numOfStu).setSportEvents(sc.next(), sc.nextInt());
        }
        studentGr11.get(numOfStu).sumPointsEvents();
        System.out.println("Enter the number of NON-SPORT events the student took part in.");
        int nonSportEventsAttended = sc.nextInt();

        while ((nonSportEventsAttended < 5)) { // to make sure the number of events is equal or over 5
          System.out.println("The minimum number of events is 5, you entered " + nonSportEventsAttended
              + "\n Please enter the number of Sport events equal to or greater than 5");
          nonSportEventsAttended = sc.nextInt();
        }

        studentGr11.get(numOfStu).sumPointsEvents();
        for (int i = 0; i < nonSportEventsAttended; i++) {
          System.out.println("Enter the Name of the NON-SPORT Event and The Points Earned (on separate lines)");
          studentGr11.get(numOfStu).setNonSportEvents(sc.next(), sc.nextInt());

        }
      } else if (grade == 12) {
        studentGr12.add(numOfStu, new Student((firstName + " " + lastName), grade));

        System.out.print("\nEnter the number of sport events the student took part in: ");
        int sportEventsAttended = sc.nextInt();
        while ((sportEventsAttended < 5)) { // to make sure the number of events is equal or over 5
          System.out.println("\nThe minimum number of events is 5, you entered " + sportEventsAttended
              + "\n Please enter the number of sport events equal to or greater than 5");
          sportEventsAttended = sc.nextInt();
        }

        for (int i = 0; i < sportEventsAttended; i++) { // adds the sport events the student took part in
          System.out.println("Enter Name of the SPORT Event and The Points Earned (on separate lines)");
          studentGr12.get(numOfStu).setSportEvents(sc.next(), sc.nextInt());
        }
        studentGr12.get(numOfStu).sumPointsEvents();
        System.out.println("Enter the number of NON-SPORT events the student took part in.");
        int nonSportEventsAttended = sc.nextInt();

        while ((nonSportEventsAttended < 5)) { // to make sure the number of events is equal or over 5
          System.out.println("The minimum number of events is 5, you entered " + nonSportEventsAttended
              + "\n Please enter the number of Sport events equal to or greater than 5");
          nonSportEventsAttended = sc.nextInt();
        }

        studentGr12.get(numOfStu).sumPointsEvents();
        for (int i = 0; i < nonSportEventsAttended; i++) {
          System.out.println("Enter the Name of the NON-SPORT Event and The Points Earned (on separate lines)");
          studentGr12.get(numOfStu).setNonSportEvents(sc.next(), sc.nextInt());

        }
      }

      System.out.println("Do you want to add the information for another student? (Y/N)");
      yOrN = sc.next();

    }

    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        String sGr9 = "No Info Available", sGr10 = "No Info Available", sGr11 = "No Info Available",
            sGr12 = "No Info Available";

        if (studentGr9.size() > 0)
          sGr9 = studentGr9.get((int) (Math.random() * studentGr9.size())).toString();

        if (studentGr10.size() > 0)
          sGr10 = studentGr10.get((int) (Math.random() * studentGr10.size())).toString();

        if (studentGr11.size() > 0)
          sGr11 = studentGr11.get((int) (Math.random() * studentGr11.size())).toString();

        if (studentGr12.size() > 0)
          sGr12 = studentGr12.get((int) (Math.random() * studentGr12.size())).toString();

        createAndShowGUI(sGr9, sGr10, sGr11, sGr12);
      }
    });
    sc.close();

  }

  /**
   * Creates the GUI required and displays the winners.
   * 
   * @param str
   */
  public static void createAndShowGUI(String strGr9, String strGr10, String strGr11, String strGr12) {

    // calculates the highest point earners
    int ptHi9 = 0, pthI10 = 0, ptHi11 = 0, ptHi12 = 0;
    String ptHiName9 = "", ptHiName10 = "", ptHiName11 = "", ptHiName12 = "";
    String reportGr9 = "", reportGr10 = "", reportGr11 = "", reportGr12 = "";
    for (int i = 0; i < studentGr9.size(); i++) {
      if (studentGr9.get(i).getPtsEarned() > ptHi9) {
        ptHi9 = studentGr9.get(i).getPtsEarned();
        ptHiName9 = studentGr9.get(i).getName();
      }
      reportGr9 += studentGr9.get(i).toString() + "\n\n";
    }
    for (int i = 0; i < studentGr10.size(); i++) {
      if (studentGr10.get(i).getPtsEarned() > pthI10) {
        pthI10 = studentGr10.get(i).getPtsEarned();
        ptHiName10 = studentGr10.get(i).getName();
      }
      reportGr10 += studentGr10.get(i).toString() + "\n\n";
    }
    for (int i = 0; i < studentGr11.size(); i++) {
      if (studentGr11.get(i).getPtsEarned() > ptHi11) {
        ptHi11 = studentGr11.get(i).getPtsEarned();
        ptHiName11 = studentGr11.get(i).getName();
      }
      reportGr11 += studentGr11.get(i).toString() + "\n\n";

    }
    for (int i = 0; i < studentGr12.size(); i++) {
      if (studentGr12.get(i).getPtsEarned() > ptHi12) {
        ptHi12 = studentGr12.get(i).getPtsEarned();
        ptHiName12 = studentGr12.get(i).getName();
      }
      reportGr12 += studentGr12.get(i).toString() + "\n\n";
    }
    final String report9 = reportGr9, report10 = reportGr10, report11 = reportGr11, report12 = reportGr12;
    final String highName9 = ptHiName9, highName10 = ptHiName10, highName11 = ptHiName11, highName12 = ptHiName12;
    final int highPt9 = ptHi9, highPt10 = pthI10, highPt11 = ptHi11, highPt12 = ptHi12;
    JFrame frame = new JFrame("Student Information");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());
    frame.setPreferredSize(new Dimension(1920, 1080));
    // Date picker
    Calendar now = Calendar.getInstance();
    SpinnerDateModel model = new SpinnerDateModel(now.getTime(), null, null, Calendar.DAY_OF_MONTH);
    JSpinner spinner = new JSpinner(model);
    JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "MM/dd/yyyy");
    spinner.setEditor(editor);
    spinner.setPreferredSize(new Dimension(200, 90));
    frame.add(spinner, BorderLayout.NORTH);

    // Drop down menu
    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout(FlowLayout.LEFT));
    JComboBox<String> comboBox = new JComboBox<>();
    comboBox.addItem("GRADE 9");
    comboBox.addItem("GRADE 10");
    comboBox.addItem("GRADE 11");
    comboBox.addItem("GRADE 12");
    panel.add(comboBox);
    frame.add(panel, BorderLayout.CENTER);
    JTextArea tArea = new JTextArea();
    // Add action listener to the drop down menu
    comboBox.addActionListener(e -> {
      JComboBox<String> cb = (JComboBox<String>) e.getSource();
      String optionSelected = (String) cb.getSelectedItem();
      switch (optionSelected) {
        case "GRADE 9":
          // call method from another class
          tArea.setText("");
          if (strGr9.equals("No Info Available"))
            tArea.setText("No student information available for grade 9");
          else
            tArea.setText("Random Winner from grade 9\n" + strGr9 + "\nThey win a "
                + spirit_prizes[(int) (Math.random() * spirit_prizes.length)]
                + "\n\n\n" + "Quarter for 9th Grade: \n\n\n" + report9);
          break;
        case "GRADE 10":
          // call method from another class
          tArea.setText("");
          if (strGr10.equals("No Info Available"))
            tArea.setText("No student information available for grade 10");
          else
            tArea.setText("Random Winner from grade 10\n" + strGr10 + "\nThey win a "
                + food_prizes[(int) (Math.random() * food_prizes.length)]
                + "\n\n\n" + "Quarter for 10th Grade: \n\n\n" + report10);
          break;
        case "GRADE 11":
          // call method from another class
          tArea.setText("");
          if (strGr11.equals("No Info Available"))
            tArea.setText("No student information available for grade 11");
          else
            tArea.setText("Random Winner from grade 11\n" + strGr11 + "\nThey win a "
                + school_prizes[(int) (Math.random() * school_prizes.length)]
                + "\n\n\n" + "Quarter for 11th Grade: \n\n\n" + report11);
          break;
        case "GRADE 12":
          // call method from another class
          tArea.setText("");
          if (strGr12.equals("No Info Available"))
            tArea.setText("No student information available for grade 12");
          else
            tArea.setText("Random Winner from grade 12\n" + strGr12 + "\nThey win a "
                + school_prizes[(int) (Math.random() * school_prizes.length)]
                + "\n\n\n" + "Quarter for 12th Grade: \n\n\n" + report12);
          break;
      }
      // Open new panel with a method from another class
      JFrame newFrame = new JFrame("Option Selected");
      newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      newFrame.setLayout(new BorderLayout());
      JButton backButton = new JButton("Main Menu");
      JButton randomWinnerButton = new JButton("Top Point Students:");
      newFrame.add(tArea, BorderLayout.CENTER);
      newFrame.add(backButton, BorderLayout.SOUTH);

      newFrame.setVisible(true);
      newFrame.add(randomWinnerButton, BorderLayout.NORTH);
      randomWinnerButton.addActionListener(r -> {
        JFrame winnerFrame = new JFrame("Winner");
        winnerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        winnerFrame.setLayout(new BorderLayout());
        JTextArea winnerArea = new JTextArea();
        winnerArea.setText("The Top Point Student " + "\n\n\nGrade 9: " + highName9
            + " was the highest point earner from grade 9 with a score of " +
            highPt9 + "\nThey win a "
            + food_prizes[(int) (Math.random() * food_prizes.length)] + "\n\n\nGrade 10: " + highName10 + " was the highest point earner from grade 10 with a score of "
            + highPt10 + "\nThey win a "
            + spirit_prizes[(int) (Math.random() * food_prizes.length)] +  "\n\n\nGrade 11: " +
            highName11 + " was the highest point earner from grade 11 with a score of " + highPt11 + "\nThey win a "
            + school_prizes[(int) (Math.random() * food_prizes.length)] +  "\n\n\nGrade 12: "
            + highName12 + " was the highest point earner from grade 12 with a score of " + highPt12 + "\nThey win a "
            + food_prizes[(int) (Math.random() * food_prizes.length)]);
        JButton backToMainMenuButton = new JButton("Go back to main menu");
        JButton exitButton = new JButton("Exit");
        winnerFrame.add(winnerArea, BorderLayout.CENTER);
        winnerFrame.add(backToMainMenuButton, BorderLayout.NORTH);
        winnerFrame.add(exitButton, BorderLayout.SOUTH);

        winnerFrame.setVisible(true);
        winnerFrame.setPreferredSize(new Dimension(1920, 1080));
        newFrame.setPreferredSize(new Dimension(1920, 1080));
        backToMainMenuButton.addActionListener(a -> {
          winnerFrame.dispose();
          newFrame.setVisible(true);
        });

        exitButton.addActionListener(b -> System.exit(0));
      });

      // Add action listener to the back button
      backButton.addActionListener(a -> {
        newFrame.dispose();
        frame.setVisible(true);
      });
    });

    frame.setVisible(true);// Makes the frame visible
  }
}

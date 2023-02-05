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
public class Gui {
    static ArrayList<Student> student = new ArrayList<Student>();
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String name;
        int grade;
        String yOrN = "y";
        int numOfStu = 0;
        while (yOrN.equalsIgnoreCase("y")) {
          System.out.println("Enter Student Name");
          name = sc.next();
          System.out.println("Enter Student Grade");
          grade = sc.nextInt();
          student.add(numOfStu, new Student(name,grade));
    
          System.out.println("Enter the number of sport events the student took part in.");
          int sportEventsAttended = sc.nextInt();
          while ((sportEventsAttended < 5)) { // to make sure the number of events is equal or over 5
            System.out.println("The minimum number of events is 5, you entered " + sportEventsAttended
                + "\n Please enter the number of Sport events equal to or greater than 5");
            sportEventsAttended = sc.nextInt();
          }
    
          for (int i = 0; i < sportEventsAttended; i++) { // adds the sport events the student took part in
            System.out.println("Enter Name of Sport Event and points");
            student.get(numOfStu).setSportEvents(sc.next(), sc.nextInt());
          }
          student.get(numOfStu).sumPointsEvents();
          System.out.println("Enter the number of non sport events the student took part in.");
          int nonSportEventsAttended = sc.nextInt();
    
          while ((nonSportEventsAttended < 5)) { // to make sure the number of events is equal or over 5
            System.out.println("The minimum number of events is 5, you entered " + nonSportEventsAttended
                + "\n Please enter the number of Sport events equal to or greater than 5");
            nonSportEventsAttended = sc.nextInt();
          }
    
          student.get(numOfStu).sumPointsEvents();
          for (int i = 0; i < nonSportEventsAttended; i++) {
            System.out.println("Enter Name of non Sport Event and points");
            student.get(numOfStu).setNonSportEvents(sc.next(), sc.nextInt());
    
          }
          System.out.println("Do you want to add the information for another student?");
          yOrN = sc.next();
    
        }
        String s = student.get(0).toString();
        // student.sumPointsEvents();
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
              createAndShowGUI(s);
            }
          });
       sc.close();   
}
public static void createAndShowGUI(String str) {

    JFrame frame = new JFrame("Student Information");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());
    // Date picker
Calendar now = Calendar.getInstance();
SpinnerDateModel model = new SpinnerDateModel(now.getTime(), null, null, Calendar.DAY_OF_MONTH);
JSpinner spinner = new JSpinner(model);
JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "dd/MM/yyyy");
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
      tArea.setText("Winner from grade 9\n\n\n" +str);
      break;
    case "GRADE 10":
      // call method from another class
      tArea.setText("");
      tArea.setText("Winner from grade 10\n\n\n" +str);
      break;
    case "GRADE 11":
      // call method from another class
      tArea.setText("");
      tArea.setText("Winner from grade 11\n\n\n" +str);
      break;
    case "GRADE 12":
      // call method from another class
      tArea.setText("");
      tArea.setText("Winner from grade 12\n\n\n" +str);
      break;
  }
  // Open new panel with a method from another class
  JFrame newFrame = new JFrame("Option Selected");
  newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  newFrame.setLayout(new BorderLayout());
  JButton backButton = new JButton("Go back to main menu");
  JButton randomWinnerButton = new JButton("Random Winner");
newFrame.add(tArea, BorderLayout.CENTER);
  newFrame.add(backButton, BorderLayout.SOUTH);
  newFrame.pack();
  newFrame.setVisible(true);
newFrame.add(randomWinnerButton, BorderLayout.NORTH);
  randomWinnerButton.addActionListener(r -> {
    JFrame winnerFrame = new JFrame("Winner");
    winnerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    winnerFrame.setLayout(new BorderLayout());
    JTextArea winnerArea = new JTextArea();
    winnerArea.setText("Something");
    JButton backToMainMenuButton = new JButton("Go back to main menu");
    JButton exitButton = new JButton("Exit");
    winnerFrame.add(winnerArea, BorderLayout.CENTER);
    winnerFrame.add(backToMainMenuButton, BorderLayout.NORTH);
    winnerFrame.add(exitButton, BorderLayout.SOUTH);
    winnerFrame.pack();
    winnerFrame.setVisible(true);

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

frame.pack();
frame.setVisible(true);
}

}


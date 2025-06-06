import javax.swing.*;
import java.awt.event.*;
import javax.swing.SpringLayout;


public class GradeCalculator extends JFrame {
// Declare private variables for the Swing components
private JLabel lblStudentName, lblStudentNo, lblQuiz1, lblQuiz2, lblQuiz3;
private JTextField txtStudentName, txtStudentNo, txtQuiz1, txtQuiz2, txtQuiz3;
private JButton calculateButton;


public GradeCalculator() {
// Set up the frame
super("Grade Calculator");
setSize(450, 250);


// Create the components
// Create labels and textfields
lblStudentName = new JLabel("Student Name:");
txtStudentName = new JTextField(30);
lblStudentNo = new JLabel("Student No:");
txtStudentNo = new JTextField(30);
lblQuiz1 = new JLabel("Milestone 1:");
txtQuiz1 = new JTextField(10);
lblQuiz2 = new JLabel("Milestone 2:");
txtQuiz2 = new JTextField(10);
lblQuiz3 = new JLabel("Terminal Assessement:");
txtQuiz3 = new JTextField(10);
calculateButton = new JButton("Calculate");

// Define the panel to hold the components
JPanel panel = new JPanel();
SpringLayout layout = new SpringLayout();
panel.setSize(300, 300);
panel.setLayout(layout);

// Add the components to the frame
panel.add(lblStudentName);
panel.add(txtStudentName);
panel.add(lblStudentNo);
panel.add(txtStudentNo);
panel.add(lblQuiz1);
panel.add(txtQuiz1);
panel.add(lblQuiz2);
panel.add(txtQuiz2);
panel.add(lblQuiz3);
panel.add(txtQuiz3);
panel.add(calculateButton);

// Put constraint on components
// Set label position: left
layout.putConstraint(SpringLayout.WEST, lblStudentName, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblStudentNo, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblQuiz1, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblQuiz2, 6, SpringLayout.WEST, panel);
layout.putConstraint(SpringLayout.WEST, lblQuiz3, 6, SpringLayout.WEST, panel);

// Set label and textfield position: top and bottom
layout.putConstraint(SpringLayout.NORTH, lblStudentName, 6, SpringLayout.NORTH, panel);
layout.putConstraint(SpringLayout.NORTH, txtStudentName, 6, SpringLayout.NORTH, panel);
layout.putConstraint(SpringLayout.NORTH, lblStudentNo, 10, SpringLayout.SOUTH, lblStudentName);
layout.putConstraint(SpringLayout.NORTH, txtStudentNo, 6, SpringLayout.SOUTH, txtStudentName);
layout.putConstraint(SpringLayout.NORTH, lblQuiz1, 10, SpringLayout.SOUTH, lblStudentNo);
layout.putConstraint(SpringLayout.NORTH, txtQuiz1, 6, SpringLayout.SOUTH, txtStudentNo);
layout.putConstraint(SpringLayout.NORTH, lblQuiz2, 10, SpringLayout.SOUTH, lblQuiz1);
layout.putConstraint(SpringLayout.NORTH, txtQuiz2, 6, SpringLayout.SOUTH, txtQuiz1);
layout.putConstraint(SpringLayout.NORTH, lblQuiz3, 10, SpringLayout.SOUTH, lblQuiz2);
layout.putConstraint(SpringLayout.NORTH, txtQuiz3, 6, SpringLayout.SOUTH, txtQuiz2);

// Set textfield position: right
layout.putConstraint(SpringLayout.WEST, txtStudentName, 6, SpringLayout.EAST, lblStudentName);
layout.putConstraint(SpringLayout.WEST, txtStudentNo, 24, SpringLayout.EAST, lblStudentNo);
layout.putConstraint(SpringLayout.WEST, txtQuiz1, 51, SpringLayout.EAST, lblQuiz1);
layout.putConstraint(SpringLayout.WEST, txtQuiz2, 51, SpringLayout.EAST, lblQuiz2);
layout.putConstraint(SpringLayout.WEST, txtQuiz3, 51, SpringLayout.EAST, lblQuiz3);

// Set button position
layout.putConstraint(SpringLayout.NORTH, calculateButton, 6, SpringLayout.SOUTH, txtQuiz3);
layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, calculateButton, 0, SpringLayout.HORIZONTAL_CENTER, panel);


//Add panel to frame
add(panel);


  // Calculate button action with validation
        calculateButton.addActionListener(e -> {
            try {
                // Parse inputs
                float q1 = Float.parseFloat(txtQuiz1.getText());
                float q2 = Float.parseFloat(txtQuiz2.getText());
                float q3 = Float.parseFloat(txtQuiz3.getText());

                // Validate ranges
                if (q1 < 0 || q1 > Student.Milestone1_MAX) {
                    throw new IllegalArgumentException(
                        String.format("Milestone 1 must be between 0 and %.0f.", Student.Milestone1_MAX)
                    );
                }
                if (q2 < 0 || q2 > Student.Milestone2_MAX) {
                    throw new IllegalArgumentException(
                        String.format("Milestone 2 must be between 0 and %.0f.", Student.Milestone2_MAX)
                    );
                }
                if (q3 < 0 || q3 > Student.TerminalAssessement3_MAX) {
                    throw new IllegalArgumentException(
                        String.format("Terminal Assessement must be between 0 and %.0f.", Student.TerminalAssessement3_MAX)
                    );
                }

                // Create student and show output
                Student stud = new Student();
                stud.setStudentName(txtStudentName.getText());
                stud.setStudentNumber(txtStudentNo.getText());
                stud.setQuiz1(q1);
                stud.setQuiz2(q2);
                stud.setQuiz3(q3);

                new GradeOutput(stud).setVisible(true);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                    this,
                    "Error: Please enter valid numbers for all quizzes.",
                    "Input Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage(),
                    "Invalid Score",
                    JOptionPane.WARNING_MESSAGE
                );
            }
        });
    }
}
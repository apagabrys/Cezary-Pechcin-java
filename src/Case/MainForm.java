package Case;

import Case.Student;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JPanel mainPanel;
    private JTabbedPane addTabPane;
    private JTextField teacherTF;
    private JTextField firstNameTF;
    private JTextField secondNameTF;
    private JButton addButton;
    private JComboBox showNameCB;
    private JTextField showSecondNameTF;
    private JTextField teacherCB;
    private JComboBox subjectCB


    public void init(){
        addButton.addActionListener(new addButtonActionListener());
        showNameCB.addActionListener(new showNameCBActionListener());

        ButtonGroup buttonGroup = new ButtonGroup();

    }
    private class addButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                    String firstName = firstNameTF.getText();
                    String secondName = secondNameTF.getText();
                    String teacher = teacherTF.getText();
                    Student student = new Student(firstName, secondName);
                    showNameCB.addItem(firstName+secondName);
                    subjectCB.addItem(Subject subject)

            }catch (NumberFormatException ne){
                JOptionPane.showMessageDialog(mainPanel, "Incorrect Input");

            }

        }
    }
    private class showNameCBActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = (String) showNameCB.getSelectedItem();
            for(int i = 0; i<Student.getStudentsCollection().size(); i++) {
                if(name.equals(Student.getStudentsCollection().get(i).getFirstName())){
                    showSecondNameTF.setText(String.valueOf(Student.getStudentsCollection().get(i).getSecondName()));
                    teacherCB.setText(String.valueOf(Teacher.getTeachersCollection().get(i).getFirstName()+
                            Teacher.getTeachersCollection().get(i).getSecondName()));
                }
            }
        }
    }
    public JPanel getMainPanel(){
        return mainPanel;
    }
}

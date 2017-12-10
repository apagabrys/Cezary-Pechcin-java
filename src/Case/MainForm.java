package Case;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JPanel mainPanel;
    private JTabbedPane addTabPane;
    private JTextField teacherTF;
    private JTextField firstNameTF;
    private JTextField lastNameTF;
    private JButton addButton;
    private JComboBox showNameCB;
    private JTextField showlastNameTF;
    private JComboBox teacherCB;
    private JComboBox subjectCB;
    private JTextField gradeTF;


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
                    String lastName = lastNameTF.getText();
                    String teacher = teacherTF.getText();

                    Student student = new Student(firstName, lastName);
                    showNameCB.addItem(firstName+lastName);


            }catch (NumberFormatException ne){
                JOptionPane.showMessageDialog(mainPanel, "Incorrect Input");

            }

        }
    }
    private class showNameCBActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = (String) showNameCB.getSelectedItem();
            String teacher = (String) teacherCB.getSelectedItem();

            for(int i = 0; i<Student.getStudentsCollection().size(); i++) {
                if(name.equals(Student.getStudentsCollection().get(i).getFirstName())){
                    showlastNameTF.setText(String.valueOf(Student.getStudentsCollection().get(i).getLastName()));

                }
            }
        }
    }
    public JPanel getMainPanel(){
        return mainPanel;
    }
}

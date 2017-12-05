package was3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JPanel mainPanel;
    private JTabbedPane addTabPane;
    private JTextField weightTF;
    private JTextField nameTF;
    private JTextField ageTF;
    private JButton addButton;

    public void init(){

    }
    private class addButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String name = nameTF.getText();
                int age = Integer.parseInt(ageTF.getText());
                double weight = Double.parseDouble(weightTF.getText());
            } catch (NumberFormatException ne){

            }

        }
    }

    public JPanel getMainPanel(){
        return mainPanel;
    }
}

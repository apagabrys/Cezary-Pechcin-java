package was3;

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
    private JComboBox subjectCB;
    private JTextField gradeTF;
    private JComboBox teacherCB;
    private JTextField showAgeTF;
    private JTextField showWeightTF;
    private JTextField showTypeOfAnimalTF;
    private JRadioButton catRB;
    private JRadioButton dogRB;
    private CatContainer catContainer = new CatContainer();

    public void init(){
        addButton.addActionListener(new addButtonActionListener());
        showNameCB.addActionListener(new showNameCBActionListener());

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(catRB);
        buttonGroup.add(dogRB);

    }
    private class addButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (dogRB.isSelected()) {
                    String name = firstNameTF.getText();
                    int age = Integer.parseInt(lastNameTF.getText());
                    double weight = Double.parseDouble(teacherTF.getText());
                    Dog dog = new Dog(name, age, weight, Breed.PUG);
                    showNameCB.addItem(name);
                } else if (catRB.isSelected()) {
                    String name = firstNameTF.getText();
                    int age = Integer.parseInt(lastNameTF.getText());
                    double weight = Double.parseDouble(teacherTF.getText());
                    catContainer.addCat(name, age, weight);
                    showNameCB.addItem(name);
                } else {
                    JOptionPane.showMessageDialog(mainPanel, "Select type of animal");
                }

            }catch (NumberFormatException ne){
                JOptionPane.showMessageDialog(mainPanel, "Incorrect Input");

            }

        }
    }
    private class showNameCBActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = (String) showNameCB.getSelectedItem();
            for(int i = 0; i<Dog.getDogCollection().size(); i++) {
                if(name.equals(Dog.getDogCollection().get(i).getName())){
                    showAgeTF.setText(String.valueOf(Dog.getDogCollection().get(i).getAge()));
                    showWeightTF.setText(String.valueOf(Dog.getDogCollection().get(i).getWeight()));
                    showTypeOfAnimalTF.setText("Dog");
                }
            }
            for (int i=0; i<catContainer.getCatList().size(); i++){
                if(name.equals(catContainer.getCatList().get(i))){
                    showAgeTF.setText(String.valueOf
                            (catContainer.getAge(i)));
                    showWeightTF.setText(String.valueOf
                            (catContainer.getWeight(i)));
                    showTypeOfAnimalTF.setText("Cat");
                }
            }
        }
    }
    public JPanel getMainPanel(){
        return mainPanel;
    }
}

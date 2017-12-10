package Case;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Szkoła");
        MainForm mainForm = new MainForm();
        mainFrame.setContentPane(mainForm.getMainPanel());
        mainFrame.pack();
        mainForm.init();
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

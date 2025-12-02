/**
 * Try using JFrame
 * 
 */
package calculatorapp;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // set theme to system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        JFrame frame = new JFrame("Calculator App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        //display on 2nd screen
        frame.setLocationRelativeTo(null);
        frame.setLocation(1920, 0);
        /*
         * C E % /
         * 7 8 9 *
         * 4 5 6 -
         * 1 2 3 +
         * 0 . = %
         */
        JPanel panel = new JPanel(new GridLayout(5,4));
        String[] buttons = {
            "C", "E", "%", "/",
            "7", "8", "9", "*",
            "4", "5", "6", "-",
            "1", "2", "3", "+",
            "0", ".", "=", "%"
        };
        JLabel label = new JLabel("0", SwingConstants.RIGHT);
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setActionCommand(text);
            panel.add(button);
            // add action listener to button
            button.addActionListener(new ClickHandler());
        }
        // add label at the top
        label.setFont(new Font("Arial", Font.PLAIN, 32));
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(label, BorderLayout.CENTER);
        frame.getContentPane().add(topPanel, BorderLayout.NORTH);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
class ClickHandler implements java.awt.event.ActionListener {
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        String command = e.getActionCommand();
        System.out.println("Button clicked: " + command);
    }
}
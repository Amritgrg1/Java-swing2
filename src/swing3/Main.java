package swing3;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame ho hai");

        JLabel label = new JLabel("Login Page");
        JTextField username = new JTextField("Enter your username");
        JTextField password = new JTextField("Enter your password");
        JButton button = new JButton("Login");
        String[] fruits = {"Apple", "Orange", "mango"};
        JComboBox comboBox = new JComboBox(fruits);

        label.setBounds(50,10,100,20);
        username.setBounds(50,30,200,50);
        password.setBounds(50,70,200,50);
        button.setBounds(50,120,200,50);
        comboBox.setBounds(50,180,200,30);

        frame.add(username);
        frame.add(password);
        frame.add(label);
        frame.add(button);
        frame.add(comboBox);


        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(400, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

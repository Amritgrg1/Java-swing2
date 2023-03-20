import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Hello world from title");
        frame.setSize(400,400); // set frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); //frame resize garna na milne technique
        frame.setVisible(true); //frame lai visible garxa
        frame.getContentPane().setBackground(Color.BLUE);

        JButton button = new JButton("click me");
        button.setBounds(100,100,100,100);
        frame.setLayout(null);
        button.setBackground(Color.GREEN);
        button.setForeground(Color.red);
        frame.add(button);
    }
}
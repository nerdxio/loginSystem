import javax.swing.*;
import java.awt.*;

public class WellcomPadg {
    JFrame frame =new JFrame();
    JLabel wellcomLabel=new JLabel("Hello");
    WellcomPadg(String userID){

        wellcomLabel.setBounds(0,0,200,35);
        wellcomLabel.setFont(new Font(null,Font.PLAIN,25));
        wellcomLabel.setText("Hello "+userID);
        frame.add(wellcomLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setLayout(null);
    }
}

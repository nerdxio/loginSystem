import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class loginPadge implements ActionListener {
    JFrame frame=new JFrame();
    JButton loginButton=new JButton("Login");
    JButton resetButton=new JButton("Reset");
    JTextField userIdField=new JTextField();
    JPasswordField userPasswordField=new JPasswordField();
    JLabel userIdLable=new JLabel("usreId:");
    JLabel userPasswordLabel=new JLabel("password:");
    JLabel messageLable=new JLabel();

    HashMap<String,String>loginInfo=new HashMap<String,String>();

    loginPadge(HashMap<String,String>loginInfoOrgnal){

        loginInfo=loginInfoOrgnal;
        //user id label
        userIdLable.setBounds(50,100,75,25);
        //user password label
        userPasswordLabel.setBounds(50,150,75,25);
        //message label
        messageLable.setBounds(125,250,250,35);
        messageLable.setFont(new Font(null,Font.BOLD,20));
        //user id field
        userIdField.setBounds(125,100,200,25);
        //password  field
        userPasswordField.setBounds(125,150,200,25);
        //login button
        loginButton.setBounds(125,200,100,25);
        loginButton.addActionListener(this);
        //reset button
        resetButton.setBounds(225,200,100,25);
        resetButton.addActionListener(this);
        //add all component to the frame
        frame.add(userIdLable);
        frame.add(userPasswordLabel);
        frame.add(messageLable);
        frame.add(userPasswordField);
        frame.add(userIdField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==resetButton) {
            userIdField.setText("");
            userPasswordField.setText("");
            messageLable.setText("");
        }

        if(e.getSource()==loginButton) {

            String userID = userIdField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if(loginInfo.containsKey(userID)) {
                if(loginInfo.get(userID).equals(password)) {
                    messageLable.setForeground(Color.green);
                    messageLable.setText("Login successful");
                    frame.dispose();
                    WellcomPadg welcomePage = new WellcomPadg(userID);

                }else{
                    messageLable.setForeground(Color.red);
                    messageLable.setText("Password is false");
                }
            }
            else{
                messageLable.setForeground(Color.red);
                messageLable.setText("Username is not found");
            }
        }
    }
}

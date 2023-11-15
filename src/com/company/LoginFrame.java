package com.company;
import javax.swing.*;

public class LoginFrame extends JFrame{

    LoginFrame(){
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(20,20,100,20);
        this.add(usernameLabel);

        JTextField usernameInput = new JTextField();
        usernameInput.setBounds(120,20,100,20);
        this.add(usernameInput);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(20,60,100,20);
        this.add(passwordLabel);

        JTextField passwordInput = new JTextField();
        passwordInput.setBounds(120,60,100,20);
        this.add(passwordInput);


        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(20, 80, 100, 20);
        this.add(loginBtn);

        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(20, 100, 100, 20);
        this.add(registerBtn);

        JButton fpBtn = new JButton("Forgotten password");
        fpBtn.setBounds(120, 100, 200, 20);
        this.add(fpBtn);

        this.setTitle("Login");
        this.setSize(300,300);
        this.setLayout(null);
        this.setVisible(true);
    }
}

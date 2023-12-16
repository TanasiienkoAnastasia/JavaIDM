package org.example;

import javax.swing.*;
import java.awt.*;

public class RegistrationForm extends JDialog {
    private JTextField tfName;
    private JTextField tfEmail;
    private JTextField tfPhone;
    private JTextField tfAddress;
    private JButton btnRegister;
    private JButton btnCancel;
    private JPasswordField pfPassword;
    private JPasswordField pfConfirmPassword;
    private JPanel registerPanel;

    public RegistrationForm(JFrame parent) {
        super(parent);
        setTitle("Create a new account");
        setContentPane(registerPanel);
        setMinimumSize(new Dimension(600, 500));
        setModal(true);
        setLocationRelativeTo(parent);
        setVisible(true);
    }

    public static void main(String[] args) {
        RegistrationForm myForm = new RegistrationForm(null);
    }

}

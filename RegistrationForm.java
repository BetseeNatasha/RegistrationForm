import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame implements ActionListener {

    // Components of the form
    private Container container;
    private JLabel titleLabel;
    private JLabel nameLabel;
    private JTextField nameTextField;
    private JLabel emailLabel;
    private JTextField emailTextField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JLabel genderLabel;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private ButtonGroup genderGroup;
    private JButton submitButton;

    // Constructor to setup the GUI
    public RegistrationForm() {
        setTitle("Registration Form");
        setBounds(300, 90, 400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        titleLabel = new JLabel("Registration Form");
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        titleLabel.setSize(300, 30);
        titleLabel.setLocation(100, 30);
        container.add(titleLabel);

        nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        nameLabel.setSize(100, 20);
        nameLabel.setLocation(50, 80);
        container.add(nameLabel);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        nameTextField.setSize(190, 20);
        nameTextField.setLocation(150, 80);
        container.add(nameTextField);

        emailLabel = new JLabel("Email:");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        emailLabel.setSize(100, 20);
        emailLabel.setLocation(50, 120);
        container.add(emailLabel);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        emailTextField.setSize(190, 20);
        emailTextField.setLocation(150, 120);
        container.add(emailTextField);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordLabel.setSize(100, 20);
        passwordLabel.setLocation(50, 160);
        container.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordField.setSize(190, 20);
        passwordField.setLocation(150, 160);
        container.add(passwordField);

        genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        genderLabel.setSize(100, 20);
        genderLabel.setLocation(50, 200);
        container.add(genderLabel);

        maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setFont(new Font("Arial", Font.PLAIN, 15));
        maleRadioButton.setSelected(true);
        maleRadioButton.setSize(75, 20);
        maleRadioButton.setLocation(150, 200);
        container.add(maleRadioButton);

        femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setFont(new Font("Arial", Font.PLAIN, 15));
        femaleRadioButton.setSize(80, 20);
        femaleRadioButton.setLocation(225, 200);
        container.add(femaleRadioButton);

        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Arial", Font.PLAIN, 15));
        submitButton.setSize(100, 20);
        submitButton.setLocation(150, 250);
        submitButton.addActionListener(this);
        container.add(submitButton);

        setVisible(true);
    }

    // Action listener method for handling button click events
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameTextField.getText();
        String email = emailTextField.getText();
        String password = new String(passwordField.getPassword());
        String gender = maleRadioButton.isSelected() ? "Male" : "Female";

        // Display the user information
        JOptionPane.showMessageDialog(this, "Name: " + name + "\nEmail: " + email + "\nGender: " + gender, "User Information", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}

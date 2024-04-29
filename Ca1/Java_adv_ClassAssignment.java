import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Java_adv_ClassAssignment {
    JFrame f;

    Java_adv_ClassAssignment()
    {
        f = new JFrame("Wipro Placement Drive");

        JLabel header = new JLabel("Wipro Placement Drive");
        header.setBounds(30, 30, 200, 30);
        f.add(header);

        JLabel regno = new JLabel("Registration no");
        regno.setBounds(30, 70, 100, 30);
        f.add(regno);

        JTextField regnoTF = new JTextField();
        regnoTF.setBounds(160, 70, 100, 30);
        f.add(regnoTF);

        JLabel name = new JLabel("Name");
        name.setBounds(30, 110, 100, 30);
        f.add(name);

        JTextField nameTF = new JTextField();
        nameTF.setBounds(160, 110, 100, 30);
        f.add(nameTF);

        JLabel age = new JLabel("Age");
        age.setBounds(30, 150, 100, 30);
        f.add(age);

        JTextField ageTF = new JTextField();
        ageTF.setBounds(160, 150, 100, 30);
        f.add(ageTF);

        JLabel cgpa = new JLabel("CGPA");
        cgpa.setBounds(30, 190, 100, 30);
        f.add(cgpa);

        JTextField cgpaTF = new JTextField();
        cgpaTF.setBounds(160, 190, 100, 30);
        f.add(cgpaTF);

        JLabel address = new JLabel("Address");
        address.setBounds(30, 230, 100, 30);
        f.add(address);

        JTextArea addressTA = new JTextArea();
        addressTA.setBounds(160, 230, 100, 30);
        f.add(addressTA);

        JLabel certificates = new JLabel("Certificates");
        certificates.setBounds(30, 270, 100, 30);
        f.add(certificates);

        JCheckBox certif = new JCheckBox("Matriculation certificate");
        certif.setBounds(160, 270, 200, 30);
        f.add(certif);

        JCheckBox certif2 = new JCheckBox("1st Semester");
        certif2.setBounds(160, 310, 200, 30);
        f.add(certif2);

        JCheckBox certif3 = new JCheckBox("2nd Semester");
        certif3.setBounds(160, 350, 200, 30);
        f.add(certif3);

        JCheckBox certif4 = new JCheckBox("3rd Semester");
        certif4.setBounds(160, 390, 200, 30);
        f.add(certif4);

        JCheckBox certif5 = new JCheckBox("4th Semester");
        certif5.setBounds(160, 430, 200, 30);
        f.add(certif5);

        JCheckBox certif6 = new JCheckBox("5th Semester");
        certif6.setBounds(160, 470, 200, 30);
        f.add(certif6);

        JLabel display = new JLabel();
        display.setBounds(10, 600, 800, 30);
        f.add(display);
        
        JLabel display2 = new JLabel();
        display2.setBounds(10, 640, 800, 30);
        f.add(display2);

        JButton submit = new JButton("Submit");
        submit.setBounds(100,530,80,30);
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String c = " ";
                if (certif.isSelected())
                {
                    c = c+certif.getText()+" , ";
                }
                if (certif2.isSelected())
                {
                    c = c+certif2.getText()+" , ";
                }
                if (certif3.isSelected())
                {
                    c = c+certif3.getText()+" , ";
                }
                if (certif4.isSelected())
                {
                    c = c+certif4.getText()+" , ";
                }
                if (certif5.isSelected())
                {
                    c = c+certif5.getText()+" , ";
                }
                if (certif6.isSelected())
                {
                    c = c+certif6.getText()+" .";
                }
                display.setText("Reg no : "+regnoTF.getText()+",    Name : "+nameTF.getText()+",    Age : "+ageTF.getText()+",    CGPA : "+cgpaTF.getText()+",    Address : "+addressTA.getText());
                display2.setText("Certificates :" +c);
            }
        });
        f.add(submit);

        f.setSize(800,800);
        f.setResizable(true);
        f.setLocationRelativeTo(null);
        f.getContentPane().setBackground(Color.PINK);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Java_adv_ClassAssignment();
    }
    
}

package demo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class register implements ActionListener{  
    JLabel l0,l1,l2,l3,l4,l5,lt;
    JTextField tf1,tf3,tf2;
    JRadioButton r1;
    JButton b1; 
   
    
    JPasswordField p1, p2;  
    register(){  
        JFrame f= new JFrame(); 
        JPanel p = new JPanel();
        p.setBounds(40,40,600,500);    
        p.setBackground(Color.gray);
        f.setSize(500,500);  
        f.setLayout(null);  
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l0 = new JLabel("_______________Register______________");  
        l0.setForeground(Color.white);  
        l0.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l0.setBounds(170,50,500,20);   
        lt = new JLabel("create your account it's free and only takes a minute"); 
        lt.setForeground(Color.white);  
        lt.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lt.setBounds(170,80,500,15);
        l1=new JLabel();
        l1.setBounds(50,100,150,20);  
        l2=new JLabel();
        l2.setBounds(100,100,150,20);  
        l3=new JLabel();
        l3.setBounds(50,200,150,20); 
        tf1=new JTextField(" Firstname");  
        tf1.setBounds(150,100,150,20);  
        tf2=new JTextField(" Lastname");  
        tf2.setBounds(400,100,150,20);  
        tf3=new JTextField(" Email");  
        tf3.setBounds(150,150,400,20);  
        l4=new JLabel();
        l4.setBounds(50,200,400,20); 
        p1 = new JPasswordField(" password "); 
        p1.setBounds(150,200,400,20);
        l5=new JLabel();
        l5.setBounds(50,250,400,20); 
        p2 = new JPasswordField(" confirm password ");
        p2.setBounds(150,250,400,20);
        r1=new JRadioButton("I accept the terms of use and privacy policy");    
        r1.setBounds(200,275,300,20);      
        b1=new JButton(" Register Now ");   
        b1.setBounds(150,300,400,20);
        b1.setBackground(Color.green);
        
        b1.addActionListener(this);   
        
        f.add(l0);f.add(lt);f.add(l1);f.add(l1); f.add(l2); f.add(l3);f.add(l4);f.add(l5);f.add(p1);f.add(p2);
        f.add(tf1);f.add(tf2);f.add(tf3);f.add(r1);
        f.add(b1);
        f.add(p);
        
    }         
    
    public void actionPerformed(ActionEvent e) {  
       
        if(r1.isSelected() && e.getSource()==b1){  
            JOptionPane.showMessageDialog(null,"Successfully registered :)");
        }
    }  
    
public static void main(String[] args) {  
    new register();  

}
}  
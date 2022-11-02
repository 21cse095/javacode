package demo;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class changeBackground extends JFrame implements ActionListener {
   
    JFrame frame;
    JButton red, green, blue, pink, yellow, magenta, orange;
   
    changeBackground() {
       
        Font font = new Font("Times New Roman", Font.BOLD, 9);
        frame = new JFrame("Colourful window");
        Color c = new Color(255, 255, 255);
       
        red = new JButton("RED");
        red.setBounds(280, 100, 100, 40);
        red.setFont(font);
        red.setBackground(c);
       
        green = new JButton("GREEN");
        green.setBounds(280, 200, 100, 40);
        green.setFont(font);
        green.setBackground(c);
       
        blue = new JButton("BLUE");
        blue.setBounds(280, 300, 100, 40);
        blue.setFont(font);
        blue.setBackground(c);
       
        pink = new JButton("PINK");
        pink.setBounds(280, 400, 100, 40);
        pink.setFont(font);
        pink.setBackground(c);
       
        yellow = new JButton("YELLOW");
        yellow.setBounds(280, 500, 100, 40);
        yellow.setFont(font);
        yellow.setBackground(c);
       
       
       
        frame.add(red);
        frame.add(green);
        frame.add(blue);
        frame.add(pink);
        frame.add(yellow);
       
       
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        pink.addActionListener(this);
        yellow.addActionListener(this);
     
       
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);
        frame.setSize(650, 600);
        frame.setVisible(true);      
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
   
    public void actionPerformed(ActionEvent ae)
    {
       
        if(ae.getSource() == red)
            frame.getContentPane().setBackground(Color.RED);
        if(ae.getSource() == green)
            frame.getContentPane().setBackground(Color.GREEN);
        if(ae.getSource() == blue)
            frame.getContentPane().setBackground(Color.BLUE);
        if(ae.getSource() == pink)
            frame.getContentPane().setBackground(Color.PINK);
        if(ae.getSource() == yellow)
            frame.getContentPane().setBackground(Color.YELLOW);
           
    }
   
    public static void main(String[] args) {
       
        new changeBackground();
       
    }
   
}
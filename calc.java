 import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.*;
import javax.swing.*;

public class calc extends Frame implements ActionListener{
   


	JButton add;
	JButton sub,mul,div,exit;
	JTextField tf;
	JTextField tf1;
	JTextField tf2;

public calc()
{

JLabel l1=new JLabel("Enter First no.");
JLabel l2=new JLabel("Enter Second no.");
tf=new JTextField(10);

tf1=new JTextField(10);

tf2=new JTextField(10);

add=new JButton("ADD");

sub=new JButton("SUBTRACT");
mul=new JButton("PRODUCT");
div=new JButton("DIVIDE");
exit=new JButton("EXIT");

add.addActionListener(this);
sub.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);
exit.addActionListener(this);

add(l1);
add(tf);
add(l2);
add(tf1);
add(tf2);
add(add);
add(sub);
add(mul);
add(div);
add(exit);
tf2.setEditable(false);

setSize(400,450);
setLayout(new FlowLayout(FlowLayout.CENTER));
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
Double s1=Double.parseDouble(tf.getText());
Double s2=Double.parseDouble(tf1.getText());
String loc="";
JButton btn=(JButton)e.getSource();
if(btn==add)
{
loc="sum="+(s1+s2);
}
else if(btn==sub)
{
loc="subtraction="+(s1-s2);
}
else if(btn==mul)
{
loc="product="+(s1*s2);
}
else if(btn==div)
{
loc="division"+(s1/s2);
}
else if(btn==exit)
{
	System.exit(0);
}
tf2.setText(loc);
}
public static void main(String args[])
{
new calc();
}



}



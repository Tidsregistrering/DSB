package dataaccesslayer;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class StopWatch extends JFrame implements ActionListener,Runnable
{
 JLabel disp;
 JButton btn;
 boolean stop=false;
 int i,j,k,l;
 public StopWatch()
 {
  disp=new JLabel();
  btn=new JButton("Start");
  disp.setFont(new Font("Helvetica",Font.PLAIN,20));
  disp.setBackground(Color.cyan);
  disp.setForeground(Color.red);
  Container c=getContentPane();
  c.setLayout(new FlowLayout());
  c.add(disp); c.add(btn);
  btn.addActionListener(this);
 }
 public void run()
 {
  for(i=0;;i++)
  {
   for(j=0;j< 60;j++)
   {
    for(k=0;k< 60;k++)
    {
     for(l=0;l< 100;l++)
     {
      if(stop)
      {
       break;
      }
      NumberFormat nf = new DecimalFormat("00");
      disp.setText(nf.format(i)+":"+nf.format(j)+":"+nf.format(k)+":"+nf.format(l));
      try{
       Thread.sleep(10);
      }catch(Exception e){}
     }
    }
   }
  }
 }
 public void actionPerformed(ActionEvent ae)
 {
  Thread t=new Thread(this);
  if(ae.getActionCommand().equals("Start"))
  {
   t.start();
   btn.setText("Stop");
  }
  else
  {
   stop=true;
  }
 }
 public static void main(String[] args) 
 {
  StopWatch s=new StopWatch();
  s.setSize(500,100);
  s.setVisible(true);
  s.setTitle("StopWatch");
  s.setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
}
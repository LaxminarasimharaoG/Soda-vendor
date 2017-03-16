

package vendor;

/**
 *
 * @author laxminarasimharao
 */

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class vendor extends JFrame{
  private final JButton left, right,right1;
  private final Canvas display;
  int total;
  
  int paid;
  
  
private final JTextField textField1; 

    private ActionListener handler;
    
  public vendor()
  {
    
      JLabel Label = new JLabel("",JLabel.LEFT);
      JPanel panel = new JPanel(new BorderLayout());
         
      textField1 = new JTextField("", 26);
      textField1.setEditable(false); 
      add(textField1);
          
    textField1.addActionListener(handler);
    getContentPane().setLayout(new BorderLayout());
    display = new Canvas();
    getContentPane().add(BorderLayout.CENTER, display);
    panel.add(Label,BorderLayout.NORTH);
         add(panel);
   JPanel p = new JPanel();
 
         
    panel.add(textField1,BorderLayout.CENTER);
    add(textField1);
    textField1.setFont(new Font("Serif", Font.BOLD, 24));
   
        
   left = new JButton("5c");
   p.add(left);
   
   right = new JButton("10c");
   p.add(right);
   
   right1 = new JButton("25c");
   p.add(right1);
   
   
   getContentPane().add(BorderLayout.SOUTH, p);
   Handler Handler = new Handler();
   textField1.addActionListener(Handler);
   left.addActionListener(Handler);
   right.addActionListener(Handler);
   right1.addActionListener(Handler);
   setSize(350,250); 
   show();  
   
     }

 public static void main(String args[])
  {
      JFrame frame = new JFrame();
        frame.getContentPane().add(new vendor());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
   vendor machine = new vendor();

   machine.addWindowListener(
        new WindowAdapter(){
          @Override
          public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
          }
        );
   }


class Handler implements ActionListener{
   @Override
   public void actionPerformed(ActionEvent e)
    { 
         
        if(e.getSource() == left)
        paid+=5;

 
        
        else  if (e.getSource() == right)
         paid+=10;
 
 
else if (e.getSource() == right1)
         paid+=25;
      total=75;
     
            if(paid>=75)
     
       textField1.setText ("You are all set" );
                else if(paid<total)
               
               textField1. setText ("\n"+"Money needed\n "+ (total-paid)+"c" );        
          
             display.repaint();
              
                   
          }
                   }
}
    
                   
                
  

    

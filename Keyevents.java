/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyevents;

/**
 *
 * @author sjcet
 */
import java.awt.*;    
import java.awt.event.*;    

public class Keyevents extends Frame implements KeyListener {

    
 Label l;    
    TextArea area;    

    Keyevents() {    
           
        l = new Label();    
  
        l.setBounds (20, 50, 100, 20);    

        area = new TextArea();    

        area.setBounds (20, 80, 300, 300);    
 
        area.addKeyListener(this);  

        add(l);  
add(area);    

        setSize (400, 400);    
        setLayout (null);    
        setVisible (true);    
    }    
    public void keyPressed (KeyEvent e) {    
        l.setText ("Key Pressed");    
    }    
    public void keyReleased (KeyEvent e) {    
        l.setText ("Key Released");    
    }    
    public void keyTyped (KeyEvent e) {    
        l.setText ("Key Typed");    class MyException extends Exception
{
 public MyException(String str)
 {
  System.out.println(str);
 }
}class MyException extends Exception
{
 public MyException(String str)
 {
  System.out.println(str);
 }
}class MyException extends Exception
{
 public MyException(String str)
 {
  System.out.println(str);
 }
}
    }    
    
    public static void main(String[] args)
 {
      new Keyevents();    
    }
    
}





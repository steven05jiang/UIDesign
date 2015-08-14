package ui;

import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class UI9 extends Applet{
    static JTextField text1,text2;
    Sqr s=new Sqr();
    public void init(){
        text1=new JTextField(10);
        text2=new JTextField(10);
        add(text1);
        add(text2);
        text1.addActionListener(s);
    }
}
class Sqr implements ActionListener{
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==UI9.text1){
            long n=Long.parseLong(UI9.text1.getText());
            UI9.text2.setText(String.valueOf(n*n));
        }
        else{}
    }
}

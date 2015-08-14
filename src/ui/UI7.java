package ui;

import java.applet.*;import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
@SuppressWarnings("serial")
class MPanel extends JPanel{
    int x;
    JLabel label1;
    MPanel(int a){
        x=a;
        getSize();
        label1=new JLabel("No."+x+" panel");
        add(label1);
    }
    public Dimension getPreferredSize(){
        return new Dimension(200,50);
    }
}
@SuppressWarnings("serial")
public class UI7 extends Applet implements ActionListener{
    CardLayout mycard;
    MPanel myPanel[];
    JPanel p;
    private void addButton(JPanel pan,String butName,ActionListener listener){
        JButton aButton=new JButton(butName);
        aButton.addActionListener(listener);
        pan.add(aButton);
    }
    public void init(){
        setLayout(new BorderLayout());
        mycard=new CardLayout();
        this.setSize(400,150);
        p=new JPanel();
        p.setLayout(mycard);
        myPanel=new MPanel[10];
        for(int i=0;i<10;i++){
            myPanel[i]=new MPanel(i+1);
            p.add("A"+i,myPanel[i]);
        }
        JPanel p2=new JPanel();
        addButton(p2,"First",this);
        addButton(p2,"Last",this);
        addButton(p2,"Previous",this);
        addButton(p2,"Next",this);
        add(p,"Center"); 
        add(p2,"South");
    }
    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand().equals("First"))mycard.first(p);
        else if(e.getActionCommand().equals("Last"))mycard.last(p);
        else if(e.getActionCommand().equals("Previous"))mycard.previous(p);
        else if(e.getActionCommand().equals("Next"))mycard.next(p);
    }
}

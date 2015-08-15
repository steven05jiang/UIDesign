package ui;

import java.applet.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
class Panel114 extends JPanel{
    JRadioButton box1,box2,box3;
    ButtonGroup g;
    Panel114(){
        setLayout(new GridLayout(1,3));
        g = new ButtonGroup();
        box1 = new JRadioButton(MyWindow14.fName[0]+" ",false);
        box2 = new JRadioButton(MyWindow14.fName[1]+" ",false);
        box3 = new JRadioButton(MyWindow14.fName[2]+" ",false);
        g.add(box1);g.add(box2);g.add(box3);
        add(box1);add(box2);add(box3);
    }
}
class Panel214 extends JPanel{
    JCheckBox box1,box2,box3;
    ButtonGroup g;
    Panel214(){
        setLayout(new GridLayout(1,3));
        g = new ButtonGroup();
        box1 = new JCheckBox("1");
        box2 = new JCheckBox("2");
        box3 = new JCheckBox("3");
        g.add(box1);g.add(box2);g.add(box3);
        add(box1);add(box2);add(box3);
    }
}
class MyWindow14 extends JFrame implements ItemListener{
    Panel114 panel1;
    Panel214 panel2;
    JLabel label1,label2;
    JTextArea text1,text2;
    static String fName[] = {"HP","IBM","DELL"};
    static double priTbl[][]={{1.20,1.15,1.10},{1.70,1.65,1.60},{1.65,1.60,1.58}};
    static int production = -1;
    MyWindow14(String s){
        super(s);
        Container con = this.getContentPane();
        con.setLayout(new GridLayout(3,2));
        this.setLocation(100,100);
        this.setSize(400,100);
        panel1 = new Panel114();panel2 = new Panel214();
        label1 = new JLabel("Product",JLabel.CENTER);
        label2 = new JLabel("Info",JLabel.CENTER);
        text1 = new JTextArea();text2 = new JTextArea();
        con.add(label1);con.add(label2);con.add(panel1);
        con.add(panel2);con.add(text1);con.add(text2);
        panel1.box1.addItemListener(this);
        panel1.box2.addItemListener(this);
        panel1.box3.addItemListener(this);
        panel2.box1.addItemListener(this);
        panel2.box2.addItemListener(this);
        panel2.box3.addItemListener(this);
        this.setVisible(true);this.pack();
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getItemSelectable()==panel1.box1){
            production =0;
            text1.setText(fName[0]+"pro is 0");text2.setText("");
        }
        else if(e.getItemSelectable()==panel1.box2){
            production =1;
            text1.setText(fName[1]+"pro is 1");text2.setText("");
        }
        else if(e.getItemSelectable()==panel1.box3){
            production =2;
            text1.setText(fName[2]+"pro is 2");text2.setText("");
        }
        else{
            if(production ==-1) return;
            if(e.getItemSelectable()==panel2.box1){
                text2.setText(""+priTbl[production][0]+" ");
            }
            else if(e.getItemSelectable()==panel2.box2){
                text2.setText(""+priTbl[production][1]+" ");
            }
            else if(e.getItemSelectable()==panel2.box3){
                text2.setText(""+priTbl[production][2]+" ");
            }
        }
    }
}
@SuppressWarnings("serial")
public class UI14 extends Applet{
    MyWindow14 myWin = new MyWindow14("SHOPPING INFO");
}

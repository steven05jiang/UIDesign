package ui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.*;

public class UI5 {
    public static void main(String[]args){
        JLabel label1,label2,label3,label4,label5;
        JFrame mw=new JFrame("BorderLayout");
        mw.setSize(250,200);
        Container con=mw.getContentPane();
        con.setLayout(new BorderLayout());
        label1=new JLabel("��");
        label2=new JLabel("��",JLabel.CENTER);
        label3=new JLabel("��");
        label4=new JLabel("��",JLabel.CENTER);
        label5=new JLabel("��",JLabel.CENTER);
        con.add(label1,"East");
        con.add(label2,"South");
        con.add(label3,"West");
        con.add(label4,"North");
        con.add(label5,"Center");
        mw.setVisible(true);
    }
}

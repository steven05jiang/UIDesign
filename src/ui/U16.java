package ui;

import java.applet.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.*;
class MyWindow16 extends JFrame implements ListSelectionListener{
    JList list1,list2;
    String news[]={"�����ձ�","������","�㽭�ձ�","�Ļ㱨"};
    String sports[]={"����","����","ƹ����","����"};
    JTextArea text;
    MyWindow16(String s){
        super(s);
        Container con = getContentPane();
        con.setBackground(Color.BLUE);
        con.setLayout(new GridLayout(2,2));
        con.setSize(200,500);
        list1 = new JList(news);
        list1.setVisibleRowCount(3);
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list1.addListSelectionListener(this);
        list2 = new JList(sports);
        list2.setVisibleRowCount(2);
        list2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        list2.addListSelectionListener(this);
        con.add(list1);
        con.add(list2);
        text= new JTextArea(10,20);
        con.add(text);
        this.setVisible(true);
        this.pack();
    }
    public void valueChanged(ListSelectionEvent e){// ÿ��ѡ��ֵ��������ʱ����
        if(e.getSource()==list1){
            text.setText(null);
            Object listValue = ((JList) e.getSource()).getSelectedValue();
            String seleName = listValue.toString();
            for(int i=0;i<news.length;i++)
                if(news[i].equals(seleName)){
                    text.append(seleName+ "��ѡ��\n");
                }
        }
        else if(e.getSource()==list2){
            text.setText(null);
            int tempList[] =list2.getSelectedIndices();
            for(int i=0;i<tempList.length;i++)
                text.append(sports[tempList[i]] + "��ѡ��\n");
         }
     }
 }
public class U16 extends Applet{
//    MyWindow16 myWin = new MyWindow16("�б�ʾ��");
	public void init(){
		MyWindow16 myWin = new MyWindow16("�б�ʾ��");
	}
}

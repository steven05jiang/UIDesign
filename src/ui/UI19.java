package ui;

import java.applet.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MenuWindow extends JFrame implements ActionListener{
    public static JTextField text;
    private void addItem(JMenu Menu,String menuName,ActionListener listener){
        JMenuItem anItem = new JMenuItem(menuName);
        anItem.setActionCommand(menuName);
        anItem.addActionListener(listener);
        Menu.add(anItem);
    }
    public MenuWindow(String s,int w,int h){
        setTitle(s);
        Container con = this.getContentPane();
        con.setLayout(new BorderLayout());
        this.setLocation(100,100);
        this.setSize(w,h);
        JMenu menu1 = new JMenu("����");
        addItem(menu1," �ܲ�",this);
        addItem(menu1," ����",this);
        addItem(menu1,"����",this);
        JMenu menu2 = new JMenu("����");
        addItem(menu2,"����",this);
        addItem(menu2,"����",this);
        addItem(menu2,"��Ϸ",this);
        JMenuBar menubar = new JMenuBar();
        text = new JTextField();
        menubar.add(menu1);
        menubar.add(menu2);
        setJMenuBar(menubar);
        con.add(text,BorderLayout.NORTH);
    }
    public void actionPerformed(ActionEvent e){
        text.setText(e.getActionCommand()+"�˵��ѡ��!");
    }
}
public class UI19 extends Applet implements ActionListener{
    MenuWindow window;
    JButton button;
    boolean bflg;
    public void init(){
        button = new JButton("���ҵ���������֮��");bflg =true;
        window = new MenuWindow("��������֮��",100,100);
        button.addActionListener(this);
        add(button);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            if(bflg){
                window.setVisible(true);
                bflg = false;
                button.setLabel("�ر��ҵ���������֮��");
            }
            else{
               window.setVisible(false);
               bflg = true;
               button.setLabel("���ҵ���������֮��");
            }
        }
    }
}

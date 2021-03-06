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
        JMenu menu1 = new JMenu("体育");
        addItem(menu1," 跑步",this);
        addItem(menu1," 跳绳",this);
        addItem(menu1,"打球",this);
        JMenu menu2 = new JMenu("娱乐");
        addItem(menu2,"唱歌",this);
        addItem(menu2,"跳舞",this);
        addItem(menu2,"游戏",this);
        JMenuBar menubar = new JMenuBar();
        text = new JTextField();
        menubar.add(menu1);
        menubar.add(menu2);
        setJMenuBar(menubar);
        con.add(text,BorderLayout.NORTH);
    }
    public void actionPerformed(ActionEvent e){
        text.setText(e.getActionCommand()+"菜单项被选中!");
    }
}
public class UI19 extends Applet implements ActionListener{
    MenuWindow window;
    JButton button;
    boolean bflg;
    public void init(){
        button = new JButton("打开我的体育娱乐之窗");bflg =true;
        window = new MenuWindow("体育娱乐之窗",100,100);
        button.addActionListener(this);
        add(button);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            if(bflg){
                window.setVisible(true);
                bflg = false;
                button.setLabel("关闭我的体育娱乐之窗");
            }
            else{
               window.setVisible(false);
               bflg = true;
               button.setLabel("打开我的体育娱乐之窗");
            }
        }
    }
}

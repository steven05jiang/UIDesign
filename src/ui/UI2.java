package ui;

import javax.swing.*;
import java.awt.*;

public class UI2 {
	public static MyWindowDemo mw1;
	public static MyWindowDemo mw2;

	public static void main(String args[]){
	        JButton butt1 = new JButton("I AM FIRST BUTTON");
	        String name1 = "My first window";
	        String name2 = "My second window";
	        mw1 = new MyWindowDemo(name1,butt1,Color.BLUE,350,450);
	        mw1.setVisible(true);
	        JButton butt2 = new JButton("I AM THE OTHER BUTTON");
	        mw2 = new MyWindowDemo(name2,butt2,Color.RED,300,400);
	        mw2.setVisible(true);
	    }
}

@SuppressWarnings("serial")
class MyWindowDemo extends JFrame {
	public MyWindowDemo(String name, JButton button, Color c, int w, int h) {
		super();
		setTitle(name);
		setSize(w, h);
		Container con = getContentPane();
		con.add(button);
		con.setBackground(c);
	}
}

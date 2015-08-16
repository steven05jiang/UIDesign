package ui;

import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UI18 {
	public static void main(String[] args){
		MainWindow window = new MainWindow();
//		SubWindow subWindow = new SubWindow();

	}
}

class MainWindow extends JFrame implements ActionListener{
	JButton button;
	JLabel label;
	SubWindow subWindow;
	public MainWindow(){
		setSize(400,600);
		setLayout(new GridLayout(2,1));
		subWindow = new SubWindow();
		button = new JButton("Open window");
		label = new JLabel("", JLabel.CENTER);
		button.addActionListener(this);
		add(label);
		add(button);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Open window")){
			button.setText("Close window");
			label.setText("Window is ready.");
			subWindow.setVisible(true);
		}
		else if(e.getActionCommand().equals("Close window")){
			button.setText("Open window");
			label.setText("Window is closed.");
			subWindow.setVisible(false);
		}
	} 
}

class SubWindow extends JFrame implements ActionListener{
	JMenuBar menuBar;
	MyMenu menu1, menu2;
	JLabel label;
	public SubWindow(){
		setSize(400,200);
		setLayout(new GridLayout(2,1));
		menuBar = new JMenuBar();
		label = new JLabel("", JLabel.CENTER);
		menu1 = new MyMenu("Sport","Basketball","Football","Swimming");
		menu2 = new MyMenu("Music","Violin","Guitar","Piano");
		menuBar.add(menu1);
		menuBar.add(menu2);
		menu1.mi1.addActionListener(this);
		menu1.mi2.addActionListener(this);
		menu1.mi3.addActionListener(this);
		menu2.mi1.addActionListener(this);
		menu2.mi2.addActionListener(this);
		menu2.mi3.addActionListener(this);
		add(menuBar);
		add(label);
		setVisible(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().getClass() == JMenuItem.class){
			label.setText(e.getActionCommand());
		}
	}
}

class MyMenu extends JMenu{
	JMenuItem mi1, mi2, mi3;
	public MyMenu(){
		super();
	}
	public MyMenu(String title, String a, String b, String c){
		super(title);
		mi1 = new JMenuItem(a);
		mi2 = new JMenuItem(b);
		mi3 = new JMenuItem(c);
		add(mi1);
		add(mi2);
		add(mi3);
	}
}

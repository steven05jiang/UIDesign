package ui;

import java.applet.Applet;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


@SuppressWarnings("serial")
public class UI11 extends Applet implements ActionListener{
	JLabel title = new JLabel("Times Calculator", JLabel.CENTER);
	Panel1 p1 = new Panel1();
	Panel2 p2 = new Panel2();

	public void init(){
		setSize(600, 600);
		setLayout(new GridLayout(4, 1));
		p2.button.addActionListener(this);
		add(title);
		add(p1);
		add(new JLabel());
		add(p2);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == p2.button){
			p2.area.setText(null);
			int start = Integer.parseInt(p1.text1.getText());
			int end = Integer.parseInt(p1.text2.getText());
			int factor = Integer.parseInt(p1.text3.getText());
			while(start <= end){
				if(start%factor != 0){
					start = (start/factor + 1)*factor;
					continue;
				}
				p2.area.setText(p2.area.getText() + String.valueOf(start) + " ");
				start += factor;
			}
		}
		else{}
	}
	
}

@SuppressWarnings("serial")
class Panel1 extends JPanel{
	JTextField text1, text2, text3;
	public Panel1(){
		super();
		setLayout(new GridLayout(1, 6));
		text1 = new JTextField(5);
		text2 = new JTextField(5);
		text3 = new JTextField(5);
		add(new JLabel("Start Number", JLabel.CENTER));
		add(text1);
		add(new JLabel("End Number", JLabel.CENTER));
		add(text2);
		add(new JLabel("Factor", JLabel.CENTER));
		add(text3);
	}
}

@SuppressWarnings("serial")
class Panel2 extends JPanel{
	JTextArea area;
	JButton button;
	public Panel2(){
		setLayout(new GridLayout(1,4));
		area = new JTextArea(5, 2);
		area.setBackground(Color.CYAN);
		area.setEditable(false);
		area.setLineWrap(true);
		JScrollPane pane = new JScrollPane(area);
		button = new JButton("Calculate");
		add(new JLabel("Result", JLabel.CENTER));
		add(pane);
		add(new JLabel());
		add(button);
	}
}
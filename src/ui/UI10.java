package ui;

import java.applet.Applet;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.*;

@SuppressWarnings("serial")
public class UI10 extends Applet implements ActionListener{
	JTextField text;
	JTextArea  area;
	JButton button1, button2;
	public void init(){
		setSize(250,150);
		text = new JTextField(10);
		area = new JTextArea(5,10);
		area.setBackground(Color.GREEN);
		area.setEditable(false); // NO EDITTING
		button1 = new JButton("Sum");
		button2 = new JButton("Clear");
		button1.addActionListener(this);
		button2.addActionListener(this);
		add(text);
		add(area);
		add(button1);
		add(button2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Sum")){
			String s = text.getText();
			StringTokenizer tokens = new StringTokenizer(s);
			long sum = 0;
			while(tokens.hasMoreTokens()){
				sum += Long.parseLong(tokens.nextToken());
			}
			area.setText(String.valueOf(sum));
		}
		else if(e.getActionCommand().equals("Clear")){
			text.setText("");
			area.setText("");
		}
		else{}
	}
}

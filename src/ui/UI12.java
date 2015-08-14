package ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class UI12{
	static JFrame frame;
	static Panel1x p1 = new Panel1x();
	static Panel2x p2 = new Panel2x();
	static TimesNum tn = new TimesNum();
	public static void main(String[] args){
		frame = new JFrame();
		JLabel title = new JLabel("Times Calculator", JLabel.CENTER);
		frame.setSize(600, 400);
		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(5, 1));
		p2.button.addActionListener(tn);
		con.add(title);
		con.add(p1);
		con.add(new JLabel());
		con.add(p2);
		con.add(new JLabel());
		frame.setVisible(true);
	}
	
}

@SuppressWarnings("serial")
class Panel1x extends JPanel{
	JTextField text1, text2, text3;
	public Panel1x(){
		super();
		setLayout(new GridLayout(1, 7));
		text1 = new JTextField(5);
		text2 = new JTextField(5);
		text3 = new JTextField(5);
		add(new JLabel("Start Number", JLabel.CENTER));
		add(text1);
		add(new JLabel("End Number", JLabel.CENTER));
		add(text2);
		add(new JLabel("Factor", JLabel.CENTER));
		add(text3);
		add(new JLabel());
	}
}

@SuppressWarnings("serial")
class Panel2x extends JPanel{
	JTextArea area;
	JButton button;
	public Panel2x(){
		setLayout(new GridLayout(1,5));
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
		add(new JLabel());
	}
}

class TimesNum implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == UI12.p2.button){
			UI12.p2.area.setText(null);
			int start = Integer.parseInt(UI12.p1.text1.getText());
			int end = Integer.parseInt(UI12.p1.text2.getText());
			int factor = Integer.parseInt(UI12.p1.text3.getText());
			while(start <= end){
				if(start%factor != 0){
					start = (start/factor + 1)*factor;
					continue;
				}
				UI12.p2.area.setText(UI12.p2.area.getText() + String.valueOf(start) + " ");
				start += factor;
			}
		}
		else{}
	}
}

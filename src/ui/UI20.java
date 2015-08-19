package ui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UI20 {
	public static void main(String[] args){
		MyWindow20 window = new MyWindow20();
	}
}


class MyWindow20 extends JFrame implements ActionListener{
	JButton button1, button2;
	JLabel label1, label2;
	Mydialog20 dialog;
	int textNum = -1;
	public MyWindow20(){
		setSize(600, 400);
		Container con = getContentPane();
		setLayout(new GridLayout(2,2));
		button1 = new JButton("B1");
		button2 = new JButton("B2");
		label1 = new JLabel("", JLabel.CENTER);
		label2 = new JLabel("", JLabel.CENTER);
		dialog = new Mydialog20();
		button1.addActionListener(this);
		button2.addActionListener(this);
		dialog.button1.addActionListener(this);
		dialog.button2.addActionListener(this);
		con.add(button1);
		con.add(button2);
		con.add(label1);
		con.add(label2);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1){
			dialog.setVisible(true);
			textNum = 0;
		}
		else if(e.getSource() == button2){
			dialog.setVisible(true);
			textNum = 1;
		}
		else{
			String s = dialog.text.getText();
			dialog.text.setText("");
			dialog.setVisible(false);
			if(e.getActionCommand().equals("OK")){
				label1.setText("");
				label2.setText("");
				if(textNum == 0)
					label1.setText(s);
				else
					label2.setText(s);
			}
				
		}
	} 
}

class Mydialog20 extends JDialog{
	JButton button1, button2;
	JTextField text;
	public Mydialog20(){
		super();
		setModal(true);
//		setSize(300, 100);
		button1 = new JButton("OK");
		button2 = new JButton("Cancel");
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 2));
		panel.add(button1);
		panel.add(button2);
		text = new JTextField(10);
		setTitle("Enter infomation");
		Container con = getContentPane();
		con.add(text, "Center");
		con.add(panel, "South");
		pack();
	}
}
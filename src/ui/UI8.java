package ui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UI8 {
	public static void main(String[] args){
		JFrame frame;
		MyP pane = new MyP();
		frame = new JFrame();
		frame.setSize(250, 200);
		Container con = frame.getContentPane();
		con.add(pane);
		frame.setVisible(true);
	}
}

@SuppressWarnings("serial")
class MyP extends JPanel implements ActionListener{
	JTextField text1, text2;
	JButton button;
	public MyP(){
		text1 = new JTextField("Enter a number",10);
		text2 = new JTextField(10);
		button = new JButton("Confirm");
		add(text1);
		add(text2);
		add(button);
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Confirm")){
			double a = Double.parseDouble(text1.getText());
			text2.setText(String.valueOf(a*a));
		}
		
	}
}


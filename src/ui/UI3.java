package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UI3 {
	public static void main(String[] args) {
		ButtonDemo myButtonGUI = new ButtonDemo();
		myButtonGUI.setVisible(true);
	}
}

@SuppressWarnings("serial")
class ButtonDemo extends JFrame implements ActionListener {
	public static final int Width = 250;
	public static final int Height = 200;

	ButtonDemo() {
		setSize(Width, Height);
		setTitle("Color Switch");
		Container conPane = getContentPane();
		conPane.setBackground(Color.BLUE);
		conPane.setLayout(new FlowLayout());
		JButton redBut = new JButton("Red");
		redBut.addActionListener(this);
		conPane.add(redBut);
		JButton greenBut = new JButton("Green");
		greenBut.addActionListener(this);
		conPane.add(greenBut);
	}

	public void actionPerformed(ActionEvent e) {
		Container conPane = getContentPane();
		if (e.getActionCommand().equals("Red"))
			conPane.setBackground(Color.RED);
		else if (e.getActionCommand().equals("Green"))
			conPane.setBackground(Color.GREEN);
	}
}

package ui;

import javax.swing.*;

public class UI1 {

	public static void main(String[] args) {
        JFrame mw = new JFrame("My first Window");
        mw.setSize(250,200);
        JButton button = new JButton("My first Button");
        mw.getContentPane().add(button);
        mw.setVisible(true);
	}

}

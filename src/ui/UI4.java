package ui;

import java.applet.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class UI4 extends Applet{
	MyPanel panel1, panel2;
	JButton Button;

	public void init() {
		panel1 = new MyPanel("ȷ��", "ȡ��", "��ǩ�����������1��");
		panel2 = new MyPanel("ȷ��", "ȡ��", "��ǩ�����������2��");
		Button = new JButton("���ǲ�������еİ�ť");
		add(panel1);
		add(panel2);
		add(Button);
//		JTextArea text = new JTextArea(20,30);
//		JScrollPane jsp = new JScrollPane(text);
//		add(jsp);
		setSize(300, 200);
	}
}


@SuppressWarnings("serial")
class MyPanel extends JPanel {
	JButton button1, button2;
	JLabel Label;

	MyPanel(String s1, String s2, String s3) {
		// Panel���󱻳�ʼ��Ϊ��������ť��һ���ı���
		button1 = new JButton(s1);
		button2 = new JButton(s2);
		Label = new JLabel(s3);
//		setBackground(Color.BLUE);
		add(button1);
		add(button2);
		add(Label);
	}
}

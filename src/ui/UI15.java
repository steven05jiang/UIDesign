package ui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class UI15 {
	
	public static void main(String[] args){
		MyWindow15 window = new MyWindow15();
	}
}

class MyWindow15 extends JFrame implements ListSelectionListener{
	MyList115 list1;
	MyList215 list2;
	
	public MyWindow15() {
		setSize(600, 400);
		Container con = getContentPane();
		list1 = new MyList115();
		list2 = new MyList215();
		con.setLayout(new GridLayout(2,2));
		con.add(list1);
		con.add(list2);
		con.add(new JLabel());
		con.add(new JLabel());
		setVisible(true);
	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

class MyList115 extends JPanel{
	JList<String> list;
	public MyList115(){
		String[] s = {"one","two","three"};
		list = new JList<String>(s);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane pane = new JScrollPane(list);
		add(pane);
	}
}

class MyList215 extends JPanel{
	JComboBox<String> box;
	public MyList215(){
		String[] s = {"Jan","Feb","Mar"};
		box = new JComboBox<String>(s);
		box.setEditable(true);
		add(box);
	}
}
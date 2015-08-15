package ui;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class UI13 extends Applet implements ItemListener{
	Prd product;
	Info info;
	Quan quan;
	Price price;
	int prdNum = -1;
	int quanNum = -1;
	double priTbl[][]={{1.20,1.15,1.10},{1.70,1.65,1.60},{1.65,1.60,1.58}};
	public void init(){
		setSize(600, 300);
		setLayout(new GridLayout(2, 2));
		product = new Prd();
		info = new Info();
		quan = new Quan();
		price = new Price();
		product.b1.addItemListener(this);
		product.b2.addItemListener(this);
		product.b3.addItemListener(this);
		quan.box1.addItemListener(this);
		quan.box2.addItemListener(this);
		quan.box3.addItemListener(this);
		add(product);
		add(info);
		add(quan);
		add(price);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getItemSelectable() == product.b1){
			prdNum = 0;
			info.card.show(info, "Computer");
			if(quanNum != -1){
				price.price.setText(String.valueOf(priTbl[prdNum][quanNum]));
			}
		}
		else if(e.getItemSelectable() == product.b2){
			prdNum = 1;
			info.card.show(info, "Cellphone");
			if(quanNum != -1){
				price.price.setText(String.valueOf(priTbl[prdNum][quanNum]));
			}
		}
		else if(e.getItemSelectable() == product.b3){
			prdNum = 2;
			info.card.show(info, "Camera");
			if(quanNum != -1){
				price.price.setText(String.valueOf(priTbl[prdNum][quanNum]));
			}
		}
		else{
			quanNum = Integer.parseInt(((JCheckBox)e.getItemSelectable()).getText()) - 1;
			if(prdNum == -1) return;
			price.price.setText(String.valueOf(priTbl[prdNum][quanNum]));
		}
	}

}

@SuppressWarnings("serial")
class Prd extends JPanel{
	ButtonGroup group;
	JRadioButton b1, b2, b3;
	public Prd(){
		b1 = new JRadioButton("Computer");
//		b1.setHorizontalAlignment(JRadioButton.CENTER);
		b2 = new JRadioButton("Cellphone");
//		b2.setHorizontalAlignment(JRadioButton.CENTER);
		b3 = new JRadioButton("Camera");
//		b3.setHorizontalAlignment(JRadioButton.CENTER);
		group = new ButtonGroup();
		group.add(b1);
		group.add(b2);
		group.add(b3);
		setLayout(new GridLayout(3, 2));
		add(new JLabel());
		add(b1, "Computer");
		add(new JLabel());
		add(b2, "Cellphone");
		add(new JLabel());
		add(b3, "Camera");
	}
}

@SuppressWarnings("serial")
class Info extends JPanel{
	JLabel l1, l2, l3;
	CardLayout card;
	public Info(){
		card = new CardLayout();
		setLayout(card);
		l1 = new JLabel("Comupter help you work efficiently.", JLabel.CENTER);
		l2 = new JLabel("You can call or text anyone at anytime.", JLabel.CENTER);
		l3 = new JLabel("Take a great picture for lifetime memory.", JLabel.CENTER);
		add(new JLabel(), "");
		add(l1, "Computer");
		add(l2, "Cellphone");
		add(l3, "Camera");
	}
}

class Quan extends JPanel{
	JCheckBox box1, box2, box3;
	ButtonGroup group;
	public Quan(){
		setLayout(new GridLayout(1, 6));
		box1 = new JCheckBox("1");
		box2 = new JCheckBox("2");
		box3 = new JCheckBox("3");
		group = new ButtonGroup();
		group.add(box1);
		group.add(box2);
		group.add(box3);
		add(new JLabel());
		add(box1);
		add(new JLabel());
		add(box2);
		add(new JLabel());
		add(box3);
	}
}

class Price extends JPanel{
	JLabel price;
	public Price(){
		setLayout(new BorderLayout());
		price = new JLabel("", JLabel.CENTER);
		add(price, "Center");
	}
}
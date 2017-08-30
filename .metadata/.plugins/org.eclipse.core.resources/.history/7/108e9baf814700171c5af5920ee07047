package book;

import java.awt.*;
import java.awt.event.*;

public class awtTest3 extends Frame implements ActionListener{

	awtTest3(String title) {
		super(title);
		
		setBounds(500, 300, 280, 150);
		setLayout(new FlowLayout());
		Label lab1 = new Label("username");
		add(lab1);
		TextField txt1 = new TextField(20);
		add(txt1);
		Label lab2 = new Label("password");
		add(lab2);
		TextField txt2 = new TextField(20);
		add(txt2);
		Button btn1 = new Button("ok");
		add(btn1);
		Button btn2 = new Button("cancel");
		add(btn2);
		btn2.addActionListener(this);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new awtTest3("系统");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

}

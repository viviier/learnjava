package book;

import java.awt.*;

public class awtTest2 extends Frame{

	awtTest2(String title) {
		super(title);
		setBounds(100, 100, 300, 100);
		// button
		Button btn = new Button("你好");
		// label
		Label lab = new Label("再见咯");
		// 单行文本TextField
		TextField tfd = new TextField();
		add(lab);
		add(btn);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		awtTest2 a = new awtTest2("nico");
		a.show();
	}

}

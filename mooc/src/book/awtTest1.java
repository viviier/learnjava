package book;

import java.awt.*;

public class awtTest1 extends Frame{

	// 在构造函数里面初始化
	awtTest1(String str) {
		// 使用Frame的构造方法
		super(str);
		// 设置大小
		setBounds(100, 100, 300, 200);
		// 显示 setVisible
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		awtTest1 a = new awtTest1("你好");
		a.show();
	}

}

package calculator;

import java.awt.*;
import java.awt.event.*;

class calculatorfront extends Frame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int m = 0, i, n = 0, a = 0, point = 0;
	float sum = 0, s1, s2, equ;
	String v = "";
	Panel delete_main = new Panel();// 大的panel
	Panel delete = new Panel();// 有关删除的那一行button构成一个panel
	Panel buttons = new Panel();// 数字和运算符构成的panel
	TextField text = new TextField("");
	Button backspace = new Button("Backspace");
	Button c = new Button("C");
	Button ce = new Button("CE");
	Button bt1 = new Button("1");
	Button bt2 = new Button("2");
	Button bt3 = new Button("3");
	Button bt4 = new Button("+");
	Button bt5 = new Button("4");
	Button bt6 = new Button("5");
	Button bt7 = new Button("6");
	Button bt8 = new Button("-");
	Button bt9 = new Button("7");
	Button bt10 = new Button("8");
	Button bt11 = new Button("9");
	Button bt12 = new Button("*");
	Button bt13 = new Button("0");
	Button bt14 = new Button(".");
	Button bt15 = new Button("=");
	Button bt16 = new Button("/");

	public calculatorfront() {
		super("孙易生的计算器");
		delete.setLayout(new GridLayout(1, 3, 15, 15));
		delete.add(backspace);
		delete.add(c);
		delete.add(ce);
		c.addActionListener(this);
		ce.addActionListener(this);
		backspace.addActionListener(this);
		delete_main.setLayout(new GridLayout(2, 1, 10, 10));
		delete_main.add(text, BorderLayout.NORTH);
		delete_main.add(delete, BorderLayout.SOUTH);
		buttons.setLayout(new GridLayout(4, 4, 10, 20));

		bt1.addActionListener(this);
		buttons.add(bt1);
		bt2.addActionListener(this);
		buttons.add(bt2);
		bt3.addActionListener(this);
		buttons.add(bt3);
		bt4.addActionListener(this);
		buttons.add(bt4);
		bt5.addActionListener(this);
		buttons.add(bt5);
		bt6.addActionListener(this);
		buttons.add(bt6);
		bt7.addActionListener(this);
		buttons.add(bt7);
		bt8.addActionListener(this);
		buttons.add(bt8);
		bt9.addActionListener(this);
		buttons.add(bt9);
		bt10.addActionListener(this);
		buttons.add(bt10);
		bt11.addActionListener(this);
		buttons.add(bt11);
		bt12.addActionListener(this);
		buttons.add(bt12);
		bt13.addActionListener(this);
		buttons.add(bt13);
		bt14.addActionListener(this);
		buttons.add(bt14);
		bt15.addActionListener(this);
		buttons.add(bt15);
		bt16.addActionListener(this);
		buttons.add(bt16);

		this.setLayout(new BorderLayout());
		this.add(delete_main, BorderLayout.NORTH);
		this.add(buttons, BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == backspace) {
			v = v.substring(0, v.length() - 1);
			text.setText(v);
		}
		if (e.getSource() == c || e.getSource() == ce) {
			m = 0;
			sum = 0;
			v = "";
			s1 = 0;
			s2 = 0;
			i = 0;
			point = 0;
			text.setText("0");
		}
		if (e.getSource() == bt1) {
			if (m == 1 || a == 1)
				v = "";
			v = v + "1";
			text.setText(v);
			m = 0;
			n = 1;
			a = 0;

		}
		if (e.getSource() == bt2) {
			if (m == 1 || a == 1)
				v = "";
			v = v + "2";
			text.setText(v);
			m = 0;
			n = 1;
			a = 0;
		}
		if (e.getSource() == bt3) {
			if (m == 1 || a == 1)
				v = "";
			v = v + "3";
			text.setText(v);
			m = 0;
			n = 1;
			a = 0;
		}
		if (e.getSource() == bt4) {
			if (n == 1) {
				if (i == 0)
					sum = Float.parseFloat(v);
			} else {
			}
			i = 1;
			m = 1;
			n = 0;
			a = 0;
			point = 0;
		}
		if (e.getSource() == bt5) {
			if (m == 1 || a == 1)
				v = "";
			v = v + "4";
			text.setText(v);
			m = 0;
			n = 1;
			a = 0;
		}
		if (e.getSource() == bt6) {
			if (m == 1 || a == 1)
				v = "";
			v = v + "5";
			text.setText(v);
			m = 0;
			n = 1;
			a = 0;
		}
		if (e.getSource() == bt7) {
			if (m == 1 || a == 1)
				v = "";
			v = v + "6";
			text.setText(v);
			m = 0;
			n = 1;
			a = 0;
		}
		if (e.getSource() == bt8) {
			if (n == 1) {
				if (i == 0)
					sum = Float.parseFloat(v);

			} else {
			}
			i = 2;
			m = 1;
			n = 0;
			a = 0;
			point = 0;
		}
		if (e.getSource() == bt9) {
			if (m == 1 || a == 1)
				v = "";
			v = v + "7";
			text.setText(v);
			m = 0;
			n = 1;
			a = 0;
		}
		if (e.getSource() == bt10) {
			if (m == 1 || a == 1)
				v = "";
			v = v + "8";
			text.setText(v);
			m = 0;
			n = 1;
			a = 0;
		}
		if (e.getSource() == bt11) {
			if (m == 1 || a == 1)
				v = "";
			v = v + "9";
			text.setText(v);
			m = 0;
			n = 1;
			a = 0;
		}
		if (e.getSource() == bt12) {
			if (n == 1) {
				if (i == 0)
					sum = Float.parseFloat(v);
			} else {
			}
			i = 3;
			m = 1;
			n = 0;
			a = 0;
			point = 0;
		}
		if (e.getSource() == bt13) {
			if (m == 1 || a == 1)
				v = "";
			v = v + "0";
			text.setText(v);
			m = 0;
			n = 1;
			a = 0;
		}
		if (e.getSource() == bt14) {
			if (m == 1 || a == 1)
				v = "";
			if (point == 0) {
				if ("".equals(v)) {
					v = "0.";
				} else {
					v = v + ".";
				}

			}
			text.setText(v);
			m = 0;
			n = 1;
			a = 0;
			point = 1;
		}
		if (e.getSource() == bt15) {
			if (m == 1) {
			} else {
				s1 = sum;
				s2 = Float.parseFloat(v);
				switch (i) {
				case 0:
					equ = Float.parseFloat(v);
					break;
				case 1:
					equ = s1 + s2;
					break;
				case 2:
					equ = s1 - s2;
					break;
				case 3:
					equ = s1 * s2;
					break;
				case 4:
					equ = s1 / s2;
					break;
				}

				sum = 0;
				v = "";
				v = String.valueOf(equ);
				text.setText(String.valueOf(equ));
				i = 0;
				a = 1;
			}
		}
		if (e.getSource() == bt16) {
			if (n == 1) {
				if (i == 0)
					sum = Float.parseFloat(v);
			} else {
			}
			i = 4;
			m = 1;
			n = 0;
			a = 0;
			point = 0;
		}

	}
}

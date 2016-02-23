package com.company.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Goodwin Chua on 2/23/2016.
 */
public class Menu {

	private JPanel panel1;
	private JButton button1;
	private JTextField textField1;
	private JLabel helloLabel;

	public Menu(Dimension dimension) {
		this.panel1.setSize(dimension);
	}

	public JPanel getPanel() {
		return panel1;
	}

	public JButton getButton1() {
		return button1;
	}

	public JTextField getTextField1() {
		return textField1;
	}

	public JLabel getHelloLabel() {
		return helloLabel;
	}

}

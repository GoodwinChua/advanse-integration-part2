package com.company.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Goodwin Chua on 2/23/2016.
 */
public class Shop {

	private JPanel jPanel;
	private JTextArea textArea1;

	private JButton button1;

	public Shop(Dimension dimension) {
		this.jPanel.setSize(dimension);
	}

	public JTextArea getTextArea1() {
		return textArea1;
	}

	public JPanel getPanel() {
		return jPanel;
	}

	public JButton getButton1() {
		return button1;
	}
}

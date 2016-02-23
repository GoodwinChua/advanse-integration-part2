package com.company.controller;

import com.company.Main;
import com.company.view.Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Goodwin Chua on 2/23/2016.
 */
public class MenuController extends Controller {

	private Menu menu;
	private MainController mainController;

	public MenuController(MainController mainController) {
		this.menu = new Menu(mainController.getMainControllerDimension());
		this.mainController = mainController;
		bindListeners();
	}

	private void bindListeners() {
		ActionListener actionListener = e -> {
			menu.getHelloLabel().setText(menu.getTextField1().getText());
			ShopController shopController = (ShopController) mainController.getController(MainController.SHOP);
			shopController.setTextArea(menu.getTextField1().getText());

			mainController.setContentPane(MainController.SHOP);
		};

		menu.getButton1().addActionListener(actionListener);
	}

	public void setLabel(String text) {
		menu.getTextField1().setText(text);
	}

	@Override
	public JPanel getPanel() {
		return this.menu.getPanel();
	}
}

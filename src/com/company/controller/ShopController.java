package com.company.controller;

import com.company.view.Shop;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by Goodwin Chua on 2/23/2016.
 */
public class ShopController extends Controller {

	private Shop shop;
	private MainController mainController;

	public ShopController(MainController mainController) {
		this.shop = new Shop(mainController.getMainControllerDimension());
		this.mainController = mainController;
		bindListeners();
	}

	private void bindListeners() {
		ActionListener actionListener = e -> {
			String someText = shop.getTextArea1().getText();
			MenuController menuController = (MenuController) mainController.getController(MainController.MENU);
			menuController.setLabel(someText);
			mainController.setContentPane(MainController.MENU);
		};

		shop.getButton1().addActionListener(actionListener);
	}

	public void setTextArea(String text) {
		this.shop.getTextArea1().setText(text);
	}

	@Override
	public JPanel getPanel() {
		return this.shop.getPanel();
	}

}

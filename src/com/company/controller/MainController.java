package com.company.controller;

import com.company.view.MainFrame;

import java.awt.*;

/**
 * Created by Goodwin Chua on 2/23/2016.
 */
public class MainController {

	private MainFrame mainFrame;
	private Controller[] controllers;

	static final int MENU = 0;
	static final int SHOP = 1;
	static final int NUM_CONTROLLERS = 2;

	public MainController() {
		this.mainFrame = new MainFrame();
		this.controllers = new Controller[NUM_CONTROLLERS];

		MenuController menuController = new MenuController(this);
		controllers[MENU] = menuController;

		ShopController shopController = new ShopController(this);
		controllers[SHOP] = shopController;

		// change to shop controller panel
		this.mainFrame.setContentPane(menuController.getPanel());

	}

	public Dimension getMainControllerDimension() {
		return this.mainFrame.getSize();
	}

	public void setContentPane(int paneNumber) {
		this.mainFrame.setContentPane(controllers[paneNumber].getPanel());
	}

	public Controller getController(int controllerIndex) {
		return this.controllers[controllerIndex];
	}

}

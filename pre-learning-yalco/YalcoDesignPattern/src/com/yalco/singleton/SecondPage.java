package com.yalco.singleton;

public class SecondPage {

	Settings set = Settings.getSettings();
	
	public void printSet() {
		System.out.println(set.toString());
	}
}

package com.yalco.singleton;

public class Settings {
	
	private Settings() {} // private 생성자
	private static Settings set = null; // 1개의 객체만 생성하기때문에 클래스 멤버변수로 정의
	
	public static Settings getSettings() {
		if(set == null) {
			set = new Settings();
		}
		return set;
	}

	private boolean darkMode = false;
	private int fotSize = 16;

	public boolean isDarkMode() {
		return darkMode;
	}
	public void setDarkMode(boolean darkMode) {
		this.darkMode = darkMode;
	}
	
	public int getFotSize() {
		return fotSize;
	}
	public void setFotSize(int fotSize) {
		this.fotSize = fotSize;
	}
	
	
	@Override
	public String toString() {
		return "Settings [darkMode=" + darkMode + ", fotSize=" + fotSize + "]";
	}
	

}

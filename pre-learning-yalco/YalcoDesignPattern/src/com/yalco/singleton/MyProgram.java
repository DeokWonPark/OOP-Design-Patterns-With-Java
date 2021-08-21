package com.yalco.singleton;

public class MyProgram {
	public static void main(String[] args) {
		
		FirstPage fpage = new FirstPage();
		SecondPage spage = new SecondPage();
		
		fpage.setAndPrint();
		spage.printSet();
	}

}

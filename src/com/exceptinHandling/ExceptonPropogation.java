package com.exceptinHandling;

public class ExceptonPropogation {
	void m() {
		int data = 50 / 0;
		System.out.println("" + data);
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
			
		} finally {
			System.out.println("finally catch is executed ");
		}
	}

	public static void main(String args[]) {
		ExceptonPropogation obj = new ExceptonPropogation();
		obj.p();
		System.out.println("normal flow...");
	}
}

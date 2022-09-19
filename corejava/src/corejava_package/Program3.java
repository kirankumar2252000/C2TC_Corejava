package corejava_package;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
package com.c2tc.org;

public class Sub extends SuperClass{
	int var = 50;
	void disp() {
		System.out.print(var);
		System.out.print(super.var);
	}

	public static void main(String[] args) {
		Sub sc = new Sub();
		sc.disp();
	}
	}

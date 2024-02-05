package com.prowings.anonymousInnerClass;

public class TestAnonymousClass {

	public static void main(String[] args) {
		MyInterface inter = new MyInterface() {

			@Override
			public void m1() {

				System.out.println("Inside m1() method !!");

			}
		};

		inter.m1();

		MyAbstractClass ab = new MyAbstractClass() {

			@Override
			public void m2() {

				System.out.println("Inside m2() method !!");

			}
		};

		ab.m2();
		ab.m3();
	}

}

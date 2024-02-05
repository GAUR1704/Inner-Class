package com.prowings.BasicInnerClass;

public class ClassInsideMethod {

	int x = 10;
	static int y = 20;
	
	/*Note :- if we declare a method as static method then immediately we will get compile time error.
	 * because we can not access the instance variable inside static method.
	 * Here we can access only static variable.
	 */

	public void m1() {
		class Inner {
			public void m2() {

				System.out.println(x);

				System.out.println(y);
			}
		}

		Inner i = new Inner();
		i.m2();
	}
	
	public static void main(String[] args) {
		
		ClassInsideMethod test = new ClassInsideMethod();
		
		test.m1();
	}

}

package com.prowings.BasicInnerClass;

public class Outer {

	int x = 10;
	int y =20;

	class Inner {
		int x = 100;

		public void m1() {
			
			int x = 1000;
			
			System.out.println(x);
			System.out.println(Outer.this.y);
			System.out.println(Inner.this.x);

		}
	}
	
	public static void main(String[] args) {
		
		new Outer().new Inner().m1();
	}

}

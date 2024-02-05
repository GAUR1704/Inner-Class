package com.prowings.BasicInnerClass;

class A {
	int x = 100;
	
	class B{
		
		int x = 1000;
		
		class C{
			
			int x= 10;
			
			public void m1() {
				
				System.out.println("Implement class method " + x);
				System.out.println("Inside outer class "+A.this.x);
				System.out.println("Inside middle class " + B.this.x);
			}
		}
	}

}

public class Test{
	
	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		A.B.C c = b.new C();
		
		c.m1();
		
		//new A().new B().new C().m1();
		
	}
}

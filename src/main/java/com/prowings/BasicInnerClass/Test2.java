package com.prowings.BasicInnerClass;

public class Test2 {
	
	public void m1() {
		
		class Inner{
			
			public void sum(int a, int b) {
				
				System.out.println("The sum is : "+(a+b));
				
			}
		}
		
		Inner i = new Inner();
		
		i.sum(10, 20);
		
		i.sum(5, 20);
		
		i.sum(15,20);
	}
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		
		t.m1();
		
	}

}

package com.prowings.LocalInnerClass;

public class Outer {
	
	private int a = 10;
	
	public void display() {
		System.out.println("Display method started. ");
		
		final int b = 20;
		
		class Inner{
			
			public void massage() {
				
				System.out.println("Inside Massage() method of inner class !! ");
				
				System.out.println(b);
				
				System.out.println(a);
			}
		}
			
		Inner in = new Inner();
		
		in.massage();
		System.out.println("Display method ended !!");
		
	
	}
	public static void main (String[] args) {
		Outer o = new Outer();
		o.display();
	}


}

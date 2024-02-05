package com.prowings.MemberInnerClass;

public class TestMemberOuter {
	
	private int a = 10;
	
	class Inner{
		
		void massage() {
			
			System.out.println("The data from outer class "+ a);
		}
	}
	
	public void display () {
		
		System.out.println("Inside display() method of outer class");
		
		Inner in = new Inner();
		in.massage();
		
	}

}

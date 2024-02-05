package com.prowings.MemberInnerClass;

public class TestMemberInnerClass {
	
	public static void main(String[] args) {
		
//		TestMemberOuter out = new TestMemberOuter();
//		
//		TestMemberOuter.Inner in = out.new Inner();
		
		TestMemberOuter.Inner in = new TestMemberOuter().new Inner();
		
		in.massage();
	}

}

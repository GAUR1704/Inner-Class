package com.prowings.anonymousInnerClass;

class PopCorn {

	public void taste() {

		System.out.println("Salty");
	}

}

public class Taste {

	public static void main(String[] args) {

		PopCorn p1 = new PopCorn() {

			public void taste() {
				System.out.println("Spicy");
			}
		};
		p1.taste();
		

		PopCorn p2 = new PopCorn() ;
		p1.taste();

		PopCorn p3 = new PopCorn() {

			public void taste() {
				System.out.println("Sweet");
			}
		};
		
		p3.taste();
		
		System.out.println(p1.getClass().getName());
		System.out.println(p2.getClass().getName());
		System.out.println(p3.getClass().getName());
	}
}

/* Note :-
 * Generated dot class file are :
 * 
 * 1) Popcorn.class -for Popcorn.
 * 2) Test.class -for Test class
 * 3) Taste$1.class 
 * 4) Taste$1.class
 * 
 */

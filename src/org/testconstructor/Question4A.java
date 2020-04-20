package org.testconstructor;

public class Question4A extends Question4B {
	public Question4A() {
	    super(12);
	    System.out.println("Default const...");
	  }

	  public static void main(String[] args) {
		  Question4A a = new Question4A();
	  }
}

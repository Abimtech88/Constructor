package org.testconstructor;

public class Question1A {
	public Question1A() {
	    this("JAVA");
	    System.out.println("Default const...");
	  }

	  public Question1A(int id) {
	    this(3456.5678f);
	    System.out.println(id);
	  }

	  public Question1A(String name) {
	    this(12);
	    System.out.println(name);
	  }

	  public Question1A(float sal) {
	    System.out.println(sal);
	  }

	  public static void main(String[] args) {
		  Question1A a = new Question1A();
	  }

}

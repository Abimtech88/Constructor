package org.testconstructor;

public class Question5A extends Question5B {


public Question5A() {
    super(12);
    System.out.println("Default const...");
  }

  public static void main(String[] args) {
    Question5A a = new Question5A();
  }
}
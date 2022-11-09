package ru.skillbox;

public class ArithmeticCalculator {

  public static int a = 0;
  public static int b = 0;

  public ArithmeticCalculator(int a, int b) {
    this.a = a;
    this.b = b;
  }


  public void calculate (Operation operation) {
    if ( operation == Operation.ADD) {
      System.out.println(a + b);
    }
      if (operation == Operation.SUBTRACT) {
        System.out.println(a - b);
      }
    if (operation == Operation.MULTIPLY) {
      System.out.println(a * b);
    }
    }


  }

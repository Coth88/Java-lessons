package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        ArithmeticCalculator add = new ArithmeticCalculator(45,12);
        add.calculate(Operation.ADD);
        System.out.println();
        add.calculate(Operation.SUBTRACT);
        System.out.println();
        add.calculate(Operation.MULTIPLY);


    }
}

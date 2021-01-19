package org.example;

public class Calc {

    public int add(int first, int second) {
        return first + second;
    }

    public int subtract(int first, int second) {
        return first - second;
    }

    public int multiply(int first, int second) {
        return first * second;
    }

    public int divide(int first, int second) {
        if (second == 0)
            throw new ArithmeticException();
        return first / second;
    }

    public int mod(int first, int second) {
        return first % second;
    }
}

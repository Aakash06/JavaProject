package MethodReference;

class Calculator {

    static int add(int a, int b){
        return a+b;
    }

    static int subtract(int a, int b){
        return a-b;
    }

    static int product(int a, int b){
        return a*b;
    }

    static boolean isOdd(int n) {
        return n % 2 == 1; }

    static boolean isEven(int n) {
        return n % 2 == 0; }

    static boolean isPositive(int n) {
        return n >= 0; }
}

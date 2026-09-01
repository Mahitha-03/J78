
package com.java;

class Main {

    static void test1() {
        System.out.println("Static");
    }

    void test2() {
        System.out.println("Instance");
        test1();
    }

    public static void main(String[] args) {

        Main m = new Main();
        m.test2();
    }
}
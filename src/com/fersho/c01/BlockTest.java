package com.fersho.c01;

public class BlockTest {
    public static void main(String[] args) {
        int x, y = 20;
        for (x = 0; x < 10; x++) {
            System.out.println("This is x: " + x);
            System.out.println("This is y: " + y);
            y -= 2;
        }
    }
}

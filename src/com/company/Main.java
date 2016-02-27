package com.company;

import java.util.Random;

public class Main {

    private static int a;
    private static int b;
    private static int c;
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static int h;
    private static int i;

    private static Random generator = new Random();
    

    public static void main(String[] args) {

        g = rgen();
        h = rgen();

        assign_values(g, h);

        print_solution();
    }

    private static int rgen() {
        int x = generator.nextInt(100);
        boolean y = generator.nextBoolean();
        if(y) {
            x = -x;
        }

        return x;
    }

    private static void assign_values(int g, int h) {
        a = g + h - 16;
        b = 16 - h;
        c = 16 - g;
        d = -2*g - h + 32;
        e = 8;
        f = 2*g + h - 16;
        i = 16 - g;
    }

    private static void print_solution() {
        System.out.println(a + " " + b + " " + c);
        System.out.println(d + " " + e + " " + f);
        System.out.println(g + " " + h + " " + i);
    }
}

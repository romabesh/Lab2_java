package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.Console;

public class Main {

    public static void main(String[] args) {
        for(;;) {
            Scanner in = new Scanner(System.in);
            Triangle triangle;
            System.out.println("Введите стороны ав сд да");

            double side = -1;

            while (Triangle.CheskCorrectLenght(" " + (side = in.nextDouble())) < 0) ;
            {
                System.out.println(side);
            }
            triangle = new Triangle();
        }
    }
}

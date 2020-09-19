package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Double> triangles = new ArrayList<Double>();
    public static ArrayList<Double> perimetr = new ArrayList<Double>();
    public static double[] angle = new double[3];
    public static double[] side = new double[3];
    public static ArrayList<Double> square = new ArrayList<Double>();

    public static void main(String[] args) {
        for (; ; ) {
            Scanner in = new Scanner(System.in);
            Triangle triangle = new Triangle();

            System.out.println("Введите стороны AB BC CD");

            triangle.setLenght_ab(in.nextDouble());
            triangle.setLenght_bc(in.nextDouble());
            triangle.setLenght_ca(in.nextDouble());
            if (Triangle.CheskCorrectLenght(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca()) == true) {
                if (Triangle.CheckingExistenceTriangle(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca()) == true){
                    //сторона
                    ArrayTriangle.Initialization();
                }
                else {
                    System.out.println("Это не треугольник");
                }
            }
            else {
                System.out.println("Неправильно введены числа");
            }
        }
    }
}






/*            System.out.println("Введите стороны AB BC CD");

            triangle.setLenght_ab(in.nextDouble());
            triangle.setLenght_bc(in.nextDouble());
            triangle.setLenght_ca(in.nextDouble());
            if (Triangle.CheckingExistenceTriangle(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca()) == true){
                if (Triangle.CheskCorrectLenght(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca()) == true) {
                    System.out.println(triangle.getLenght_ab());
                    System.out.println(triangle.getLenght_bc());
                    System.out.println(triangle.getLenght_ca());
                } else {
                    System.out.println("Ошибка!");
                }
                    System.out.println("Периметр " +
                    triangle.Perimetr(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca()));
                    System.out.println("Площадь " +
                    triangle.AreaTriangle(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca()));
                    System.out.println("Углы : " +
                    triangle.CalculateAngle_A(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca()));
                    System.out.println("Углы : " +
                    triangle.CalculateAngle_B(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca()));
                    System.out.println("Углы : " +
                    triangle.CalculateAngle_C(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca()));
            }
            else{
                System.out.println("Это не треугольник");
            }

        }*/
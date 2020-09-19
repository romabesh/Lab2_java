package com.company;

import java.util.ArrayList;

public class ArrayTriangle {

    public static ArrayList<Double> triangles = new ArrayList<Double>();
    public static ArrayList<Double> perimetr = new ArrayList<Double>();
    public static ArrayList<Double> angle = new ArrayList<Double>();
    public static ArrayList<Double> side = new ArrayList<Double>();
    public static double[] angleABC = new double[3];
    public static double[] sideABC = new double[3];
    public static ArrayList<Double> square = new ArrayList<Double>();

    public static void Initialization(){
        Triangle triangle = new Triangle();

        sideABC[0] = triangle.getLenght_ab();
        sideABC[1] = triangle.getLenght_bc();
        sideABC[2] = triangle.getLenght_ca();
        //периметр
        perimetr.add(triangle.Perimetr(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca()));
        square.add(triangle.AreaTriangle(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca()));

        angleABC[0] = triangle.CalculateAngle_A(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca());
        angleABC[1] = triangle.CalculateAngle_B(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca());
        angleABC[2] = triangle.CalculateAngle_C(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca());

        for (int i = 0; i < 3;i++){
            angle.add(angleABC[i]);
            side.add(sideABC[i]);
        }
    }
}

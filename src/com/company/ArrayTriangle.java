package com.company;

import java.util.ArrayList;

public class ArrayTriangle {

    public static ArrayList<Double> triangles = new ArrayList<Double>();
    public static ArrayList<Double> perimetr = new ArrayList<Double>();
    public static ArrayList<Double> angle = new ArrayList<Double>();
    public static ArrayList<Double> side = new ArrayList<Double>();
    public static ArrayList<Double> square = new ArrayList<Double>();

    public static void Initialization(Triangle triangle){

        //side
        side.add(triangle.getLenght_ab());
        side.add(triangle.getLenght_bc());
        side.add(triangle.getLenght_ca());
        //периметр
        perimetr.add(triangle.Perimetr(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca()));
        //площадь
        square.add(triangle.AreaTriangle(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca()));
        //angle
        angle.add(triangle.CalculateAngle_A(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca()));
        angle.add(triangle.CalculateAngle_B(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca()));
        angle.add(triangle.CalculateAngle_C(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca()));

    }
}

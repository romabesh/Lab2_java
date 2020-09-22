package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Triangle triangle = new Triangle();
    public static ArrayTriangle arrayTriangle = new ArrayTriangle();
    public static void main(String[] args) {
        for (; ; ) {
            Scanner in = new Scanner(System.in);
            Menu.ToString();
            int Menu = in.nextInt();
            switch (Menu){
                case 1://ввод
                    System.out.println("Введите стороны AB BC CD");
                    double numberforside_ab;
                    double numberforside_bc;
                    double numberforside_ca;
                    while (true) {
                        try {
                            numberforside_ab = Double.parseDouble(in.next());
                            if(numberforside_ab > 0){
                                break;
                            }
                            else {
                                System.out.println("Пожалуйста повторите попытку!");
                            }
                        }
                        catch (NumberFormatException e) {
                            System.out.println("Пожалуйста повторите попытку!");
                        }
                    }
                    triangle.setLenght_ab(numberforside_ab);
                    while (true) {
                        try {
                            numberforside_bc = Double.parseDouble(in.next());
                            if(numberforside_bc > 0){
                                break;
                            }else {
                                System.out.println("Пожалуйста повторите попытку!");
                            }
                        }
                        catch (NumberFormatException e) {
                            System.out.println("Пожалуйста повторите попытку!");
                        }
                    }
                    triangle.setLenght_bc(numberforside_bc);
                    while (true) {
                        try {
                            numberforside_ca = Double.parseDouble(in.next());
                            if(numberforside_ca > 0){
                                break;
                            }else {
                                System.out.println("Пожалуйста повторите попытку!");
                            }
                        }
                        catch (NumberFormatException e) {
                            System.out.println("Пожалуйста повторите попытку!");
                        }
                    }
                    triangle.setLenght_ca(numberforside_ca);

                    if (Triangle.CheckingExistenceTriangle(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca()) == true) {
                        //сторона
                        arrayTriangle.Initialization(triangle );
                    }
                    else {
                        System.out.println("Это не треугольник");
                    }
                    break;
                case 2://вывод
                    int numberforside = 0;
                    int numberforangle = 0;
                    for(int i = 0;i < ArrayTriangle.perimetr.size();i++) {
                    int o = 3;
                    int u = 0;
                        for (numberforside = numberforside; numberforside < u; numberforside++) {
                            System.out.println("Сторона " + ArrayTriangle.side.get(numberforside));
                            o++;
                        }
                        for (numberforangle = numberforangle; numberforangle < o; numberforangle++) {
                            System.out.println("Угол " + ArrayTriangle.angle.get(numberforangle));
                            u++;
                        }

                        System.out.println("Площадь " + ArrayTriangle.square.get(i));
                        System.out.println("Периметр " + ArrayTriangle.perimetr.get(i) + "\n");
                    }

                    break;
                case 3://удаление
                    System.out.println("Выберете нужный столбец для удаления :");
                    int remove = in.nextInt() - 1;
                    int numberforremoveside;
                    int numberforremoveangle;
                    for (numberforremoveside = 0; numberforremoveside < 3; numberforremoveside++) {
                        System.out.println("Сторона " + ArrayTriangle.side.remove(numberforremoveside));
                    }
                    for (numberforremoveangle = 0; numberforremoveangle < 3; numberforremoveangle++) {
                        System.out.println("Угол " + ArrayTriangle.angle.remove(numberforremoveangle));
                    }

                    System.out.println("Площадь " + ArrayTriangle.square.remove(remove));
                    System.out.println("Периметр " + ArrayTriangle.perimetr.remove(remove) + "\n");

                    break;
                case 4://выход
                    break;
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
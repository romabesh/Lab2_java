package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Triangle triangle = new Triangle();
    public static ArrayTriangle arrayTriangle = new ArrayTriangle();
    public static EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
    public static boolean bool = true;
    public static void main(String[] args) {
        for (; ; ) {
            if(bool == true) {
                Scanner in = new Scanner(System.in);
                Menu.ToString();
                int Menu = in.nextInt();
                switch (Menu) {
                    case 1://ввод
                        System.out.println("Введите стороны AB BC CD");
                        double numberforside_ab;
                        double numberforside_bc;
                        double numberforside_ca;
                        while (true) {
                            try {
                                numberforside_ab = Double.parseDouble(in.next());
                                if (numberforside_ab > 0) {
                                    break;
                                } else {
                                    System.out.println("Пожалуйста повторите попытку!");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Пожалуйста повторите попытку!");
                            }
                        }
                        triangle.setLenght_ab(numberforside_ab);
                        while (true) {
                            try {
                                numberforside_bc = Double.parseDouble(in.next());
                                if (numberforside_bc > 0) {
                                    break;
                                } else {
                                    System.out.println("Пожалуйста повторите попытку!");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Пожалуйста повторите попытку!");
                            }
                        }
                        triangle.setLenght_bc(numberforside_bc);
                        while (true) {
                            try {
                                numberforside_ca = Double.parseDouble(in.next());
                                if (numberforside_ca > 0) {
                                    break;
                                } else {
                                    System.out.println("Пожалуйста повторите попытку!");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Пожалуйста повторите попытку!");
                            }
                        }
                        triangle.setLenght_ca(numberforside_ca);

                        if (Triangle.CheckingExistenceTriangle(triangle.getLenght_ab(), triangle.getLenght_bc(), triangle.getLenght_ca()) == true) {
                            arrayTriangle.Initialization(triangle);
                        } else {
                            System.out.println("Это не треугольник");
                        }
                        break;
                    case 2://вывод
                        int sizemasiv = ArrayTriangle.perimetr.size();
                        for (int i = 0; i < sizemasiv; i++) {
                            System.out.println("Треугольник " + (1 + i));
                            System.out.println("Сторона AB " + ArrayTriangle.sideAB.get(i));
                            System.out.println("Сторона BC " + ArrayTriangle.sideBC.get(i));
                            System.out.println("Сторона CB " + ArrayTriangle.sideCD.get(i));
                            System.out.println("Угол A " + ArrayTriangle.angleA.get(i));
                            System.out.println("Угол B " + ArrayTriangle.angleB.get(i));
                            System.out.println("Угол C " + ArrayTriangle.angleC.get(i));
                            System.out.println("Площадь " + ArrayTriangle.square.get(i));
                            System.out.println("Периметр " + ArrayTriangle.perimetr.get(i) + "\n");
                        }
                        break;
                    case 3://удаление
                        System.out.println("Выберете нужный столбец для удаления :");

                        int remove = in.nextInt() - 1;
                        ArrayTriangle.sideAB.remove(remove);
                        ArrayTriangle.sideBC.remove(remove);
                        ArrayTriangle.sideCD.remove(remove);
                        ArrayTriangle.angleA.remove(remove);
                        ArrayTriangle.angleB.remove(remove);
                        ArrayTriangle.angleC.remove(remove);
                        ArrayTriangle.square.remove(remove);
                        ArrayTriangle.perimetr.remove(remove);
                        break;
                    case 4:
                        equilateralTriangle.Equilateral(arrayTriangle);
                        break;
                    case 5://выход
                        bool = false;
                        break;
                }
            }
            else
                break;
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
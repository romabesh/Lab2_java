package com.company;

import lombok.ToString;

public class Triangle {
    static public double Lenght_AB;
    static public double Lenght_BC;
    static public double Lenght_CA;

    public static double CheskCorrectLenght(String value){
        double lenght_ab = -1;
        double lenght_bc = -1;
        double lenght_ca = -1;
        try {
            lenght_ab = Double.parseDouble(value) > 0 ? Double.parseDouble(value) : -1;
            lenght_bc = Double.parseDouble(value) > 0 ? Double.parseDouble(value) : -1;
            lenght_ca = Double.parseDouble(value) > 0 ? Double.parseDouble(value) : -1;
        }
        catch (Exception e){
            System.out.println("Вы сделали ошибку,повторите попытку.");
        }
        return lenght_ab;
    }

    public double getLenght_AB() {
        return Lenght_AB;
    }
    public double getLenght_BC() {
        return Lenght_BC;
    }
    public double getLenght_CA() {
        return Lenght_CA;
    }

    public void setLenght_AB(double Lenght_AB) {
        this.Lenght_AB = Lenght_AB;
    }
    public void setLenght_BC(double Lenght_BC) {
        this.Lenght_BC = Lenght_BC;
    }
    public void setLenght_CA(double Lenght_CA) {
        this.Lenght_CA= Lenght_CA;
    }

//    ToString(){
//
//    }
}

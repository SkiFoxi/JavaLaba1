import java.util.Scanner;

package com.example;
public class Trigonometryexample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите X: ");
        double x = in.nextDouble();

            double val1 = Math.acos(Math.pow(x,3)/ (Math.pow(x,3)+1)); //первая часть примера
            double val2 = Math.pow(Math.sqrt(Math.abs(x)+1), 1/7); //Модуль
            double val3 = Math.log10(Math.pow(5, Math.tan(x))+Math.pow(Math.abs(x), Math.sin(x))) / Math.log10(5); //Кубический корень log5x = log10(x)/log10(5)
            double val4 = Math.pow(val3, 2); 
            double y = val1 + val2 + val4; //Квадратный корень

        System.out.println("Вы ввели точку: ("+x+";"+y+")");

        if ((x>=0) & (y>=0) & (Math.pow(x, 2) + Math.pow(y, 2) <= 25))  {
            System.out.println("False");
        } 
        else {
            System.out.println("True");
        }

    }
}
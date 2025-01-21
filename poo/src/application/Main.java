package application;

import java.util.Scanner;
import entities.Triangulo;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // new instancia a classe
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.println("Digite os valores do triangulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite os valores do triangulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area do triangulo X: %.4f%n", areaX);
        System.out.printf("Area do triangulo Y: %.4f%n", areaY);
        sc.close();
    }
}
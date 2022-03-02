package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // метод для записи числа с клавиатуры
        Scanner in = new Scanner(System.in);
        // создание точек с 3 координатами
        System.out.print("Введите координаты первой точки: ");
        Point3d firstPoint = new Point3d(in.nextDouble(),in.nextDouble(),in.nextDouble());
        System.out.print("Введите координаты второй точки: ");
        Point3d secondPoint = new Point3d(in.nextDouble(),in.nextDouble(),in.nextDouble());
        System.out.print("Введите координаты третьей точки: ");
        Point3d thirdPoint = new Point3d(in.nextDouble(),in.nextDouble(),in.nextDouble());
        // проверка на совпадение точек
        if ((firstPoint.equals3d(secondPoint)) || (firstPoint.equals3d(secondPoint)) || (firstPoint.equals3d(secondPoint))) {
            System.out.println("Одна из точек равна другой, треугольник не построится");
        }
        else
        System.out.println(computeArea(firstPoint, secondPoint, thirdPoint));
    }
    public static double computeArea(Point3d firstObj, Point3d secondObj, Point3d thirdObj) {
         double a = firstObj.distanceTo(secondObj); // нахождение 1 стороны треугольника
         double b = secondObj.distanceTo(thirdObj); // нахождение 2 стороны треугольника
         double c = firstObj.distanceTo(thirdObj); // нахождение 3 стороны треугольника
         double p = (a + b + c) / 2;
         double s = Math.sqrt(p * (p - a) * (p - b) * (p - c)); // нахождение площади по формуле Герона
        // возвращение значения площади
         return s;
    }
}

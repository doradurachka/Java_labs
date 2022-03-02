package com.company;
// трёхмерный класс точки

public class Point3d extends Point2d  {
    // координата Z
    private double zCoord;
    // Конструктор инициализации
    public Point3d (double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }
    // Конструктор по умолчанию.
    public Point3d () {
        //Вызовите конструктор с тремя параметрами и определите источник.
        this(0, 0,0);
    }
    // Возвращение координаты Z
    public double getZ () {
        return zCoord;
    }
    // Установка значения координаты Z.
    public void setZ (double val) {
        zCoord = val;
    }
    // Сравнение двух трёххмерных объектов
    public boolean equals3d (Point3d secondObj) {
        boolean equals3d = false;
        if ((this.getX() == secondObj.getX()) && (this.getY() == secondObj.getY()) && (this.getZ() == secondObj.getZ()))
            equals3d = true;
        return equals3d;
    }
    public double distanceTo (Point3d secondObj) {
        double distance = Math.sqrt(Math.pow(secondObj.getX() - this.getX(), 2) + Math.pow(secondObj.getY() - this.getY(), 2) + Math.pow(secondObj.getZ() - this.getZ(), 2));
        return distance;
    }
}

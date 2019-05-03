package oop.figures;

public class Circle extends AFigure {

    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}

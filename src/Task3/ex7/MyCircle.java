package Task3.ex7;

import Task3.ex5.MyPoint;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyCircle() {
        this.center = new MyPoint();
        this.radius = 1;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Ex7.MyCircle[radius=" + radius + ",center=" + center + "]";
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle another) {
        return center.distance(another.getCenter());
    }


    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(3, 4, 5);
        System.out.println(circle1);

        MyPoint center = new MyPoint(1, 2);
        MyCircle circle2 = new MyCircle(center, 8);
        System.out.println(circle2);

        MyCircle circle3 = new MyCircle(); // default constructor
        System.out.println(circle3);

        System.out.println("Center of circle2: " + circle2.getCenter());
        System.out.println("Radius of circle2: " + circle2.getRadius());

        circle2.setCenter(new MyPoint(5, 6));
        circle2.setRadius(10);
        System.out.println("Updated circle2: " + circle2);

        System.out.println("Area of circle1: " + circle1.getArea());
        System.out.println("Circumference of circle1: " + circle1.getCircumference());

        System.out.println("Distance between circle1 and circle2: " + circle1.distance(circle2));
    }
}

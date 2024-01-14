package Module2Tasks.Task3.ex8;


import Module2Tasks.Task3.ex4.MyPoint;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    @Override
    public String toString() {
        return "Ex8.MyTriangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]";
    }
    private double distance(MyPoint p1, MyPoint p2) {
        return p1.distance(p2);
    }
    public double getPerimeter() {
        return distance(v1, v2) + distance(v2, v3) + distance(v3, v1);
    }
    public void printType() {
        double side1 = distance(v1, v2);
        double side2 = distance(v2, v3);
        double side3 = distance(v3, v1);
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral");
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle(0, 0, 0, 3, 4, 0);
        System.out.println(triangle1);

        MyPoint v1 = new MyPoint(0, 0);
        MyPoint v2 = new MyPoint(0, 3);
        MyPoint v3 = new MyPoint(4, 0);
        MyTriangle triangle2 = new MyTriangle(v1, v2, v3);
        System.out.println(triangle2);

        System.out.println("Perimeter of triangle1: " + triangle1.getPerimeter());
        System.out.println("Perimeter of triangle2: " + triangle2.getPerimeter());

        System.out.print("Type of triangle1: ");
        triangle1.printType();

        System.out.print("Type of triangle2: ");
        triangle2.printType();
    }
}




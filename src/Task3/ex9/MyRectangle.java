package Task3.ex9;


import Task3.ex5.MyPoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, x2);
        this.bottomRight = new MyPoint(y1, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public double getArea() {
        int width = bottomRight.getX() - topLeft.getX();
        int height = topLeft.getY() - bottomRight.getY();
        return Math.abs(width * height);
    }

    @Override
    public String toString() {
        return "Ex9.MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }

    public static void main(String[] args) {
        MyRectangle rectangle1 = new MyRectangle(1, 5, 6, 2);
        System.out.println(rectangle1);
        System.out.println("Area: " + rectangle1.getArea());

        MyPoint topLeft = new MyPoint(3, 8);
        MyPoint bottomRight = new MyPoint(7, 4);
        MyRectangle rectangle2 = new MyRectangle(topLeft, bottomRight);
        System.out.println(rectangle2);
        System.out.println("Area: " + rectangle2.getArea());

        rectangle2.getTopLeft().setX(5);
        rectangle2.getTopLeft().setY(6);
        System.out.println(rectangle2);
        System.out.println("Updated Area: " + rectangle2.getArea());




    }
}
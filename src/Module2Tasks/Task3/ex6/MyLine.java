package Module2Tasks.Task3.ex6;

import Module2Tasks.Task3.ex5.MyPoint;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public double getLength() {
        return begin.distance(end);
    }
    public double getGradient() {
        if (end.getX() - begin.getX() == 0) {
            return Double.POSITIVE_INFINITY;
        }
        return (double) (end.getY() - begin.getY()) / (end.getX() - begin.getX());
    }
    public String toString() {
        return "Ex6.MyLine{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
    public static void main(String[] args) {
        MyLine line1 = new MyLine(1, 2, 4, 5);
        System.out.println(line1);

        MyPoint begin = new MyPoint(2, 3);
        MyPoint end = new MyPoint(5, 8);
        MyLine line2 = new MyLine(begin, end);
        System.out.println(line2);

        System.out.println("Begin point: " + line2.getBegin());
        System.out.println("End point: " + line2.getEnd());

        line2.setBegin(new MyPoint(0, 0));
        line2.setEnd(new MyPoint(3, 4));
        System.out.println("Updated line: " + line2);

        System.out.println("Length of line2: " + line2.getLength());

        System.out.println("Gradient of line2: " + line2.getGradient());
    }
}






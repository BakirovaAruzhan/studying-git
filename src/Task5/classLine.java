package Task5;

public class classLine {
    private classPoint begin;
    private classPoint end;

    public classLine(classPoint begin, classPoint end) {
        this.begin = begin;
        this.end = end;

    }

    public classLine(int beginX, int beginY, int endX, int endY) {
        begin = new classPoint(beginX, beginY);
        end = new classPoint(endX, endY);
    }

    @Override
    public String toString() {
        return "classLine{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }

    public classPoint getBegin() {
        return begin;
    }

    public classPoint getEnd() {
        return end;
    }

    public void setBegin(classPoint begin) {
        this.begin = begin;
    }

    public void setEnd(classPoint end) {
        this.end = end;
    }
    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public double getLength() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }
}




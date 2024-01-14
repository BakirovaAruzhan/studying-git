package Module2Tasks.Task4.ex3;

public class Point2D {

    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public void setYX(float y) {

        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] result = new float[2];
        result[0] = x;
        result[1] = y;
        return result;

    }
}

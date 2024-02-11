package Module2Tasks.Task6.ex5;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(5);
        System.out.println("Original circle: " + resizableCircle);

        resizableCircle.resize(50);
        System.out.println("After resizing: " + resizableCircle);
    }
}
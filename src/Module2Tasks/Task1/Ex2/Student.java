package Module2Tasks.Task1.Ex2;

public class Student {
    public String name;
    private int Mark_math;
    private int Mark_english;
    private int Mark_programming;

    public Student(String name, int markMath, int markEnglish, int markProgramming) {
        this.name = name;
        this.Mark_math = markMath;
        this.Mark_english = markEnglish;
        this.Mark_programming = markProgramming;
    }

    public String getName() {
        return name;
    }

    public double getAverageMark() {
        return (Mark_math + Mark_english + Mark_programming) / 3.0;
    }
}






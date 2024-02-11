package Module2Tasks.Task1.Ex3;
import java.util.Scanner;

public class Student {
    private String name;
    private double averageGrade;
    private double scholarship;

    public Student(String name, double averageGrade, double scholarship) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.scholarship = scholarship;
    }
    public String getName() {
        return name;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    public void updateScholarship() {
        if (averageGrade > 4.5) {
            scholarship *= 1.3;
        } else if (averageGrade < 2) {
        } else {
            scholarship *= 1.1;
        }
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", scholarship=" + scholarship +
                '}';
    }

    public static void main(String[] args) {
        Student student2 = new Student ("Eliza", 4.5, 150_000);
        System.out.println(student2);
        student2.updateScholarship();
        System.out.println(student2);
    }

    public static class Main2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numberOfStudents = scanner.nextInt();
            scanner.nextLine();
            Module2Tasks.Task1.Ex2.Student[] students = new Module2Tasks.Task1.Ex2.Student[numberOfStudents];

            for (int i = 0; i < numberOfStudents; i++) {
                String name = scanner.nextLine();
                int Mark_math = scanner.nextInt();
                int Mark_english = scanner.nextInt();
                int Mark_programming = scanner.nextInt();
                scanner.nextLine();

                students[i] = new Module2Tasks.Task1.Ex2.Student(name, Mark_math, Mark_english, Mark_programming);


            }
            for (Module2Tasks.Task1.Ex2.Student student : students) {
                if (student.getAverageMark() >= 4) ;
                System.out.printf("%s %.2f\n", student.getName(), student.getAverageMark());

            }
        }
    }
}



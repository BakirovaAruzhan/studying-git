import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();
        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            String name = scanner.nextLine();
            int Mark_math = scanner.nextInt();
            int Mark_english = scanner.nextInt();
            int Mark_programming = scanner.nextInt();
            scanner.nextLine();

            students[i] = new Student(name, Mark_math, Mark_english, Mark_programming);


        }
        for (Student student : students) {
            if (student.getAverageMark() >= 4) ;
            System.out.printf("%s %.2f\n", student.getName(), student.getAverageMark());

        }
    }
}


package Module3.Collections2.task1_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();
        students.add(new Student("Batr","155B", 1, List.of(4, 5, 3)));
        students.add(new Student("Akm","155B", 1,  List.of(4, 4, 4)));
        students.add(new Student("Nadira","155B", 1, List.of(2, 3, 2)));

        removeUnderperformingStudents(students);

        printStudents(students, 2);
    }

    public static void removeUnderperformingStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double averageGrade = student.calculateAverageGrade();
            if (averageGrade < 3.0) {
                iterator.remove();
            } else {
                student.promoteToNextCourse();
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students in course " + course + ":");
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }


}





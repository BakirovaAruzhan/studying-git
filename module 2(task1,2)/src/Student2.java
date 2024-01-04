public class Student2 {
    private String name;
    private double averageGrade;
    private double scholarship;

    public Student2(String name, double averageGrade, double scholarship) {
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
        Student2 student2 = new Student2("Eliza", 4.5, 150_000);
        System.out.println(student2);
        student2.updateScholarship();
        System.out.println(student2);
    }
}

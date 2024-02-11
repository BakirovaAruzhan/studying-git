package Module2Tasks.Task1.Ex5;
public class Candidate {
    private String name = "F. Mckinley";
    private String work = "businessman";
    private int income;
    public Candidate(String name, String work, int income) {
        this.name = name;
        this.work = work;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public String getWork() {
        return work;
    }

    public int getIncome() {
        return income;
    }

    public String getLastName() {
        String[] nameParts = name.split(" ");
        return nameParts[nameParts.length - 1];
    }

    public String toString() {
        return name;
    }
}
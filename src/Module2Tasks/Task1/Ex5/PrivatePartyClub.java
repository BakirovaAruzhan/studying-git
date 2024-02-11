package Module2Tasks.Task1.Ex5;
import java.util.Scanner;
public class PrivatePartyClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n umber of candidates:");
        int candidateCount = scanner.nextInt();
        scanner.nextLine();
        Candidate[] candidates = new Candidate[candidateCount];


        for (int i = 0; i < candidateCount; i++) {
            System.out.println("Enter candidate information (name work income):");
            String name = scanner.nextLine();
            String work = scanner.next();
            int income = scanner.nextInt();
            scanner.nextLine();

            candidates[i] = new Candidate(name, work, income);
        }
        System.out.println("Candidates eligible for the club:");
        for (Candidate candidate : candidates) {
            if (!candidate.getWork().equals("banker")
                    && candidate.getIncome() >= 1000
                    && (!candidate.getLastName().equals("Johnson") && !candidate.getLastName().equals("Edisson"))) {
                System.out.println(candidate);
            }
        }
    }
}


package Module2Tasks.Task1.Ex7;

import java.util.Scanner;

public class Project {
    String name;
    int cost;
    String type;
    boolean isGovermental;

    public static class CityProjects {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int budget = scanner.nextInt();
            int specType = scanner.nextInt();
            int projSize = scanner.nextInt();

            Project[] projects = new Project[projSize];

            for (int i = 0; i < projSize; i++) {
                projects[i] = new Project();
                projects[i].name = scanner.next();
                projects[i].cost = scanner.nextInt();
                projects[i].type = scanner.next();
                projects[i].isGovermental = scanner.nextInt() == 1;

                if (projects[i].type.equals("Science") && projects[i].type.equals(String.valueOf(specType))) {
                    projects[i].cost -= projects[i].cost * 0.2;
                }
            }

            int cityBudget = 0;
            int govermentPayment = 0;

            for (Project project : projects) {
                cityBudget += project.cost;

                if (project.isGovermental) {
                    govermentPayment += project.cost;
                }
            }

            if (cityBudget > budget) {
                govermentPayment += (cityBudget - budget);
                cityBudget = budget;
            }

            System.out.println(govermentPayment);
        }
    }
}





package Module2Tasks.Task2.ex5;

import java.util.Scanner;

public class School {
    String title;
    String specType;
    int espCount;
    Esper[] espers;

    public School(String title, String specType, int espCount) {
        this.title = title;
        this.specType = specType;
        this.espCount = espCount;
        this.espers = new Esper[espCount];
    }

    public void admitEsper(Esper esper) {
        if (esper.mighty >= 10 && esper.mighty <= 1000) {
            if (specType.equals(esper.type)) {
                System.out.println(title + " - " + esper.name + " подходит");
                espCount--;
            } else {
                System.out.println(title + " - " + esper.name + " не подходит по типу");
            }

        } else System.out.println(title + " - " + esper.name + " слишком " +
                (esper.mighty < 10 ? "слабый" : "сильный") + ", отправлен в спецучилище");
    }

    public int getAdmittedEsperCount() {
        return espCount;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int schoolCount = scanner.nextInt();
        School[] schools = new School[schoolCount];

        for (int i = 0; i < schoolCount; i++) {
            String title = scanner.next();
            String specType = scanner.next();
            int espCount = scanner.nextInt();

            schools[i] = new School(title, specType, espCount);

            System.out.println("Enter students for " + title + ":");
            for (int j = 0; j < espCount; j++) {
                String esperName = scanner.next();
                int mighty = scanner.nextInt();
                String esperType = scanner.next();

                Esper esper = new Esper(esperName, mighty, esperType);
                schools[i].admitEsper(esper);
            }
        }

        int specialSchoolCount = 0;
        for (School school : schools) {
            specialSchoolCount += school.getAdmittedEsperCount();
        }

        System.out.println("SpecialSchool - " + specialSchoolCount);
    }
}


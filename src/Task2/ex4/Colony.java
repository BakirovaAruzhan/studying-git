package Task2.ex4;

import java.util.Scanner;

public class Colony {
    String name;
    int smetPrice;
    int apCount;
    Apartment[] aparts;

    public Colony(String name, int smetPrice, int apCount) {
        this.name = name;
        this.smetPrice = smetPrice;
        this.apCount = apCount;
        this.aparts =  new Apartment[apCount];

    }
    public void setApartment(int i, String title, int smet, String type ){
        aparts[i]= new Apartment(title,smet,type);
    }
    public String findCheapestApartment() {
        double minPrice = Double.MAX_VALUE;
        String cheapestAptTitle = "";
        String colonyName = "";

        for (Apartment apt : aparts) {
            double price = apt.calculatePrice(smetPrice);
            if (price < minPrice) {
                minPrice = price;
                cheapestAptTitle = apt.title;
                colonyName = name;
            }
        }

        return cheapestAptTitle + " - " + (int) minPrice + " - " + colonyName;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int coloniesCount = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        Colony[] colonies = new Colony[coloniesCount];

        for (int i = 0; i < coloniesCount; i++) {
            String colonyInfo = scanner.nextLine();
            String[] colonyData = colonyInfo.split(" ");

            String colonyName = colonyData[0];
            int smetPrice = Integer.parseInt(colonyData[1]);
            int apCount = Integer.parseInt(colonyData[2]);

            colonies[i] = new Colony(colonyName, smetPrice, apCount);

            for (int j = 0; j < apCount; j++) {
                String aptInfo = scanner.nextLine();
                String[] aptData = aptInfo.split(" ");

                String aptTitle = aptData[0];
                int smet = Integer.parseInt(aptData[1]);
                String aptType = aptData[2];

                colonies[i].setApartment(j, aptTitle, smet, aptType);
            }
        }

        scanner.close();

        String cheapestApartment = colonies[0].findCheapestApartment();
        System.out.println(cheapestApartment);
    }
}





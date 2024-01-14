package Module2Tasks.Task1.Ex6;

import java.util.Scanner;

public class Ship {
    String name;
    String arrivalTime;
    int stayTime;
    boolean isDistress;

    public Ship(String name, String arrivalTime, int stayTime, boolean isDistress) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.stayTime = stayTime;
        this.isDistress = isDistress;
    }

    public boolean canEnterPort() {
        int arrivalInMinutes = convertToMinutes(arrivalTime);
        return isDistress || (arrivalInMinutes + stayTime <= convertToMinutes("10:00"));
    }

    private int convertToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }

    public static class Port {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int shipCount = scanner.nextInt();
            scanner.nextLine();

            Ship[] ships = new Ship[shipCount];

            for (int i = 0; i < shipCount; i++) {
                String name = scanner.next();
                String arrivalTime = scanner.next();
                int stayTime = scanner.nextInt();
                int isDistress = scanner.nextInt();
                scanner.nextLine();

                ships[i] = new Ship(name, arrivalTime, stayTime, isDistress == 1);
            }

            System.out.println("Ships allowed to enter the port:");
            for (Ship ship : ships) {
                if (ship.canEnterPort()) {
                    System.out.println(ship.name);
                }
            }
        }
    }
}
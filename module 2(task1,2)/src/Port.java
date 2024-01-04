import java.util.Scanner;

public class Port {
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
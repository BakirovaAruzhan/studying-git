import java.util.Scanner;

class Ship {
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
}



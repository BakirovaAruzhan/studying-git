package Module3.Collections2.task1;

import java.util.ArrayList;

public class ex4 {
    public static void main(String[] args) {
        ArrayList<String> colorsList = new ArrayList<>();

        colorsList.add("черный");
        colorsList.add("белый");
        colorsList.add("синий");
        colorsList.add("желтый");
        colorsList.add("оранжевый");

        System.out.println("список:");
        for (String color : colorsList) {
            System.out.println(color);
        }

        colorsList.remove(3);
        System.out.println("-1: "+ colorsList);
    }

}

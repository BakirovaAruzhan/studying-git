package Module3.Collections2.task1;

import java.util.ArrayList;
import java.util.Iterator;

public class ex1 {
    public static void main(String[] args) {
        ArrayList<String> colorsList = new ArrayList<>();

        colorsList.add("черный");
        colorsList.add("белый");
        colorsList.add("розовый");
        colorsList.add(" тиффани");
        colorsList.add("красный");

        System.out.println("список:");
        for (String color : colorsList) {
            System.out.println(color);
        }


    }

}

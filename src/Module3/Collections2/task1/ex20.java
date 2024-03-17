package Module3.Collections2.task1;

import java.util.ArrayList;

public class ex20 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("BANANA");
        arrayList.add("APPLE");
        arrayList.add("BLUEBERRY");
        arrayList.add("STRAWBERRY");
        arrayList.add("PINEAPPLE");
        arrayList.add("FIJI APPLE");

        for (int i =0; i < arrayList.size(); i++) {
            System.out.println("Позиция " + i + ": " + arrayList.get(i));
        }


    }
}
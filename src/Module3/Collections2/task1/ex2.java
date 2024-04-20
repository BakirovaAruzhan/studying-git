package Module3.Collections2.task1;

import java.util.ArrayList;
import java.util.Iterator;


public class ex2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Tom");
        list.add("Robert");
        list.add("Alice");
        list.add("Kate");
        list.add("Sam");

        System.out.println("Элементы списка:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}


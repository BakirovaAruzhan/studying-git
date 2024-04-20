package Module3.Collections2.task1;

import java.util.ArrayList;
import java.util.Collections;

public class ex11 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("кошка");
        arrayList.add("мышка");
        arrayList.add("зайка");
        arrayList.add("птенчик");
        arrayList.add("козлик");

        Collections.reverse(arrayList);

        System.out.println("обратный список:");

        for (String str: arrayList){
            System.out.println(str);
        }

    }
}
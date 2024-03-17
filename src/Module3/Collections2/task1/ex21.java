package Module3.Collections2.task1;

import java.util.ArrayList;

public class ex21 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("кошка ");
        arrayList.add("мышка");
        arrayList.add("зайка");
        arrayList.add("козлик");
        arrayList.add("овечка");


        System.out.println(arrayList);

        String  str ="страус";

        System.out.println("----------");

        arrayList.set(1,str);
        System.out.println(arrayList);


    }
}

package Module3.Collections2.task1;

import java.util.ArrayList;

public class ex18_19 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("мышка");
        arrayList.add("кошка");
        arrayList.add("собака");



        System.out.println(arrayList.size()+" size");


        System.out.println("----19---------");


        arrayList.trimToSize();
        System.out.println(arrayList+"trimSize");

        System.out.println("-------------");


        arrayList.clear();

        System.out.println(arrayList);

        System.out.println("---- 18---------");

        if (arrayList.isEmpty()) {
            System.out.println("found");
        } else {
            System.out.println("not f.");
        }

    }
}

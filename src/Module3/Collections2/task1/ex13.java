package Module3.Collections2.task1;

import java.util.ArrayList;

public class ex13 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("страус");
        arrayList1.add("фламинго");
        arrayList1.add("осел");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("козел");
        arrayList2.add("зайка");
        arrayList2.add("лошадка");
        arrayList2.add("страус");

        boolean isE =arrayList1.equals(arrayList2);

        if(isE){
            System.out.println("равны");
        }else System.out.println("не равны");


    }
}

package Module3.Collections2.task1;

import java.util.ArrayList;
import java.util.List;

public class ex12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("курица");
        arrayList.add("цыпленок");
        arrayList.add("индейка");
        arrayList.add("слон");
        arrayList.add("зайка");


        List<String> subList = arrayList.subList(4,5);


        for (String d : arrayList){
            System.out.println(d);
        }




    }
}

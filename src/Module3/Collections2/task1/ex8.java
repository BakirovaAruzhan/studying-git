package Module3.Collections2.task1;

import java.util.ArrayList;
import java.util.Collections;

public class ex8 {
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();

        arrayList.add("BANANA");
        arrayList.add("APPLE");
        arrayList.add("BLUEBERRY");
        arrayList.add("STRAWBERRY");
        arrayList.add("PINEAPPLE");
        arrayList.add("FIJI APPLE");

        Collections.sort(arrayList);

        for (String f: arrayList){
            System.out.println(f);
        }

    }
}

package Module3.Collections2.task1;

import java.util.ArrayList;
import java.util.Collections;

public class ex14 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(70);
        arrayList.add(660);
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(40);
        arrayList.add(660);


        System.out.println(arrayList);

        Collections.swap(arrayList, 1, 3);

        System.out.println(arrayList);
    }
}

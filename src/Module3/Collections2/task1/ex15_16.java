package Module3.Collections2.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class ex15_16 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("олень ", "тюлень", "пингвин"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("козел", "орел", "пчелка"));

        ArrayList<String> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        System.out.println(mergedList);
        System.out.println("--------------");


        mergedList.clear();

    }
}

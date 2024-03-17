package Module3.Collections2.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; ; i++) {
            String element = scanner.nextLine();
            if (element.equalsIgnoreCase("end")) {
                break;
            }
            arrayList.add(element);
        }
        Collections.sort(arrayList);



        System.out.println("elements ");
        for (String item : arrayList) {
            System.out.println(item);
        }
    }
}

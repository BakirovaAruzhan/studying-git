package Module3.Collections2.task1;

import java.util.ArrayList;

public class ex5 {
    public static void main(String[] args) {
        String[] array = {"Tom", "Robert", "Alice", "Kate", "Sam"};
        int index = 1;
        String name = "Bard";

        if(index>=0&& index< array.length){
            array[index]=name;
            System.out.println("updated");
        } else System.out.println("Wrong index");


        for (String element: array){
            System.out.println(element);
        }





    }
}


package Module3.Collections2.task1;

import java.util.ArrayList;
import java.util.Collections;

public class ex10 {
    public static void main(String[] args) {
        ArrayList<Integer[]> arrayList = new ArrayList<>();
        arrayList.add(new Integer[]{1, 2, 3, 4, 5});
        arrayList.add(new Integer[]{6, 7, 8, 9, 10});
        arrayList.add(new Integer[]{11, 12, 13, 14, 15});

      for (Integer[] array: arrayList){
          Collections.shuffle(arrayList);
      }


      for (Integer[] array : arrayList){
          for (Integer numb : array){
              System.out.print(numb + " ");
          }
      }
    }
}

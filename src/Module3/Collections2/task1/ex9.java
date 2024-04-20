package Module3.Collections2.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class ex9 {
    public static void main(String[] args) {

        ArrayList<int[]> arrayList= new ArrayList<>();
        arrayList.add(new int[]{1,8,5,2,5,8,5,8,6,});



        ArrayList<int[]> arrayList2= new ArrayList<>();

        for (int [] array :arrayList){
            int[] newArray =new int [array.length];
            System.arraycopy(array,0,newArray,0,array.length);
            arrayList2.add(newArray);
        }

        for (int[] array: arrayList2){
            for (int  numb: array){
                System.out.print(numb+ " /");

            }
            System.out.println();
        }



    }
}



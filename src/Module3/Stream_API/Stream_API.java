package Module3.Stream_API;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Stream_API {
    public static void main(String[] args) {
        //task1
        List<Integer> numbers = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
        double avg = numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println(avg);

        //task2
        List<String> strings = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
        List<String> uppercaseStrings = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(uppercaseStrings);

        List<String> lowercaseStrings = strings.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lowercaseStrings);

        // task3
        List<Integer> numbs = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14);
        int sum = numbs.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        //task4
        List<Integer> elements = Arrays.asList(0, 23, 22, 23, 24, 24, 33, 15, 26, 15);
        List<Integer> uniqueNumbers = elements.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueNumbers);

        //task5
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");

        char b = 'B';
        char y = 'Y';
        long count1 = colors.stream().filter(color -> color.startsWith(String.valueOf(b))).count();
        long count2 = colors.stream().filter(color -> color.startsWith(String.valueOf(y))).count();
        System.out.println("count b=" + count1);
        System.out.println("count y=" + count2);

        //task6
        List<String> color = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        List<String> ascendingOrder = color.stream().sorted().collect(Collectors.toList());
        List<String> descendingOrder = color.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("ascendingOrder:" + ascendingOrder + '\n' + "descendingOrder" + descendingOrder);

        //task7
        List<Integer> number = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(Integer.MIN_VALUE);
        int min = number.stream().mapToInt(Integer::intValue).min().orElse(Integer.MIN_VALUE);
        System.out.println("max:" +max +'\n'+"min:"+min);

        //task8
        List<Integer> numbers1 = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
        int a= numbers1.stream().sorted().skip(1).findFirst().orElseThrow(()->new RuntimeException("ops"));
        int i = numbers1.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(()-> new RuntimeException("ooops"));
        System.out.println("a="+a+'\n'+ "i:"+ i);


    }
}


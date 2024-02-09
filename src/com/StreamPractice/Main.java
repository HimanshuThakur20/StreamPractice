package  com.StreamPractice;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //integer average
        List<Integer> nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
        // Calculate the average using streams
        double average = nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println("Average value of the said numbers: " + average);


        // convert a list of strings to uppercase or lowercase using streams.
        List<String> stringValue = new ArrayList<>();
        System.out.println("\nEnter a string for further operations ");
        String Value = sc.nextLine();
        stringValue = List.of(Value.split(" "));
        List<String> convertedString = stringValue.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println("\n" + convertedString);

        List<String> convertedStringToUpper = stringValue.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("\n" + convertedStringToUpper);


        // calculate the sum of all even, odd numbers in a list using streams
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 7, 4, 5, 6, 7, 10, 100);
        int sumOfEven = numbers.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("\nsum of even: " + sumOfEven);

        int sumOfOdd = numbers.stream().filter(num -> num % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println("\nsum of odd: " + sumOfOdd);


        // to remove all duplicate elements from a list using streams.
        List<Integer> distinctRemoved = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("\nIntegers after removing distince" + distinctRemoved);

        //count the number of strings in a list that start with a specific letter using streams.
        System.out.println("\nEnter a character to be checked with ");
        char startingCharacter = sc.next().toLowerCase().charAt(0);
        long numOfStrings = stringValue.stream().filter(s -> s.toLowerCase().startsWith(String.valueOf(startingCharacter))).count();
        System.out.println("\nNumber of strings starting with letter" + startingCharacter + " are " + numOfStrings);


      //sort a list of strings in alphabetical order, ascending and descending using streams.
        List<String> sortedString1= stringValue.stream().sorted().collect(Collectors.toList());
        System.out.println("\nSorted string in ascending order is "+sortedString1);

        List<String> sortedString2 = stringValue.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("\nSorted string in descending order is "+sortedString2);



        //to find the maximum and minimum values in a list of integers using streams.
        int maximumInteger = numbers.stream().max(Integer::compare).orElse(null);
        int minimumInteger = numbers.stream().min(Integer::compare).orElse(null);
        System.out.println("\nMaximum and minimum values in the integer array are : "+maximumInteger+" and "+minimumInteger);


        //find the second smallest and largest elements in a list of integers using streams.
        int secondMinimum = numbers.stream().sorted().skip(1).findFirst().orElse(null);
        int secondMaximum = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);

        System.out.println("\nThe second largest and secomd smallest numbers in the list are :"+secondMaximum+" and "+secondMinimum);


    }
}

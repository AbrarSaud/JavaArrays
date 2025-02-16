import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Hello, World!");
/*  Q 1  Write a Java program to test if the first and the last element of an array of
    integers are same. The length of the array must be greater than or equal to 2  */
        System.out.println("*************************");
        System.out.println("--- First and Last Element Same ---");
        int[] arrNumber_Q1 = {50, -20, 0, 30, 40, 60, 10};
        // Compare first and last element
        if (arrNumber_Q1[0] == arrNumber_Q1[arrNumber_Q1.length - 1]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
/*  Q2  Write a Java program to find the numbers greater than the average of the
        numbers of a given array. */
        System.out.println("*************************");
        System.out.println("--- Average and Greater ---");
        int[] arrNumber_Q2 = {1, 4, 17, 7, 25, 3, 100};
        int sum = 0;
        // Loop to add all numbers in the array
        for (int num : arrNumber_Q2) {
            sum += num;// Add each number to sum
        }
        double average = (double) sum / arrNumber_Q2.length;
        System.out.printf("The average of the said array is:  %.1f%n", average);
        System.out.print("The numbers in the said array that are greater than the average are: ");
        // Check if number is greater than average
        for (int num : arrNumber_Q2) {
            if (num > average) {
                System.out.print(num + " ");
            }
        }
//  Q3  Write a Java program to get the larger value between first and last  element of an array of integers.
        System.out.println("*************************");
        System.out.println("--- larger number in array ---");
        int[] arrNumber_Q3 = {20, 30, 40};
        // Find the larger number between the first and last number in the array
        int largerValue = Math.max(arrNumber_Q3[0], arrNumber_Q3[arrNumber_Q3.length - 1]);
        System.out.println("Larger value between first and last element: " + largerValue);

//  Q4  Write a Java program to swap the first and last elements of an array and create a new array.
        System.out.println("*************************");
        System.out.println("--- swap array ---");
        ArrayList<Integer> originalArr = new ArrayList<Integer>();
        originalArr.add(20);
        originalArr.add(30);
        originalArr.add(40);
        int arrayLast = originalArr.size() - 1; // Find the last index in the array
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int num : originalArr) {
            newArr.add(num);
        }
        newArr.set(0, originalArr.get(arrayLast));   // First element(20) = Last element(40)
        newArr.set(arrayLast, originalArr.get(0));  // Last element(40) = First element(20)
        System.out.println("Original List: " + originalArr);
        System.out.println("New List after swapping: " + newArr);
//  Q5  Write a program that places the odd elements of an array before the  even elements.
        System.out.println("*************************");
        System.out.println("--- sorted array ---");
        int[] arrNumber_Q5 = {2, 3, 40, 1, 5, 9, 4, 10, 7};
        ArrayList<Integer> sortedArr = new ArrayList<>();
        // First, add all odd numbers to the new list
        for (int num : arrNumber_Q5) {
            if (num % 2 != 0) {
                sortedArr.add(num);
            }
        }
        // Then, add all even numbers to the new list
        for (int num : arrNumber_Q5) {
            if (num % 2 == 0) {
                sortedArr.add(num);
            }
        }
        System.out.print("Original Array: [");
        for (int num : arrNumber_Q5) {
            System.out.print(num + " ");
        }
        System.out.print("] \nsorted array  : ");
        System.out.println(sortedArr);
//  Q6  Write a program that test the equality of two arrays.
        System.out.println("*************************");
        System.out.println("--- arrays equal---");
        int[] arr1 = {2, 3, 6, 6, 4};
        int[] arr2 = {2, 3, 6, 6, 4};
        // Check if both arrays are equal
        boolean areEqual = Arrays.equals(arr1, arr2);
        System.out.println( areEqual);
    }
}
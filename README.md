# Exercise (Arrays) 
This repository has Exercises ( Array ) questions with code solutions .

---
## Question 1
Write a Java program to test if the first and the last element of an array of
integers are same. The length of the array must be greater than or equal to 2 .
<p><b>Test Data:</b></p>
<p>array = 50, -20, 0, 30, 40, 60, 10  </p>
<p><b> Sample Output: </b> false </p>

```java
        System.out.println("--- First and Last Element Same ---");
        int[] arrNumber_Q1 = {50, -20, 0, 30, 40, 60, 10};
        if (arrNumber_Q1[0] == arrNumber_Q1[arrNumber_Q1.length - 1]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }  
```

## Question 2
Write a Java program to find the numbers greater than the average of the
numbers of a given array .
<p><b>Original Array:</b></p>
<p>[1, 4, 17, 7, 25, 3, 100] </p>
<p><b>Expected Output: </b></p>
<p>The average of the said array is: 22.0 The numbers in the said array that are
greater than the average are: 25 100 </p>

```java
           System.out.println("--- Average and Greater ---");
        int[] arrNumber_Q2 = {1, 4, 17, 7, 25, 3, 100};
        int sum = 0;
        for (int num : arrNumber_Q2) {
            sum += num;
        }
        double average = (double) sum / arrNumber_Q2.length;
        System.out.printf("The average of the said array is:  %.1f%n", average);
        System.out.print("The numbers in the said array that are greater than the average are: ");
        for (int num : arrNumber_Q2) {
            if (num > average) {
                System.out.print(num + " ");
            }
        }
```

## Question 3
Write a Java program to get the larger value between first and last
element of an array of integers.
<p><b>Original Array:</b></p>
<p>[20, 30, 40]</p>
<p><b>Sample Output:  </b></p>
<p>Larger value between first and last element: 40 </p>

```java
        System.out.println("--- larger number in array ---");
        int[] arrNumber_Q3 = {20, 30, 40};
        int largerValue = Math.max(arrNumber_Q3[0], arrNumber_Q3[arrNumber_Q3.length - 1]);
        System.out.println("Larger value between first and last element: " + largerValue);

```


## Question 4
Write a Java program to swap the first and last elements of an array and
create a new array. 
<p><b>Original Array:</b></p>
<p>[20, 30, 40]</p>
<p><b>Sample Output:  </b></p>
<p>New array after swapping the first and last elements: [40, 30, 20] </p>

```java
       System.out.println("--- swap array ---");
        ArrayList<Integer> originalArr = new ArrayList<Integer>();
        originalArr.add(20);
        originalArr.add(30);
        originalArr.add(40);
        int arrayLast = originalArr.size() - 1; 
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int num : originalArr) {
            newArr.add(num);
        }
        newArr.set(0, originalArr.get(arrayLast));   
        newArr.set(arrayLast, originalArr.get(0)); 
        System.out.println("Original List: " + originalArr);
        System.out.println("New List after swapping: " + newArr);

```

## Question 5
Write a program that places the odd elements of an array before the
even elements. 
<p><b>Original Array:</b></p>
<p>[2,3,40,1,5,9,4,10,7] </p>
<p><b>Sample Output:  </b></p>
<p>[3,1,5,9,7,2,40,4,10] </p>

```java
        System.out.println("--- sorted array ---");
        int[] arrNumber_Q5 = {2, 3, 40, 1, 5, 9, 4, 10, 7};
        ArrayList<Integer> sortedArr = new ArrayList<>();
        for (int num : arrNumber_Q5) {
            if (num % 2 != 0) {
                sortedArr.add(num);
            }
        }
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

```

## Question 6
Write a program that test the equality of two arrays.  
<p><b>[2,3,6,6,4] [2,3,6,6,4] </b></p>
<p><b>Sample Output:  </b></p>
<p>true</p>

```java
         System.out.println("*************************");
        System.out.println("--- arrays equal---");
        int[] arr1 = {2, 3, 6, 6, 4};
        int[] arr2 = {2, 3, 6, 6, 4};
        boolean areEqual = Arrays.equals(arr1, arr2);
        System.out.println( areEqual);

```


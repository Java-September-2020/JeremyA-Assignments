import java.util.ArrayList;

public class Basics {
    public static void main (String [] args){
    // Print 1-255
    for (int i = 1; i <= 255; i++){
        System.out.println(i);
    }

    // Print odd numbers between 1-255
    for (int i = -1; i <= 255; i+=2){
        System.out.println(i);
    }

    // Print Sum
    int sum = 0;
    for (int i = 0; i <= 255; i++){
        sum = sum + i;
        System.out.println("New number: " + i + " Sum: " + sum);
    }


    // Iterating through an array
    int array [] = {1,3,5,7,9,13};
    for (int i = 0; i < array.length; i++){
        System.out.println(array[i]);
    }


    // Find Max
    int array[] = {-3,-5,-7};
    int max = 0;
    for (int i = 0; i < array.length; i++){
        max = max + array[i];
    }
    System.out.println(max);


    // Get Average
    int array[] = {2,10,3};
    int sum = 0;
    int avg = 0;
    for (int i = 0; i < array.length; i++){
        sum += array[i];
    }
    avg = sum / array.length;
    System.out.println(avg);


    // Array with Odd Numbers
    // Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. 
    // When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].


    // Greater Than Y
    // Write a method that takes an array and returns the number of values in that array whose 
    // value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, 
    // after your method is run it will print 2 
    // (since there are two values in the array that are greater than 3).


    // Square the values
    // Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the 
    // array by itself. When the method is done, the array x should have values that have been 
    // squared, say [1, 25, 100, 4].


    // Eliminate Negative Numbers
    // Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number 
    // with the value of 0. When the method is done, x should have no negative values, 
    // say [1, 5, 10, 0].


    // Max, Min, and Average
    // Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum 
    // number in the array, the minimum value in the array, and the average of the values in the array. 
    // The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]


    // Shifting the Values in the Array
    // Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the 
    // front. For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. 
    // Notice that the last number is 0. The method does not need to wrap around 
    // the values shifted out of bounds.
    }    
}
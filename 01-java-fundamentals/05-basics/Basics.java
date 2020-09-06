//IMPORTANT: for program to work, secions need to be tested, commented-out, and compilled indivudually. 

import java.util.ArrayList;

public class Basics {
    public static void main (String [] args){
        // Print 1-255
        for (int i = 1; i <= 255; i++){
            System.out.println(i);
        }

        // // Print odd numbers between 1-255
        // for (int i = -1; i <= 255; i+=2){
        //     System.out.println(i);
        // }

        // // Print Sum
        // int sum = 0;
        // for (int i = 0; i <= 255; i++){
        //     sum = sum + i;
        //     System.out.println("New number: " + i + " Sum: " + sum);
        // }


        // // Iterating through an array
        // int array [] = {1,3,5,7,9,13};
        // for (int i = 0; i < array.length; i++){
        //     System.out.println(array[i]);
        // }


        // // Find Max
        // int array[] = {-3,-5,-7};
        // int max = 0;
        // for (int i = 0; i < array.length; i++){
        //     max = max + array[i];
        // }
        // System.out.println(max);


        // // Get Average
        // int array[] = {2,10,3};
        // int sum = 0;
        // int avg = 0;
        // for (int i = 0; i < array.length; i++){
        //     sum += array[i];
        // }
        // avg = sum / array.length;
        // System.out.println(avg);


        // // Array with Odd Numbers
        // ArrayList<Integer> arrOdd = new ArrayList<Integer>();
        // for (int i = 1; i <= 255; i+=2){
        //     arrOdd.add(i);
        // }
        // int y []= new int[arrOdd.size()];
        // for (int i = 0; i < y.length; i++){
        //     y[i] = arrOdd.get(i);
        // }
        // System.out.println(y);
        // // Will come back to this top one...

        // // Greater Than Y
        // int grtrArr[] = {1,3,5,7};
        // int y = 3;
        // int count = 0;
        // for (int i = 0; i < grtrArr.length; i++){
        //     if (grtrArr[i] > y){
        //         count++;
        //     }
        // }
        // System.out.println(count);

        // // Square the values
        // int arrX[] = {1,5,10,-2};
        // for (int i = 0; i < arrX.length; i++) {
        //     arrX[i] = arrX[i]*arrX[i];
        //     System.out.println(arrX[i]);
        // }

        // // Eliminate Negative Numbers
        // int arrNeg[] = {1,5,10,-2};
        // for (int i = 0; i < arrNeg.length; i++) {
        //     if (arrNeg[i] < 0){
        //         arrNeg[i] = 0;
        //     }
        //     System.out.println(arrNeg[i]);
        // }

        // // Max, Min, and Average
        // int arrMaxMinAvgX[] = {1,5,10,-2};
        // int arrMax = 0;
        // int arrMin = 0;
        // int arrAvg = 0;
        // int sum2 = 0;
        // for (int i = 0; i < arrMaxMinAvgX.length; i++){
        //     if (i == 0){
        //         arrMax = arrMaxMinAvgX[i];
        //         arrMin = arrMaxMinAvgX[i];
        //     }
        //     else {
        //         if (arrMaxMinAvgX[i] > arrMax){
        //             arrMax = arrMaxMinAvgX[i];
        //         }
        //         if (arrMaxMinAvgX[i] < arrMin){
        //             arrMin = arrMaxMinAvgX[i];
        //         }
        //     }
        //     sum2 = sum2 + arrMaxMinAvgX[i];
        //     arrAvg = sum2/arrMaxMinAvgX.length;
        // }
        // System.out.println(arrMax + " " + arrMin + " " + arrAvg);


        // // Shifting the Values in the Array
        // // Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the 
        // // front. For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. 
        // // Notice that the last number is 0. The method does not need to wrap around 
        // // the values shifted out of bounds.
        // int[] arrShift = {1, 5, 10, 7, -2};
        // for (int i = 0; i < arrShift.length; i++){
        //     if(i == arrShift.length - 1){
        //         arrShift[i] = 0;
        //     }
        //     else{
        //         arrShift[i] = arrShift[i+1];
        //     }
        //     System.out.println(arrShift[i]);
        // }
        // // Will come back to this top one...
    } 
}
import java.util.*;
public class PuzzleJava {
    public static void main(String [] args) {

        // Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum 
        // of all numbers in the array. Also have the function return an array that only includes 
        // numbers that are greater than 10 (e.g. when you pass the array above, it should return 
        // an array with the values of 13,25,32)
        int array1[] = {3,5,1,2,7,9,8,13,25,32};
        int sum = 0;
        int a = 0;
        for (a = 0; a < array1.length; a++){
            sum += array1[a];
        }
        System.out.println(sum);
        for (a = 0; a < array1.length; a++){
            if (array1[a] > 10){
                System.out.println(array1[a]);
            }
        }

        // Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, 
        // Ishikawa. Shuffle the array and print the name of each person. 
        // Have the method also return an array with names that are longer than 5 characters.
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        Collections.shuffle(names);
        System.out.println(names);
        ArrayList<String> listReturn = new ArrayList<String>();
        for(int i = 0; i < names.size(); i++){
            String check = names.get(i);
            if (check.length() > 5){
                listReturn.add(names.get(i));
            }
        }
        String[] returnNames = new String[listReturn.size()];
        for (int j = 0; j < returnNames.length; j++){
            returnNames[j] = listReturn.get(j);
            System.out.println(returnNames[j]);
        }

        // Create an array that contains all 26 letters of the alphabet (
        // this array must have 26 values). Shuffle the array and, after shuffling, 
        // display the last letter from the array. Have it also display the first letter of the array. 
        // If the first letter in the array is a vowel, have it display a message.
        // -------------------------
        // To shuffle a collection, you can use the shuffle method of the Collections class. 
        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 
            'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
            'w', 'x', 'y', 'z'));
            Collections.shuffle(letters);
            for(int i = 0; i < letters.size(); i++){
                if (i == letters.size() - 1){
                    System.out.println(letters.get(i));
                }    
            }
            for(int j = 0; j < letters.size(); j++){
                if (j == 0){
                    System.out.println(letters.get(j));
                    if (letters.get(j).equals('a') ||  letters.get(j).equals('e') || letters.get(j).equals('i') ||
                    letters.get(j).equals('o') || letters.get(j).equals('u') || letters.get(j).equals('y')){
                        System.out.println(letters.get(j) + ": this is a vowel!");
                    }
                }
            }

        // Generate and return an array with 10 random numbers between 55-100.
        // -------------------------
        // To get a random integer, you can use the nextInt method of the Random class.
        int[] randomArray = new int[10];
        Random r = new Random();
        int low = 55;
        int high = 100;
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = r.nextInt(high-low) + low;
            System.out.println(randomArray[i]);
        }

        // Generate and return an array with 10 random numbers between 55-100 and have 
        // it be sorted (showing the smallest number in the beginning). Display all the numbers in the 
        // array. Next, display the minimum value in the array as well as the maximum value.
        // ------------------------
        // To sort a collection, you can use the sort method of the Collections class.
        int[] randomArray1 = new int[10];
        Random r1 = new Random();
        int low1 = 55;
        int high1 = 100;
        for (int i = 0; i < randomArray1.length; i++){
            randomArray1[i] = r1.nextInt(high1-low1) + low1;
            Arrays.sort(randomArray1);
            System.out.println(randomArray1[i]);
        }
        for (int j = 0; j < randomArray1.length; j++){
            if (j == 0 || j == randomArray1.length - 1){
                System.out.println(randomArray1[j]);
            }
        }
        // ^ need to rework above method....
        //__________________________________________________________________________________________

        // Create a random string that is 5 characters long.
        StringBuilder word = new StringBuilder(5);
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" 
        + "abcdefghijklmnopqrstuvxyz";
        for (int i = 0; i < 5; i++){
            int index = (int)(AlphaNumericString.length() * Math.random());
            word.append(AlphaNumericString.charAt(index));
        }
        String sword = String.valueOf(word.toString());
        System.out.println(sword);

        // Generate an array with 10 random strings that are each 5 characters long
        StringBuilder word1 = new StringBuilder(5);
        String AlphaNumericString1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" 
        + "abcdefghijklmnopqrstuvxyz";
        String randomString []= new String[10];
        for (int i = 0; i < randomString.length; i++){
            for (int j = 0; j < 5; j++){
                int index1 = (int)(AlphaNumericString1.length() * Math.random());
                word1.append(AlphaNumericString1.charAt(index1));
            }
            randomString[i] = String.valueOf(word1.toString());
            System.out.println(randomString[i]);
        }
        // ^ need to rework above method....
        //__________________________________________________________________________________________

    }
}
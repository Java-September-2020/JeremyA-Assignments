public class FizzBuzz {
    public String fizzbuzz(int number) {
        int two = 2;
        if (number == 3){
            return "Fizz";
        }
        else if (number == 5){
            return "Buzz";
        }
        else if (number == 15){
            return "FizzBuzz";
        }
        else {
            return Integer.toString(number);
        }
    }
    
}
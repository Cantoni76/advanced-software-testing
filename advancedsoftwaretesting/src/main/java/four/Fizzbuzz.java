package four;

public class Fizzbuzz {

    public String print (int i){
        if (i % 15 == 0){
            return "Fizzbuzz";
        }
        else if (i % 3 == 0){
            return "Fizz";
        }
        else if (i % 5 == 0){
            return "Buzz";
        }
        return Integer.toString(i);
    }
}

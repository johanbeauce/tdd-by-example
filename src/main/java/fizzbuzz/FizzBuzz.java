package fizzbuzz;

public class FizzBuzz {

    private static final String FIZZ = "fizz";
    private static final String BUZZ = "buzz";
    private static final String FIZZBUZZ = "fizzbuzz";

    public String display(int number) {
        if (isMultipleOfFive(number) && isMultipleOfThree(number)) {
            return FIZZBUZZ;
        }
        if (isMultipleOfFive(number)) {
            return BUZZ;
        }
        if (isMultipleOfThree(number)) {
            return FIZZ;
        }
        return Integer.toString(number);
    }

    private boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }
}

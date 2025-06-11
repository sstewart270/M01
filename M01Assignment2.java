import java.util.Scanner;

public class M01Assignment2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long number = input.nextLong();
        input.close();

        if (isValid(number)) {
            System.out.printf("%d is valid%n", number);
        } else {
            System.out.printf("%d is invalid%n", number);
        }
    }

    /** return true of card number is valid */
    public static boolean isValid(long number) {
        int size = getSize(number);
        // check the length 
        if (size < 13 || size > 16) {
            return false;
        }
        // check the prefix 
        if (!(prefixMatched(number, 4) ||
              prefixMatched(number, 5) ||
              prefixMatched(number, 37) ||
              prefixMatched(number, 6))) {
            return false;
        }
        // luhn check
        int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return sum % 10 == 0;
    }

    /** get result from dobling every second digit from the right */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String s = Long.toString(number);
        for (int i = s.length() - 2; i >= 0; i -= 2) {
            int digit = Character.digit(s.charAt(i), 10);
            sum += getDigit(digit * 2);
        }
        return sum;
    }

    /* return the number if single digit; otherwise return sum of its two digits  */
    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        }
        return (number / 10) + (number % 10);
    }

    /** return sum of digits in the odd places from right to left */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String s = Long.toString(number);
        for (int i = s.length() - 1; i >= 0; i -= 2) {
            sum += Character.digit(s.charAt(i), 10);
        }
        return sum;
    }

    /** return true of the digit d is a prefix of number */
    public static boolean prefixMatched(long number, int d) {
        int k = getSize(d);
        return getPrefix(number, k) == d;
    }

    /** return the number of digits in d */
    public static int getSize(long d) {
        return Long.toString(d).length();
    }

    /** return the first k digits of number, if the number has fewer than k digits, then return number */
    public static long getPrefix(long number, int k) {
        String s = Long.toString(number);
        if (s.length() <= k) {
            return number;
        }
        return Long.parseLong(s.substring(0, k));
    }
}
public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("Sum of the digit 153 is " + sumDigits(153));
        System.out.println("Sum of the digit 13 is " + sumDigits(13));
        System.out.println("Sum of the digit 467 is " + sumDigits(467));
    }

    public static int sumDigits(int num){
        if (num <10){
            return -1;
        }

        int sum =0;

        while (num > 0) {
            int digit = num %10;
            sum += digit;
            num /= 10;
            }
        return sum;
    }
}

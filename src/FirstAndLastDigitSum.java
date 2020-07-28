public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1265));

    }

    public static int sumFirstAndLastDigit(int number) {

        if(number < 0){
            return -1;
        }
        int lastDigit = number % 10;

        int firstdigit = number;
        while (firstdigit >= 10) {
            firstdigit /= 10;
        }
        return firstdigit + lastDigit;
    }

}

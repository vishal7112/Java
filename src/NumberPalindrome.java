public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }

    public static boolean isPalindrome (int number){
        int reverse=0,remainder;
        int temp=number;
        while( number != 0 )
        {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/ 10;
        }

        if (temp == reverse) {
            return true;
        } else {
            return false;
        }
    }
}

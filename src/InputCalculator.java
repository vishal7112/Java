import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
    inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage (){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        long average = 0;

        while (true) {

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                average =  Math.round((double) sum / counter);

            }
            else{
                System.out.println("SUM = " +sum +" AVG = " +average);
                break;
            }
        }
    } 
}

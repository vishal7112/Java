public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays (long minutes) {

        if (minutes < 0) {
            System.out.printf("invalid Value");
        } else if (minutes >= 0) {

            long hour = minutes / 60;
            long day = hour / 24;
            long year = day / 365;
            day = day % 365;
            System.out.println(minutes + "min = " + year + " y and " + day + " d");

        }
    }

}

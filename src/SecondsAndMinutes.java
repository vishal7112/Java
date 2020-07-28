public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(100, 60));
        System.out.println(getDurationString(3945));
        
    }

    public static String getDurationString(long minutes, long seconds) {

        if ((minutes < 0) || (seconds < 0 && seconds > 59)) {
            return "Invalid Value";
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return "Invalid Value";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if ((a < 10 && a > 1000) || (b < 10 && b > 1000) || (c < 10 && c > 1000)) {
            return false;
        }

        if (((a % 10) == (b % 10)) || ((a % 10) == (c % 10)) || ((b % 10) == (c % 10))) {
            return true;
        }
        return false;
    }

    public static void numberToWords (int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int value = number %10;
        int word;
    }

}


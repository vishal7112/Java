public class NumberOfDaysInMonths {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(5,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(12,11111));
    }

    public static boolean isLeapYear(int year) {
        if ((year >= 1 && year <= 9999) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            return true;
        } else
            return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month >= 1 || month <= 12) && (year >= 1 && year <= 9999)) {
                int days=0;
                switch (month) {
                    case 2:
                        if (isLeapYear(year)){
                            days = 29;
                            return days;
                        }else
                            days = 28;
                            return days;
                    case 4: case 6: case 9: case 11:
                        days =30;
                        return days;
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        days = 31;
                        return days;
                    default:
                        return -1;
                }
        }
        return -1;
    }
}


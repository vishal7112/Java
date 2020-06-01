public class BarkingDog {

    public static boolean bark(boolean barking, int houroftheday) {
        if (barking == false || houroftheday < 0 || houroftheday > 23)
            return false;
        else if (barking == true && houroftheday >= 0 && houroftheday < 8)
            return true;
        else if (barking == true && houroftheday > 22 && houroftheday < 24)
            return true;
        else return false;
    }


    public static void main(String[] args) {

        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));
    }
}

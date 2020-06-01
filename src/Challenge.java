public class Challenge {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet >=0){
            feet = (feet * 30.48);
            return feet;
        }

        if (inches  >= 0 && inches <=12){
            return inches;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(10,11));
    }

}

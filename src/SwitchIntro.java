public class SwitchIntro {

    public static void main(String[] args) {

        char alphabets = 'A';
        switch (alphabets){
            case 'A':
                System.out.println("A, Found");
                break;
            case 'B':
                System.out.println("B, Found");
                break;
            case 'C':
                System.out.println("C, Found");
                break;
            case 'D':
                System.out.println("D, Found");
                break;
            case 'E':
                System.out.println("E, Found");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}

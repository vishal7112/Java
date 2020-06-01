public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("invalid value");
        } else {
            int megaBytes = (kiloBytes / 1024);
            int remainingKb = (kiloBytes % 1024);
            System.out.println( kiloBytes + " KB = " + megaBytes + " MB and " + remainingKb +" KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
}

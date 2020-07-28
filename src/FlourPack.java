public class FlourPack {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
    }

    public static boolean canPack (int bigCount, int smallCount, int goal){
        int newBigcount =5;
        bigCount = bigCount * newBigcount;
        if (bigCount + smallCount == goal){
            return true;
        } else  if (bigCount > goal){
            return false;
        } else if (smallCount >goal){
            return true;
        }
        return false;
    }
}

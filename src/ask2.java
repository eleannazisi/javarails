import java.util.Random;

public class ask2 {
    public static void main(){
        Random rand = new Random();
        int user1 = rand.nextInt(0, 6);
        int user2 = rand.nextInt(0,6);
        int comp1 = rand.nextInt(0,6);
        int comp2 = rand.nextInt(0,6);
        double total1 = user1 + user2;
        double total2 = comp1 + comp2;

        if ( total1 < total2 ){
            System.out.println("User " + user1 + " and " + user2 + " total " + total1 + " computer " + comp1 + " and " + comp2 + " total " + total2 + " computer wins");
        } else if (total1 > total2 ) {
            System.out.println("User " + user1 + " and " + user2 + " total " + total1 + " computer " + comp1 + " and " + comp2 + " total " + total2 + " user wins");

        }
    }
}

import java.util.Random;

public class ask3 {
    public static void main(){
        Random rand = new Random();

        for (int j = 0; j < 1000; j++) {
            int die1 = rand.nextInt(0, 6);
            int die2 = rand.nextInt(0, 6);
            int die3 = rand.nextInt(0, 6);
            int die4 = rand.nextInt(0, 6);
            int die5 = rand.nextInt(0, 6);
            int die6 = rand.nextInt(0, 6);
            int a = die1;
            int b = die2;
            int c = die3;
            int d = die4;
            int e = die5;
            int f = die6;
            System.out.println("1: " + j + a + " times");
            System.out.println("2: " + j + b + " times");
            System.out.println("3: " + j + c + " times");
            System.out.println("4: " + j + d + " times");
            System.out.println("5: " + j + e + " times");
            System.out.println("6: " + j + f + " times");



        }

    }
}

import java.util.Random;

public class ask1 {
    public static void main() {
        Random rand = new Random();
        int dice= rand.nextInt(0, 6);
        System.out.println(dice);
    }
}

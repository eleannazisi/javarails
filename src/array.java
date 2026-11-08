import java.util.Random;

public class array {
    public static void main(){
        Random rand = new Random();

        int [] integers = new int [10];

        int even = 0;
        int odd = 0;

        for (int j =0; j<10; j++){
            int value = rand.nextInt(1,101);

            integers[j] = value;

            int total = integers[0]+integers[1]+integers[2]+integers[3]+integers[4]+integers[5]+integers[6]+integers[7]+integers[8]+integers[9];

            double average = total/10.0;

            if (integers[j] % 2 == 0){
                even = even + 1;
            }
            else{
                odd = odd + 1;
            }

            System.out.println(average);
        }

    }
}

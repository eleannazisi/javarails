import java.util.Scanner;

public class Navigator {
    public static void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select type (1) Car, (2) Bus, (3) Walking:");
        System.out.println("Departure:");
        System.out.println("Destination:");

        int type = scanner.nextInt();
        scanner.nextLine();
        String departure = scanner.nextLine();
        String destination = scanner.nextLine();

        if (type == 1){
            System.out.println("Route from " + departure + " to " + destination + " by car: -------");
        } else if (type == 2){
            System.out.println("Route from " + departure + " to " + destination + " by bus: #######");
        } else{
            System.out.println("Route from " + departure + " to " + destination + " walking: .........");
        }


    }
}

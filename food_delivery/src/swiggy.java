import java.util.Scanner;

public class swiggy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the pin code");
        int pin=sc.nextInt();
        check_pin(pin);
    }
    public static void check_pin(int a) {
        try {
            if (a == 123 || a == 456 || a == 789)
                throw new Exception();
            System.out.println("Delivery available in your area!");
        } catch (Exception e) {
            System.out.println("Delivery not available in your area!");
        }
    }

}

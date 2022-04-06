import java.util.Scanner;

public class cylinder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the values");
        int r = sc.nextInt();
        int h = sc.nextInt();
        double vol=(3.14*r*r*h);
        System.out.println("volume is "+vol);
    }
}

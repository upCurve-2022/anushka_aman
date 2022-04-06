import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value");
        int r = sc.nextInt();
        if(r%4==0)
            System.out.println("Is a leap year");
        else
            System.out.println("Not a leap year");
    }
}

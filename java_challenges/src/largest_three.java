import java.util.Scanner;

public class largest_three {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value");
        int a=sc.nextInt();
        System.out.println("Enter the value");
        int b=sc.nextInt();
        System.out.println("Enter the value");
        int c=sc.nextInt();
        int lar=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("largest of all is "+lar);

    }
}

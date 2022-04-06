import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt(),pro=1;
        System.out.println("Enter a power ");
        int b = sc.nextInt();
        for(int i=1;i<=b;i++)
        {
          pro*=a;
        }
        System.out.println("number "+pro);
    }
}

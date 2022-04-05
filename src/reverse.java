import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n= sc.nextLong(),rev=0;
        long l=n;
        while(l!=0)
        {
            rev = rev*10+l%10;
            l=l/10;
        }
        System.out.println("Original number is "+n);
        System.out.println("Reverse of the number is "+rev);

    }
}

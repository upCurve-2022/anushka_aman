import java.util.Scanner;

public class dec_bin {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt(),i=0;
        int [] ar= new int[10];
        while(a!=0)
        {
            ar[i]=a%2;
            a=a/2;
            i++;
        }
        System.out.println("decimal number is ");
        for ( i=ar.length-1;i>=0;i--)
            System.out.print(ar[i]);

    }
}

import java.util.Scanner;

public class bin_dec {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt(),dec=0,temp=0,i=0;
        while(a!=0)
        {
            temp=a%10;
            dec+=temp*Math.pow(2,i);
            a=a/10;
            i++;
        }
        System.out.println("decimal number is "+dec);
    }
}

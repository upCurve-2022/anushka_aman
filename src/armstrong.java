import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc= new Scanner(System.in);
        int b = sc.nextInt(),temp=0,sum=0;
        int a=b;
        while(a!=0)
        {
            temp=a%10;
            sum+=Math.pow(temp,3);
            a/=10;
        }
        if(sum==b)
        {
           System.out.println("yes");
        }
        else
            System.out.println("no");
    }
}

import java.util.Scanner;
public class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int flag=0,n=a+1;
        while(n!=b)
        {
            for(int i=2;i<=a/2;i++)
            {
                if(a%i==0)
                {
                    flag++;
                    break;
                }
            }
            if(flag!=0)
            {
                System.out.println(" "+n);
                break;
            }
            n++;
        }
    }

}
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt(),fac=1;
        if(a==0||a==1)
            fac=1;
        else
        {
            for(int i=1;i<=a;i++)
                fac=fac*i;
        }
        System.out.println("factorial is : "+fac);

    }
}

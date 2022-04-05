import java.util.Scanner;

public class sum {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt(),s=0;
        for(int i=0;i<=a;i+=2)
        {
            s+=i;
        }
        System.out.println("Sum of even numbers are "+s);
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt(),s=0;
        for(int i=1;i<=a;i+=2)
        {
            s+=i;
        }
        System.out.println("Sum of odd numbers are "+s);
    }
}

import java.util.Scanner;

public class words {
    private static System Sytem;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=n;
        int rev=0;
        while(l!=0) {
            rev = l % 10+rev*10;
            l /= 10;
        }
        while(rev!=0)
        {
            int num1=rev%10;
            rev/=10;
            switch (num1)
            {
                case 1 :
                    System.out.print("One");
                    break;
                case 2 :
                    System.out.print("Two");
                    break;
                case 3 :
                    System.out.print("Three");
                    break;
                case 4 :
                    System.out.print("Four");
                    break;
                case 5 :
                    System.out.print("Five");
                    break;
                case 6 :
                    System.out.print("Six");
                    break;
                case 7 :
                    System.out.print("Seven");
                    break;
                case 8 :
                    System.out.print("Eight");
                    break;
                case 9 :
                    System.out.print("Nine");
                    break;
                default:
                    System.out.print("Zero");
            }
        }
    }
}

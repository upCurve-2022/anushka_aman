import java.util.Scanner;

public class fibb {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr=new int[10];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<a;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        for(int i=0;i<a;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}

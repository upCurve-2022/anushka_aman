import java.util.Scanner;

public class linear_sear {
    public static void main(String[] args) {
        int [] arr= new int[]{1,2,4,67,54,32};
        System.out.println("Enter a number ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==a)
            {
                System.out.print("found number "+a);
                break;
            }
        }
    }
}

import java.util.Scanner;

public class av_arr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the elements");
        int [] arr=new int[20];
        int s=0,avg=0;
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
            s+=arr[i];
        }
        avg=s/5;
        System.out.println("Average is "+avg);

    }
}

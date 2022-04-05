import java.util.Scanner;

public class binary_sear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("Enter the elements of array");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the elements to search");
        int b= sc.nextInt();
        int l=arr.length-1,f=0;
        int mid=(l+f)/2;
        while(f<=l)
        {
            if(b==arr[mid])
            {
                System.out.println("found at "+mid);
                break;
            }
            else if(arr[mid]<b)
            {
                f=mid+1;
            }
            else
            {
                l=mid-1;
            }
            mid=(f+l)/2;
        }
        if(f>l)
            System.out.println("not found");

    }
}

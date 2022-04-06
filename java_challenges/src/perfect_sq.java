import java.util.Scanner;

public class perfect_sq {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the values");
        int a=sc.nextInt();
        double b=Math.sqrt(a);
        if(b-Math.floor(b)==0)
            System.out.println("Is a perfect square");
        else
            System.out.println("Not a perfect square");
    }
}

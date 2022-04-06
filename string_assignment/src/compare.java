import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter the string");
        String str1 = sc.nextLine();
        /*if(str.equals(str1))
        {
            System.out.println("Both are same ");
        }
        else
            System.out.println("Both are different ");*/
        if(str.equalsIgnoreCase(str1))
            System.out.println("Both are same ");
        else
            System.out.println("Both are different ");
    }
}

import java.util.Scanner;

public class upper_case {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("upper case is "+str.toUpperCase());
    }
}

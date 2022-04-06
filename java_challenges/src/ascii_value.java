import java.util.Scanner;

public class ascii_value {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value");
        char ch= sc.next().charAt(0);
        System.out.println("ASCII value is "+((int)ch));
    }
}

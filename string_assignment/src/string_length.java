import java.util.Scanner;

public class string_length {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        int a = str.length();
        System.out.println("length of string is "+a);
    }
}

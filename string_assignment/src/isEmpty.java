import java.util.Scanner;

public class isEmpty {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        if(str.isEmpty())
            System.out.println("String is empty");
        else
            System.out.println("String is not empty");
    }
}

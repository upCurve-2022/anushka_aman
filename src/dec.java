import java.util.Scanner;

public class dec {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc= new Scanner(System.in);
        float value= sc.nextFloat();
        double fractional_part = value % 1;
        double integral_part = value - fractional_part;
        System.out.print("\nOriginal value: "+value);
        System.out.print("\nIntegral part: "+integral_part);
        System.out.print("\nFractional part: "+fractional_part);
        System.out.println();
    }
}

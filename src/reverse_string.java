import java.util.Scanner;

public class reverse_string {
    public static void main (String[] args) {

        System.out.println("Enter a string ");
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        char ch;
        String nstr= new String();
        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println("Reversed word: "+ nstr);
    }
}

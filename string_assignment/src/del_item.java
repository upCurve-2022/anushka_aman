import java.util.Scanner;

public class del_item {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String str1 = str.replaceAll("t","");
        System.out.println(str1);
        /*String s1="javatpoint is a very good website";
        String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'
        System.out.println(replaceString);*/
    }
}

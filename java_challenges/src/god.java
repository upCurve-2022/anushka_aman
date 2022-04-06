import java.util.Scanner;

public class god {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String word = sc.nextLine();
        for(int i = 0; i<word.length();i++)
        {
            for(int j='a';j<='z';j++){
                word = word.charAt(i)+""+(char)j;
                System.out.println(word);
            }
        }
    }
}

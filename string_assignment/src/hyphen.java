import java.util.Scanner;

public class hyphen {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String str1= new String();
        int s= str.length();
        for(int i=0;i<s;i++)
        {
            if(str.charAt(i)=='-')
            {
                if(str.charAt(i-1)>='0'&&str.charAt(i-1)>='9'&&str.charAt(i+1)>='0'&&str.charAt(i+1)>='9')
                    str1 = str.replace("-","");
            }
        }
        System.out.println(str1);
    }
}

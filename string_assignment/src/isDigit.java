import java.util.Scanner;

public class isDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        int s= str.length(),flag=0;
        for(int i=0;i<s;i++)
       {
           if(str.charAt(i)>='0'&&str.charAt(i)<='9')
           {
               flag++;
           }
           else
           {
               flag=0;
           }
       }
        /*for(int i=0;i<s;i++)
        {
            if(!Character.isDigit(str.charAt(i)))
            {
                flag++;
                break;
            }
        }*/
        if(flag!=0)
            System.out.println("have only digits in it");
        else
            System.out.println("do not have only digits in it");

    }
}

import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string ");
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
       int a=str.length(),flag=0;
      for(int i=0,j=a-1;i<a/2;i++,j--)
      {
          if(str.charAt(i)!=str.charAt(j))
          {
              flag++;
              break;
          }
      }
       if(flag!=0)
           System.out.println("no");
       else
           System.out.println("yes");

    }
}

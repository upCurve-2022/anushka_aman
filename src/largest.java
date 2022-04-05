public class largest {
    public static void main(String[] args) {
        int a=10,b=2,c=90,l=0,ml=0;
        if(a>b&&a>c)
        {
            l=a;
            if(b>c)
                ml=b;
            else {
                ml = c;
            }
        }
        else if(b>a&&b>c)
        {
            l=b;
            if(a>c)
                ml=a;
            else
            {
                ml=c;
            }
        }
        else
        {
            l=c;
            if(a>b)
                ml=a;
            else
            {
                ml=b;
            }
        }
        System.out.println("largest and second largest number of all are : "+l+" "+ml);

    }
}

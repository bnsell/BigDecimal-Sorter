import java.math.BigDecimal;
import java.util.*;

class BigDecSorter{

    public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
		System.out.println("WELCOME TO THE BIG DECIMAL SORTER\nThis program will sort your BigDecimal list descendingly.\n");
		System.out.println("How many items in your list?");
        int n=sc.nextInt();
        String []s=new String[n+2];
		System.out.println("Begin entering BigDecimals to populate your list");
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }

        //BigDecimal Sorting Algorithm
        BigDecimal bg1, bg2;
        for(int i=0;i<s.length-3;i++){
            bg1 = new BigDecimal(s[i]);
            bg2 = new BigDecimal(s[i+1]);
            if(bg1.compareTo(bg2)<0){
                String temp=s[i];
                s[i]=s[i+1];
                s[i+1]=temp;
                if(i<2) i=-1;
                else i=i-2;
            }
        }

        //Output
		System.out.println("\nHere is your sorted BigDecimal list");
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }
}

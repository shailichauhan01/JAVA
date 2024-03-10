import java.util.*;

class Largest{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of element");
        int n=sc.nextInt();

        int []num=new int[n];

        System.out.println("Enter the Numbers:");
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }

        int max=num[0];
        for(int i=1;i<num.length;i++)
        {
            if(num[i]>max)
            max=num[i];
        }
        System.out.println("The Largest number is:"+ max);
    sc.close();
    }
}
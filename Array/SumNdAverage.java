import java.util.*;
class SumNdAverage{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Elements");
        int n=sc.nextInt();
    
        int []num=new int[n];

        System.out.println("Enter the numbers:");
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<num.length;i++)
        {
            sum+=num[i];
        }
        double average=sum/n;

        System.out.println("Sum is:"+ sum);
        System.out.println("Average is:"+ average);

    sc.close();
    }
}
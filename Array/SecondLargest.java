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
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int nums : num) {
            if (nums > largest) {
                secondLargest = largest;
                largest = nums;
            } else if (nums > secondLargest && nums != largest) {
                secondLargest = nums;
            }
        }
        
        System.out.println("The SecondLargest number is:"+ secondLargest);
    sc.close();
    }
}
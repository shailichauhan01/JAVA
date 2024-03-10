import java.util.*;
class Reverse {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of element");
        int n=sc.nextInt();

        int []a=new int[n];

        System.out.println("Enter the Numbers:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        int i,t; 
        for (i = 0; i < n / 2; i++) { 
            t = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = t; 
        } 
  
        System.out.print("Reversed array is: \n"); 
        for (i= 0; i< n; i++) { 
            System.out.print(a[i]+" "); 
        } 
        sc.close();
    }
}

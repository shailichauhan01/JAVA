import java.util.*;

class Largest{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements of array1");
        int n=sc.nextInt();
        int []arr1=new int[n];
        System.out.println("Enter the Numbers:");
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter the number of elements of array2");
        int m=sc.nextInt();
        int []arr2=new int[m]; 
        System.out.println("Enter the Numbers:");
        for(int i=0;i<m;i++) 
        {
            arr2[i]=sc.nextInt();
        }
        int arr3[] = new int[n+m];
        int i = 0;  
        int j = 0;  
        int k = 0;  
        while(i < n && j < m){ 
            if (arr1[i] <= arr2[j]){
                arr3[k++] = arr1[i++];   
            } else {
                arr3[k++] = arr2[j++];   
            }
        }
        while(i < n){   
            arr3[k++] = arr1[i++];   
        }   
        while(j < m){   
            arr3[k++] = arr2[j++];   
        }   
        System.out.println("Array after merging");
        for (i = 0; i < n+m; i++) 
            System.out.print(arr3[i] + " ");
        
        sc.close();
    }
}

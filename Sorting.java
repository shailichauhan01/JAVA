//Array
class Sorting{
    public static void main(String []args)
    {
        int[] arr={55,40,80,65,71};
        int n=arr.length;
        //Printing List Before Sorting
        System.out.println("Given List: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        //Sorting Begin
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i])
                {
                //Swapping Values
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                }
            }
        }
        //Ptinting List After Sorting
        System.out.println("Sorted List:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
/*Problem Statement=>
* 8) Java Program to print the duplicate elements of an array
 */
public class DisplayDuplicateElementInArray
{
    public static void main(String[] args)
    {

        int arr[]=new int[]{1,2,2,4,5,5,1};
        System.out.println("Duplicate elements in given array: ");

        for(int i=0;i<arr.length;i++)
        {
             for(int j=i+1;j<arr.length;j++)
             {
                 if(arr[i]==arr[j])
                 {
                     System.out.println(arr[j]);
                 }
             }
        }
    }
}

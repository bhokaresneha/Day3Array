/* Problem Statement=>
 * 5) Java Program to print the elements of an array present on an even position
 */


public class DisplayElementonEvenPositionArray
{
    public static void main(String args[])
    {
        int arr[]=new int[]{1,2,3,4,5,6};
        System.out.println("Even numbers are");

        //i will start from 1 as first even positioned element is present at position 1.

        for (int i=1;i<arr.length;i=i+2)
        {
            System.out.println(arr[i]);
        }
    }
}

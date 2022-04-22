/* Problem Statement=>
 * 7)Java Program to print the elements of an array present on an odd position
 */


public class DisplayElementonOddPositionArray {
    public static void main(String args[]){
        // i will start from 0 as first odd positioned element is present at position 0.
        int arr[]=new int[]{1,2,3,4,5,6};
        System.out.println("Even numbers are");
        for (int i=0;i<arr.length;i=i+2)
        {
            System.out.println(arr[i]);
        }
    }
}

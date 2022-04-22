/*Problem Statement=>
*3) Java Program to print the largest element in an array
 */
public class LargestElementInArray
{
    public static void main(String[] args)
    {
        //Initialize array
        int [] arr = new int [] {10,50,35,60,4};

        //Initialize max with first element of array.
        int max = arr[0];

        //Loop through the array
        for (int i = 0; i < arr.length; i++) {

            //Compare elements of array with max
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element in the array is : " + max);
    }

}

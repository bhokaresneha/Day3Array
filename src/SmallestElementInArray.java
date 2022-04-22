/*Problem Statement=>
 *3) Java Program to print the smallest element in an array
 */
public class SmallestElementInArray
    {
        public static void main(String[] args)
        {
            //Initialize array
            int [] arr = new int [] {10,50,35,60,4};

            //Initialize max with first element of array.
            int min = arr[0];

            //Loop through the array
            for (int i = 0; i < arr.length; i++)
            {

                //Compare elements of array with max
                if(arr[i] <min)
                    min= arr[i];
            }
            System.out.println("Largest element in the array is : " + min);
        }
    }

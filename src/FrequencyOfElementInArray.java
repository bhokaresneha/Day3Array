/*Problem Statement=>
*2) Java Program to find the frequency of each element in the array

 * */

public class FrequencyOfElementInArray
{
    public static void main(String[] args)
    {
        //Initialize array
        int [] arr1 = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
        //Array arr2 will store frequencies of element
        int [] arr2 = new int [arr1.length];
        int visited = -1;
        for(int i = 0; i < arr2.length; i++){
            int count = 1;
            for(int j = i+1; j < arr1.length; j++){
                if(arr1[i] == arr1[j]){
                    count++;
                    //To avoid counting same element again
                    arr2[j] = visited;
                }
            }
            if(arr2[i] != visited)
                arr2[i] = count;
        }

        //Displays the frequency of each element present in array
;
        System.out.println(" Element | Frequency");

        for(int i = 0; i < arr1.length; i++){
            if(arr2[i] != visited)
                System.out.println("    " + arr1[i] + "       " + arr2[i]);
        }
    }


    }

/** @author: Hard Joshi
* @version: 27.10.2024
*/

public class bubbleSortAlgorithm
{
    //main class to input the unsorted array and call the bubblesort algorithm and print the final sorted array
    public static void main(String[] args) 
    {
        //declaring amd populating the array
        int arry[] ={93,42,51,3,455,20,5,100,5487,87,96,21};

        //calling the bubblesort algorithm method
        bubbleSortAlgo(arry);

        //printing the sorted algorithm
        System.out.println("Sorted Array: ");
        printArray(arry);
    }

    //method to sort the array
    public static void bubbleSortAlgo(int arry_to_be_sorted[])
    {
        int arryLength = arry_to_be_sorted.length;
        boolean swap;

        //using a do-while loop to ensure at least one full pass through the array
        //loop continues until no swaps are made, indicating the array is sorted
        //this will stop the loop once all the elements have been sorted
        //hence, it will reduce the unnecessary loops that it would go through afted being sorted already
        do
        {
            //resetting swap to false after every repeatition
            swap = false;
            
            //traverse the array, comparing each pair of adjacent elements
            for(int i=0; i<arryLength-1; i++)
            {
                //if the current element is greater than the next, swap them
                if(arry_to_be_sorted[i] > arry_to_be_sorted[i+1])
                {
                    int temp = arry_to_be_sorted[i];
                    arry_to_be_sorted[i] = arry_to_be_sorted[i+1];
                    arry_to_be_sorted[i+1] = temp;
                    swap=true; //set swap to true because a swap occurred
                }
            }
        }while(swap); //continue looping if a swap was made in the previous pass
    }

    //method to print the array
    public static void printArray(int arry[])
    {
        int arryLength = arry.length;

        //loop through the array and print each element
        for(int i=0; i<arryLength; i++)
        {
            if(i<arryLength-1)
            {
                //print the element followed by a separator if it's not the last element
                System.out.print(arry[i] + " < ");
            }else
            {
                //print the last element followed by " < END" to indicate the end of the array
                System.out.print(arry[i] + " < END");
            }
            
        }
    }
}

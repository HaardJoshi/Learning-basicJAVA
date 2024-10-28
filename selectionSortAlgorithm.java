/** @author: Hard Joshi
* @version: 27.10.2024
*/
public class selectionSortAlgorithm 
{
    //main class to input the unsorted array and call the bubblesort algorithm and print the final sorted array
    public static void main(String[] args) 
    {
        //declaring amd initialising the array
        int arry[] = {10, 33, 28, 5, 63, 224, 6978, 96, 57};

        //calling the selection-sort algorithm method
        selectionSortAlgo(arry);

        //printing the sorted algorithm
        System.out.println("Sorted Array: ");
        printArray(arry);
    }

    //method to sort the array
    public static void selectionSortAlgo(int arry_to_be_sorted[])
    {
        int arryLength = arry_to_be_sorted.length;
        for(int i=0; i<arryLength-1; i++)
        {
            //assuming that the first unsorted element is the smallest
            int minIndex = i;

            //finding the smallest element in the rest of the array
            for(int j=i+1; j<arryLength; j++)
            {
                //finding the smallest element in the entire array
                if(arry_to_be_sorted[j] < arry_to_be_sorted[minIndex])
                {
                    minIndex = j; //updating minIndex if a smaller element is found
                }
            }
            //swapping the found minimum element with the first unsorted element
            int temp = arry_to_be_sorted[minIndex];
            arry_to_be_sorted[minIndex] = arry_to_be_sorted[i];
            arry_to_be_sorted[i] = temp;
        }
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

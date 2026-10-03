//sky.perez@malad.us
//for CTE software development 1
//instructor Mr. Gross
public class BubbleSort {
    public static int [] swapTwoArrayElements(int[] arrayToSwap, int lowerindex) {
        int temp;
        temp = arrayToSwap[lowerindex];
        arrayToSwap[lowerindex]=arrayToSwap[lowerindex+1];
            arrayToSwap[lowerindex+1]=temp;
            return arrayToSwap;
    }
    public static void main(String[] args) {
        int[] arrayToSort = {5, 2, 9, 1, 4, 6, 3, 4, 44, 5, 67, 96, 999, 965, 043, 456, 85, 7, 888}; //Creates an array of numbers to be sorted
        boolean doSwap;
        do {
            doSwap = false;
            for (int lowerindex = 0; lowerindex < arrayToSort.length - 1; lowerindex++) {
                if (arrayToSort[lowerindex] > arrayToSort[lowerindex + 1]) {
                    //Swap
                    swapTwoArrayElements(arrayToSort, lowerindex, lowerindex + 1);
                    doSwap = true;
                }
            }
        } while (doSwap);
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + " "); //Prints sorted array
        }
    }
    public static void swapTwoArrayElements(int[] array, int first, int second) {//Method used to swap two elements in the array
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}

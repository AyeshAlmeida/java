package ayesh.sorting;

import ayesh.sorting.utils.SortHelper;

public class Bubble {

    public static void Sort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    SortHelper.Swap(array, j ,j+1);
                }
            }
        }
    }

}

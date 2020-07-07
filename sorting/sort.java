package sorting;

public class sort{

    /*
    Best-Case: O(n^2)
    Average-Case:O(n^2)
    Worse-Case: O(n^2)
    comparisions are always the same
    Stability: No, impossible to determine which items came before and after swaps
    Memory: O(1)
    */
    public int[] selectionSort(int[] array){
        int min;
        for(int i=0;i<array.length-1;i++){
            min = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min = j;
                }
            }
            swap(i,min,array);
            printArray(array);
        }
        return array;
    }
    /*
    Best-Case: O(n)
    Average-Case:O(n^2)
    Worse-Case: O(n^2), Array is in reverse order, 
    n-1 comparisions then n-2 comparision then n-3 etc.

    Stability: Yes 
    Memory: O(1)
    */
    public int[] bubbleSort(int[] array){
        boolean swapped = true;

        while(swapped){
            swapped = false;
        
            for(int i=0;i<array.length-1;i++){
                if(array[i+1]<array[i]){
                    swap(i+1,i,array);
                    swapped = true;
                }    
            }
            printArray(array);
        }
        return array;
    }

    /*
    Best-Case: O(n)
    Average-Case:O(n^2)
    Worse-Case: O(n^2), elements are in reverse order
    the second element needs to shuffle once, the next shuffle twice and etc, sum from 1 to n
    Stability: Yes, need to be careful A[j]>val and not A[j]≥val
    Memory: O(1)
    */
    public int[] insertionSort(int[] array){
        int val;
        int j,i;
        for(i=1;i<array.length;i++){
            val = array[i];
            j = i-1;
            while(j>=0 && array[j]>val){
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = val;
            printArray(array);
        }
        return array;
    }



    public int[] mergeSort(int[] array){
        if(array.length<2){
            return array;
        }
        int[] farray = new int[array.length/2];
        int[] sarray = new int[array.length/2];
        divide(farray,sarray,array);
        farray = mergeSort(farray);
        sarray = mergeSort(sarray);
        merge(farray,sarray,array);
        return array;
    }

    private void divide(int[] farray,int[] sarray,int[] array){
        int i;
        for(i=0;i<=array.length/2 -1;i++){
            farray[i] = array[i];
        }
        for(i=array.length/2;i<array.length;i++){
        
            sarray[i-array.length/2] = array[i];
        }
    }

    private void merge(int[] farray,int[] sarray,int[] array){
        int j = 0;
        int i = 0;
        while(i<farray.length && j<sarray.length){
            if(farray[i]<sarray[j]){
                array[i+j] = farray[i];
                i = i + 1;
            }else{
                array[i+j] = sarray[j];
                j = j + 1;
            }
        }
        while(i<farray.length){
            array[i+j] = farray[i];
            i = i + 1;
        }
        while(j<sarray.length){
            array[i+j] = sarray[j];
            j = j + 1;
        }
        printArray(array);
    }


    private void swap(int i, int min,int[] array){
        int temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }

    private void printArray(int[] array){
        String sum = "";

        for(int i=0;i<array.length;i++){
            sum+=array[i]+", ";
        }
        System.out.println(sum);
    }




}
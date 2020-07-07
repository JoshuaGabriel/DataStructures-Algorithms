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



    /*
    Best-Case: O(nlogn) always the same even if array is sorted
    Average-Case: O(nlogn)
    Worst-Case: O(nlogn)

    Stability: Yes - on merge, choose element from array1 where there is a tie
    Memory: O(n) sized array to temporarily hold elements (call stack also takes memory)
    The number of times we split and merge is O(n) bound by O(logn) thus O(nlogn) for worse case
    */
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

    /*
    Best-case: O(nlogn)
    Average-case: O(nlogn)
    Worse-case: O(n^2)
    Stability: Yes, but must be careful as it depends on how the pivot 
    is chosen and how the swaps are done
    Memory: if done like merge sort O(n) but inplaceQuicksort is O(1)
    */
    public void quickSort(int[] array){        
        inplaceQuickSort(array,0,array.length-1);
    }

    private void inplaceQuickSort(int[] array,int low,int high){
        if(low<high){
            int pi = partition(array, low, high);
            inplaceQuickSort(array, low, pi-1);
            inplaceQuickSort(array, pi+1, high);
        }
    }

    private int partition(int[] array,int low,int high){
        int pivot = array[high];
        int i = low-1;
        for(int j=low;j<=high-1;j++){
            if(array[j]<pivot){
                i++;
                swap(i,j,array);
            }
        }
        swap(i+1,high,array);
        printArray(array);
        return i+1;
    }

    public void bentleyQuicksort(int[] array){
        bentleyHelper(array,0,array.length-1);
    }
    private void bentleyHelper(int[] array,int low,int high){
        int i,pi;
        
        if(low>=high){
            return;
        }
        pi = low;
        for(i=low+1;i<=high;i++){
            if(array[i]<array[low]){
                pi = pi + 1;
                swap(pi,i,array);
            }
        }
        swap(low,pi,array);
        printArray(array);
        bentleyHelper(array, low, pi-1);
        bentleyHelper(array, pi+1, high);
        
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
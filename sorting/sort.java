package sorting;

public class sort{


    public int[] selectionSort(int[] array){
        int min;
        for(int i=0;i<array.length-2;i++){
            min = i;
            for(int j=i+1;j<array.length-1;j++){
                if(array[j]<array[min]){
                    min = j;
                }
            }
            swap(i,min,array);
            printArray(array);
        }
        return array;
    }
    private void swap(int i, int min,int[] array){
        int temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }

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

    private void printArray(int[] array){
        String sum = "";

        for(int i=0;i<array.length;i++){
            sum+=array[i]+", ";
        }
        System.out.println(sum);
    }




}
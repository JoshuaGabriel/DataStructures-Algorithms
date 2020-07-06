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
        }
        return array;
    }
    private void swap(int i, int min,int[] array){
        int temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }
}
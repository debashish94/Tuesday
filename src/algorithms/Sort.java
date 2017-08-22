package algorithms;

public class Sort {

    public static void main(String[] args) {

        int[] array = {20, 12, 10, 15, 2};

        bubbleSort(array);

        for(int n: array){
            System.out.println(n);
        }

    }

    public static int[] insertionSort(int[] array){
        int[] list = array;
        //implement here
        for(int i=1; i < array.length; i++){
            for(int j=i; j > 0; j--){
                if(array[j] < array[j-1]){ //if its smaller than the index before, then swap
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        return list;
    }

    public static int[] selectionSort(int[] array){
        int[] list = array;

        for(int i=0; i < array.length; i++){
            for(int j=i+1; j < array.length; j++){
                if(array[j] < array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return list;
    }

    public static int[] bubbleSort(int[] array){
        int[] list = array;
        for(int i=0; i < array.length; i++){
            for(int j=1; j < array.length - i; j++){
                if(array[j-1] > array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return list;
    }



}

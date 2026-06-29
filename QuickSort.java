public class QuickSort {

    public static int partition(int[] arr, int start, int end){
        int idx = start - 1;
        int pivot = arr[end];

        for(int j = start ;j<end;j++){
            if(pivot>=arr[j]){
                idx++;
                //swap
                int temp= arr[j];
                arr[j] = arr[idx];
                arr[idx] = temp;
            }
        }
        idx++;
        //swap pivot taki correct idx mile
        int temp= arr[idx];
        arr[idx] = arr[end];
        arr[end] = temp;

        return idx;

    }

    public static void quickSort(int[] arr, int start, int end){
        if(start<end){
            int pivotIdx = partition(arr,start,end);

            quickSort(arr, start, pivotIdx-1);
            quickSort(arr, pivotIdx+1, end);
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,31,35,8,32,17};

        System.out.println("Unsorted : ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        quickSort(arr, 0, arr.length-1);

        System.out.println("sorted : ");
        for(int num : arr){
            System.out.print(num + " ");
        }


    }
}

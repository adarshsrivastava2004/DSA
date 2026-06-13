public class Sorting{

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    // agr phle wala element bda h to usko swap krdo
                    //tc: O(n^2),sc: O(1),in-place yes, stable yes
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[] arr){
        
    }
    public static void insertionSort(int[] arr){
        
    }



    public static void main(String[] args){
        int[] arr = {5, 2, 9, 1, 5, 6};

        bubbleSort(arr);
        System.out.print("Sorted array by Bubble Sort: ");
        for(int i : arr){
            System.out.print(i + " ");
        }

        selectionSort(arr);
        // System.out.print("\nSorted array by Selection Sort: ");
        // for(int i : arr){
        //     System.out.print(i + " ");
        // }

        insertionSort(arr);
        // System.out.print("\nSorted array by Insertion Sort: ");
        // for(int i : arr){
        //     System.out.print(i + " ");
        // }
    }
}
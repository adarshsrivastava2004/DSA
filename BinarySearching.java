public class BinarySearching{


    public static int binarySearch(int[] arr , int target){
        int st = 0;
        int end = arr.length-1;


        while(st<=end){
            //mid nikalo
            int mid = st + ((end-st)/2);
            //agr mid pr hi mil jaye toh idx return
            if(arr[mid]==target){
                return mid;
            }
            // agr mid se chota toh left part scan
            if(arr[mid]>target){
                end= mid - 1;
            }
            //agr mid se bda toh right part scan
            else{
                st = mid + 1;
            }
        }
        //agr khi nhi toh -1
            return -1;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 10;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
}
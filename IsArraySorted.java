public class IsArraySorted {
    public static boolean isArraySorted(int[] arr){
        int n = arr.length;
        
        // if(n<2){
        //     return true;
        // }

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2};
        System.out.println(isArraySorted(arr));
    }
}

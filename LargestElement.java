public class LargestElement{

    public static int largest(int[] arr){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int[] arr = {
    Integer.MAX_VALUE
};
        System.out.println(largest(arr));
    }
}
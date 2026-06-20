public class LongestSubarrayWithGivenSumZero{

    public static int longestSubArray(int[] arr){
        int n = arr.length;

        int maxSize =0;

        for(int i=0;i<n-1;i++){
            int sum =0;
            for(int j=i;j<n;j++){
                sum+=arr[j];

                if(sum==0){
                    maxSize = Math.max(maxSize, j-i+1);
                }
            }
        }
        if(maxSize==0){
            return 0;
        } else{
            return maxSize;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, -2, 2, -8, 1, 7, 4, -10};
        System.out.println(longestSubArray(arr));
    }
}
public class LongestSubarrayWithGivenSumK {

    public static int longestSubArray(int[] arr, int k){
        int n = arr.length;
        int maxSize =0;

        for(int i=0;i<n-1;i++){
            int j=i+1;
            while(j<n){
                int sum=0;
                int size =0;
                for(int l=i;l<=j;l++){
                    sum+=arr[l];
                    size++;
                }
                // System.out.println("sum "+sum);
                // System.out.println("size "+size);
                if(sum==k){
                    maxSize = Math.max(maxSize,size);
                    // System.out.println("maxSize "+maxSize);
                }
                j++;
            }
            // System.out.println("I "+i + " Complete");
        }
        if(maxSize==0){
            return 0;
        } else{
            return maxSize;
        }
    }
    public static void main(String[] args) {
        int[] arr = {-5, 8, -14, 2, 4, 12};
        System.out.println(longestSubArray(arr,-5));
    }
}

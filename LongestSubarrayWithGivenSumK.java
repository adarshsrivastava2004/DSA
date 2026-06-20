public class LongestSubarrayWithGivenSumK {

    public static int longestSubArray(int[] arr, int k){

        // //tc = O(n-2)*O(n-1)*O(j-i+1)
        // //sc = O(1) but lets optimize it
        // int n = arr.length;
        // int maxSize =0;

        // for(int i=0;i<n-1;i++){
        //     int j=i;
        //     while(j<n){
        //         int sum=0;
        //         int size =0;
        //         for(int l=i;l<=j;l++){
        //             sum+=arr[l];
        //             size++;
        //         }
        //         // System.out.println("sum "+sum);
        //         // System.out.println("size "+size);
        //         if(sum==k){
        //             maxSize = Math.max(maxSize,size);
        //             // System.out.println("maxSize "+maxSize);
        //         }
        //         j++;
        //     }
        //     // System.out.println("I "+i + " Complete");
        // }
        // if(maxSize==0){
        //     return 0;
        // } else{
        //     return maxSize;
        // }


        //sliding window not work for negative numbers
        //tc = O(n)
        //sc = O(1)

        int n = arr.length;

        int maxSize =0;

        int left = 0, right = 0;

        int sum = arr[0];

        while(right<n){

            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }

            if(sum==k){
                maxSize=Math.max(maxSize, right-left+1);
            }

            right++;

            if(right<n){
                sum+=arr[right];
            }

        }
        return maxSize;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        System.out.println(longestSubArray(arr,15));
    }
}

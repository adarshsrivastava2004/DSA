public class MaximumSubarraySumInAnArray{

    public static int maximumSubarraySumInAnArray(int[] arr){
        int n = arr.length;
        int sum =0;
        int maxSum=0;
        int ans = 0;

        int start = 0;

        int ansStart = -1, ansEnd = -1;

        for(int i=0;i<n;i++){

            
            sum+=arr[i];
            if(sum<0){
                sum=0;
            } else {
                maxSum = Math.max(maxSum,sum);
            }
        }
        if(maxSum==0){
            int largest = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]>largest){
                    largest=arr[i];
                }
                ans = largest;
            }
        }
        else {
            ans = maxSum;
        }  
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        System.out.println(maximumSubarraySumInAnArray(arr));
    }
}
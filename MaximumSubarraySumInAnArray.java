public class MaximumSubarraySumInAnArray{

    public static int maximumSubarraySumInAnArray(int[] arr){
        int n = arr.length;
        int sum =0;
        int maxSum=0;
        int ans = 0;

        int start = 0;

        int ansStart = -1, ansEnd = -1;

        for(int i=0;i<n;i++){

            if(sum==0){
                start = i;
            }
            sum+=arr[i];
            if(sum>maxSum){
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }
            
            if(sum<0){
                sum=0;
        }
    }
    System.out.print("The subarray is: [");
    for (int i = ansStart; i <= ansEnd; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println("] with sum: " + maxSum);
    return maxSum;
}
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4 };
        maximumSubarraySumInAnArray(arr);
    }
}
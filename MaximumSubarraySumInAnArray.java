public class MaximumSubarraySumInAnArray{

    public static int maximumSubarraySumInAnArray(int[] arr){
        int n = arr.length;
        int sum =0;
        int maxSum=0;
        // int ans = 0;

        int start = 0;

        int ansStart = -1, ansEnd = -1;

        for(int i=0;i<n;i++){
            //sum zero hoga toh start i se update hoga kyuki initially sum zero h...
            if(sum==0){
                start = i;
            }

            //fir arr k help se next element ko sum me add krenge...
            sum+=arr[i];

            //agr sum maxSum se jada h toh jahir si bt h ki start hmara sum=0 se hua h ar end jha tk maxSum hume milega..mtlb maxSum jha tk sbse jada tha wha tk ka array ka array lena h..
            if(sum>maxSum){
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }
            
            //agr sum < 0 h mtlb negative h toh usko agr positive me add kreneg toh uski value km rhegi compare to array agr hum positive number se start kre...
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
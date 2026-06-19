public class MissingInArray {

    public static int missing(int[] arr){
        long n = arr.length +1;
        long sum = (n*(n+1))/2;
        
        // System.out.println("sum "+ sum);
        long arrSum =0;
        for( int i=0;i<n-1;i++){
            arrSum+=arr[i];
        }
        return (int)(sum-arrSum);
            // if(n==0){
            //     return 1;
            // }
            // else if(n==1){
            //     return arr[0]+1;
            // }
            // else {

            //     int lar=arr[0];
            //     for( int i=0;i<n;i++){
            //         if(arr[i]>lar){
            //             lar = arr[i];
            //         }
            //     }
            //     System.out.println("lar " + lar);

            //     int sum = (lar * (lar + 1)) / 2;
            //     System.out.println("sum "+ sum);
            //     int arrSum =0;

            //     for( int i=0;i<n;i++){
            //         arrSum+=arr[i];
            //     }

            //     System.out.println("arrSum "+arrSum);

            //     return sum-arrSum;
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 1, 4};
        System.out.println(missing(arr));
    }
}

public class LongestConsecutiveSequence {

    public static boolean linearSearch(int[] arr,int k){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                return true;
            }
        }
        return false;
    }
    public static int longestConsecutiveSequence(int[] arr){
        int n = arr.length;
        int longest = 1;


        for(int i =0;i<n;i++){
            int x = arr[i];
            int count = 1;

            while(linearSearch(arr,x+1)==true){
                x+=1;
                count++;
            }
            longest = Math.max(count,longest);
        }
        return longest;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,0,1,2};

        System.out.println(longestConsecutiveSequence(arr));
        
    }
}

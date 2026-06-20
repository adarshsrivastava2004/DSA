import java.util.HashMap;

public class SubarraySumEqualsKCount {
    public static int subarraySum(int[] nums, int k) {
        int n=nums.length;

        HashMap<Integer,Integer> mp = new HashMap<>();

        int res = 0;

        int cummS =0;

        mp.put(0,1);

        //cummSum nikalo
        for(int i=0;i<n;i++){
            cummS+=nums[i];
            //agr map me diff avaialable h toh result me uski value ko add kr do..
            if(mp.containsKey(cummS-k)){
                res+=mp.get(cummS-k);
            }

            //agr sum ka diff mp me available nhi h toh usko mp me available krao ya available value ko update kro...

            mp.put(cummS,mp.getOrDefault(cummS,0)+1);
        }

        return res;

    }

    public static void main(String[] args) {
        int[] arr = {1,-1,0};
        System.out.println(subarraySum(arr, 0));
    }
}

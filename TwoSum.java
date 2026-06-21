import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();
        // System.out.println("Map "+map);

        for(int i=0;i<n;i++){
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
                // System.out.println("Contain nhi h tb " + map);
            } else {

                arr[0] = map.get(target-nums[i]);
                // System.out.println("arr[0] " + arr[0]);
                arr[1] = i;
                // System.out.println("arr[1] " + arr[1]);
                
            }


        }
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]+nums[j]==target){
        //             arr[0]=i;
        //             arr[1]=j;
        //         }
        //     }
        // }
        // System.out.println("Array "+ arr);
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 9;
        // to print:
        // [0, 1]
        // But it won't.
        // For arrays, Java prints the object's memory reference:
        // [I@76ed5528
        // where:
        // [ = array
        // I = int array
        // @76ed5528 = hashcode
        // Correct way to print an array
        // System.out.println(Arrays.toString(twoSum(arr, target)));

        
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
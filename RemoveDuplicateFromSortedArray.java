public class RemoveDuplicateFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=1;

        while(i<n-1 && j<n){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                int temp = nums[i+1];
                nums[i+1]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,5,5,7,7,8,8,8,8,8,9,9,9,9,10};
        System.out.println(removeDuplicates(arr));
    }
}


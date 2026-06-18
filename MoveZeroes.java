import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int i=0,j=1;
        int n=nums.length;
        if(n==0){
            return;
        }

        while(i<n-1 && j<n){
            if(nums[i]==0 && nums[j]!=0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
            else if(nums[i]==0 && nums[j]==0){
                j++;
            }
            else if(nums[i]!=0 && nums[j]==0){
                i++;
                j++;
            }
            else{
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}

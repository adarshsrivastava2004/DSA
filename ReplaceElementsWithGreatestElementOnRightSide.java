import java.util.*;

public class ReplaceElementsWithGreatestElementOnRightSide{

    public static int[] replaceElements(int[] arr) {

        int n = arr.length;
        int[] nums = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        

        for(int i=0;i<n;i++){
            int largest = Integer.MIN_VALUE;
            for(int j = i+1;j<n;j++){
                if(arr[j]>largest){
                    largest = arr[j];
                }
            }
            if(largest == Integer.MIN_VALUE){
                list.add(-1);
            }
            else{
                list.add(largest);
            }    
        }
        nums = list.stream().mapToInt(Integer::intValue).toArray(); 
        return nums;
    }

    public static void main(String[] args) {

        int[] arr = {7,7,7};



        int[] ans  = replaceElements(arr);

        

        System.out.println(Arrays.toString(ans));




        
    }
}
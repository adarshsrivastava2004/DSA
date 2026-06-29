import java.util.ArrayList;
// import java.util.HashMap;
import java.util.List;
// import java.util.Map;

public class MajorityElementII {
    public static List<Integer> majorityElementII(int[] arr){
        // Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        int n = arr.length;
        

        for(int i=0; i<n; i++){
            int count = 1;

            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/3){
                list.add(arr[i]);
            }
        }



        // for(int num : arr){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }

        // for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        //     int value = entry.getValue();
        //     int key = entry.getKey();

        //     if(value>n/3){
        //         list.add(key);
        //     }
        // }

        return list;
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 1, 3, 2};

        System.out.println(majorityElementII(arr));
        
    }
}

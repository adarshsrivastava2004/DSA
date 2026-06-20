import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        //hashmap wala solution... hr ek ka freq count store then value jiska one uska key return 
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = 0;
        for(int num :nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(value==1){
                n = key;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3};
        SingleNumber s1 = new SingleNumber();
        System.out.println(s1.singleNumber(arr));
    }
}

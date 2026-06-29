import java.util.*;

public class RearrangeArrayElementsBySign{
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        

        // int idx = 0;

        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                list1.add(nums[i]);
            } else {
                list2.add(nums[i]);
            }
        }
        System.out.println("List1 "+ list1);
        System.out.println("List2 "+ list2);

        System.out.println("Size list1 "+ list1.size());
        System.out.println("Size list2 "+ list2.size());

        for(int i=0;i<list1.size();i++){

            list3.add(list1.get(i));
            list3.add(list2.get(i));
            // if(i%2==0){
            //     for(int list : list1){
            //         list3.add(list);
            //         System.out.println("Evn list : "+ list3);
            //     }
            // } else {
            //     for(int list : list2){
            //         list3.add(list);
            //         System.out.println("odd list "+list3);
            //     }
            // }
        }

        // for(int list : list2){
        //     list3.add(list);
        //     System.out.println("list3 with even "+ list1);
        // }

        // for(int list : list2){
        //     list3.add(list);
        //     System.out.println("list3 with odd "+ list2);
        // }

        // while(idx<(list1.size()+list2.size())){
        //     if(idx%2==0){
        //         for(int j=0;j<list1.size();j++){
        //             list3.add(list1.get(j));
        //             System.out.println("even list3 add with list1 : " + list3);
        //         }  
        //     } else {
        //         for(int j=0;j<list2.size();j++){
        //             list3.add(list2.get(j));
        //             System.out.println("odd list3 add with list2 : " + list3);
        //         }  
        //     }
        //     idx++;
        // }
        System.out.println("list 3 : " + list3);

        arr = list3.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Arr " + arr);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        rearrangeArray(arr);
    }
}
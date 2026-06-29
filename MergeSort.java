import java.util.*;
public class MergeSort{

    public static void merge(List<Integer> result, int st, int mid, int end){
        List<Integer> temp = new ArrayList<>();

        int i =st;
        int j =mid+1;

        while(i<=mid && j<=end){
            if(result.get(i)>=result.get(j)){
                temp.add(result.get(j));
                j++;
            } else {
                temp.add(result.get(i));
                i++;
            }
        }

        while(i<=mid){
            temp.add(result.get(i));
            i++;
        }
        while(j<=end){
            temp.add(result.get(j));
            j++;
        }

        for(int idx=0; idx<temp.size(); idx++){
            result.set(idx+st,temp.get(idx));
        }


    }

    public static void mergeSort(List<Integer> result ,int start , int end){

        if(start<end){
            int mid = start + (end-start)/2;



            mergeSort(result, start, mid);
            mergeSort(result, mid + 1, end);

            merge(result,start,mid,end);

        }
        


    }
    public static void main(String[] args) {

        List<Integer> result = new ArrayList<>();
        
        result.add(12);
        result.add(31);
        result.add(35);
        result.add(8);
        result.add(32);
        result.add(17);
        
        System.out.println("Before sorting : ");
        for(int num:result){
            System.out.print(num + " ");
        }
        System.out.println();

        mergeSort(result, 0, result.size()-1);

        System.out.println("After sorting : ");
        for(int num:result){
            System.out.print(num + " ");
        }

        
    }
}
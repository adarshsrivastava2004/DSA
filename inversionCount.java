import java.util.*;

public class inversionCount {

    public static int merge(List<Integer> result, int start,int mid, int end){
        List<Integer> temp = new ArrayList<>();

        int i = start;
        int j = mid+1;
        int invCount = 0;

        while(i<=mid && j<=end){
            if(result.get(i)<=result.get(j)){
                temp.add(result.get(i));
                i++;
            } else {
                temp.add(result.get(j));
                j++;
                invCount += mid-i+1;
            }
        }

        while(i<=mid){
            temp.add(result.get(i));
            i++;
        }

        while (j<=end) {
            temp.add(result.get(j));
            j++;
        }

        for(int idx =0;idx<temp.size();idx++){
            result.set(idx+start,temp.get(idx));
        }

        return invCount;
    
    }

    public static int mergeSort(List<Integer> result, int start, int end ){
        if(start<end){
            int mid = start + (end-start)/2;
            int leftCount = mergeSort(result, start, mid);
            int rightCount = mergeSort(result, mid+1, end);

            int invCount = merge(result,start,mid,end);

            return leftCount + rightCount + invCount;


        }
        return 0;
    }
    

    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        
        result.add(6);
        result.add(3);
        result.add(5);
        result.add(2);
        result.add(7);

        int inversionCount = mergeSort(result,0,result.size()-1);

        System.out.println("Inversion count  = " + inversionCount);
    }
}

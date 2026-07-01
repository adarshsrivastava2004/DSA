

public class lowerBound{

    public static int lowerBound(int N, int[] arr, int x){
        for(int i=0;i<N;i++){
            if(arr[i]>=x){
                return i;
            }
        }
        return N;
    }
    public static void main(String[] args) {

        int[] arr = {3,5,8,15,19};
        System.out.println(lowerBound(5, arr, 9));
        
    }
}

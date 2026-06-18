import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateRightArray {

    public static void rotateRight(int[] arr,int k){
        int n= arr.length;
        if(n==0){
            return;
        }

        k=k%n;
        //temp store and copy from orginal to temp
        int[] temp = new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[n-k+i];
        }
        // shifting in original
        for(int i=n-k-1;i>=0;i--){
            arr[i+k]=arr[i];
        }
        //copy from temp to original
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotateRight(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}

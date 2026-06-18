public class LeftRotateArrayByOnePlace {

    public static void leftRotateArrayByOnePlace(int[] arr){
        int n = arr.length;

        //better to return for empty or one in this case
        if(n<2){
            // System.out.println("Already rotated");
            return;
        }
        else{
        int a = arr[0];

        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }

        arr[n-1]= a;

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    }
    public static void main(String[] args) {
        int[] arr = {1};
        leftRotateArrayByOnePlace(arr);
    }
}

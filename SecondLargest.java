public class SecondLargest{

    public static int secondLargest(int[] arr){
        int n = arr.length;
        int lar = Integer.MIN_VALUE;
        int secLar = Integer.MIN_VALUE;
        // boolean found = false;
        //ek br largest nikalo fir sec iteration me secLar


        if(n<2){
            return -1;
        }

        //largest and seclar in the 1st iteration
        for(int i=0;i<n;i++){
            if(arr[i]>lar){
                secLar=lar;
                lar=arr[i];
            }
            if(arr[i]>secLar && arr[i]!=lar){
                secLar=arr[i];
            }

        }

        //secLargest
        // for(int i=0;i<n;i++){
        //    if(arr[i]>secLar && arr[i]!=lar){
        //         secLar=arr[i];
        //         // found= true;
        //     }
        // }


        //yeh case kam nhi krega agr actual me arr me - infinity aa jaye toh... iske liye hume flag found use kr lena chaiye..
        //abhi bhi int[] arr = {Integer.MIN_VALUE, Integer.MIN_VALUE} kam nhi krega..
        // agr n=0 ya n=1 toh automatically -1 return

        
        // if(secLar==Integer.MIN_VALUE){
        //     return -1;
        // }
        // else{
        //     return secLar;
        // }
        // if(found){
        //     return secLar;
        // }
        // else{
        //     return -1;
        // }
        return secLar;
    }

    public static void main(String[] args){
        int[] arr = {5, 5, 5};

        System.out.println(secondLargest(arr));
    }
}
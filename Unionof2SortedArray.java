import java.util.*;

public class Unionof2SortedArray{

    public static ArrayList<Integer> findUnion(int[] a, int[] b){

        int n = a.length;
        int m = b.length;
        //set unordered hoga agr hashset ka use kra toh isiliye treeset use kr lena chaiye as treeset ordered with unique hota h..
        // Set<Integer> set = new TreeSet<>();

        // for(int i=0;i<n;i++){ // tree set single time complexity O(logn) so here for n we have O(nlogn) 
        //     set.add(a[i]);
        // }

        // System.out.println(set + "-----------\n");

        // for(int i=0;i<m;i++){
        //     set.add(b[i]);  // we have O(mlogn) 
        // }

        // System.out.println(set + "-----------\n");

        // ArrayList<Integer> union = new ArrayList<>(set);// tc for converting set to list = O(n+m)
        //  //space = for set O(n+m) 


        // return union;

        ArrayList<Integer> union = new ArrayList<>();
        
        int i=0,j=0;
        
        while(i<n && j<m){
            //jb a[i] chota hoga toh a[i] add kro ar iterator + kro
            if(a[i]<b[j]){
                if((union.isEmpty()) || (union.get(union.size()-1)!=a[i])){
                    union.add(a[i]);
                }
                i++;
            }
            //jb b[i] chota hoga toh b[i] add kro ar iterator + kro
            else if(a[i]>b[j]) {
                if((union.isEmpty()) || (union.get(union.size()-1)!=b[j])){
                    union.add(b[j]);
                }
                j++;
            //jb dono brabr hoga toh koi bhi add kro ar dono iterator + kro
            } else{
                if((union.isEmpty()) || (union.get(union.size()-1)!=a[i])){
                    union.add(a[i]);
                }
            i++;
            j++;
            }
            
        }
        
        // ab agr kisi array ka element khtm ho gya tb ek particular array ka element lgatrr check k sath add krna hoga..
            //phle a[i]
        while(i<n){
            if((union.isEmpty()) || (union.get(union.size()-1)!=a[i])){
                union.add(a[i]);
            }
        i++;
        }
            
        //phir b[i]
        while(j<m){
            if((union.isEmpty()) || (union.get(union.size()-1)!=b[j])){
                union.add(b[j]);
            }
            j++;
        }


        return union;
    }
    public static void main(String[] args) {
        int[] a = {4, 5, 8 ,8, 8, 11, 14, 15, 17, 20};
        int[] b = {1, 4, 4, 7};

        System.out.println(findUnion(a, b));
    }
}
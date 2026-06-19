import java.util.*;

public class Unionof2SortedArray{

    public static ArrayList<Integer> findUnion(int[] a, int[] b){

        int n = a.length;
        int m = b.length;
        //set unordered hoga agr hashset ka use kra toh isiliye treeset use kr lena chaiye as treeset ordered with unique hota h..
        Set<Integer> set = new TreeSet<>();

        for(int i=0;i<n;i++){
            set.add(a[i]);
        }

        System.out.println(set + "-----------\n");

        for(int i=0;i<m;i++){
            set.add(b[i]);
        }

        System.out.println(set + "-----------\n");

        ArrayList<Integer> union = new ArrayList<>(set);


        return union;
    }
    public static void main(String[] args) {
        int[] a = {4, 5, 8 ,8, 8, 11, 14, 15, 17, 20};
        int[] b = {1, 4, 4, 7};

        System.out.println(findUnion(a, b));
    }
}
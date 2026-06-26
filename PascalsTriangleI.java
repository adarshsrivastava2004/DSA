import java.util.*;

public class PascalsTriangleI {

    public static List<List<Integer>> generate(int numScore){

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<numScore;i++){
            List<Integer> row = new ArrayList<>();

            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                } else {
                    int num = result.get(i-1).get(j) + result.get(i-1).get(j-1);
                    row.add(num);
                }
            }
            result.add(row);
        }


        return result;
    }


    public static void main(String[] args) {

        System.out.println(generate(10));
        
    }
    
}

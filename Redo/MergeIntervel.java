package Redo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervel {
    public int[][] merge(int[][] inter) {
        Arrays.sort(inter,Comparator.comparingInt(i->i[0]));
        // System.out.println(Arrays.toString(inter));
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<inter.length;i++){
            if(ans.size()!=0){
                int laststart = ans.getLast().get(0);
                int lastend = ans.getLast().get(1);
                if(laststart<=inter[i][0] && lastend>=inter[i][1])
                    continue;
            }
            
            int start = inter[i][0];
            int end = inter[i][1];
            for(int j=i+1;j<inter.length;j++){
                if(inter[j][0]>=inter[i][0] && inter[j][0]<=inter[i][1] && inter[j][1]>=inter[i][1]){
                    // System.out.println("Came here");
                    end = inter[j][1];
                    i=j;
                }
                else if(inter[j][0]>inter[i][1]){
                    i=j-1;
                    break;
                }
            }
            List<Integer> range = new ArrayList<>();
            range.add(start);
            range.add(end);
            ans.add(range);
        }
        int[][] intArray = ans.stream().map(u -> u.stream().mapToInt(x -> x).toArray()).toArray(int[][]::new);
        return intArray;
        
    }

    public static void test(){
        int[] arr = new int[]{0, 1, 1, -1, 0, 0, -1, 0, 1, 0, -1, 0, 0, 0, 0, 1, 0, 0, -1};

        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
    }
}
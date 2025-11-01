package LeetCodePractice.challengr75Problem;

import java.util.ArrayList;
import java.util.List;

public class LC_2352_Equal_Row_and_Column_Pairs {
	
	public int equalPairs(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        
        List<List<Integer>> listRows = new ArrayList<>();

        for(int i=0;i<n;i++){
            List<Integer> rows = new ArrayList<>();
            for(int j=0;j<m;j++){
                rows.add(grid[i][j]);
            }
            listRows.add(rows);
        }

        List<List<Integer>> listColms = new ArrayList<>();

        for(int i=0;i<m;i++){
               List<Integer> colms = new ArrayList<>();
            for(int j=0;j<n;j++){
                colms.add(grid[j][i]);
            }
            listColms.add(colms);
        }

        int count =0;

        for(List<Integer> row:listRows){
            for(List<Integer> col:listColms){
                if(row.equals(col)){
                    count++;
                }
            }
        }

        return count ;
    }

}

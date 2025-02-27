package Arrays;

import java.awt.color.ICC_ColorSpace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class rotateMatrix {
    public static List<List<Integer>> rotateMatrix(List<List<Integer>> matrix){
        int n = matrix.size();

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix.get(i).get(j);
                matrix.get(i).set(j, matrix.get(j).get(i));
                matrix.get(j).set(i, temp);
            }
        }

        for(List<Integer> row : matrix){
            Collections.reverse(row);
        }

        return matrix;
    }

    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        matrix.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        matrix.add(new ArrayList<>(Arrays.asList(7, 8, 9)));


        List<List<Integer>> result = rotateMatrix(matrix);

        System.out.println(result);
    }
}

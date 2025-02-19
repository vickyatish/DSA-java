package Arrays;
import java.util.*;

public class nextPermutation {
    public static List<Integer> nextGreaterPermutation(List <Integer> A){
        int n = A.size();
        int ind = -1;
        for(int i=n-2; i>=0; i--){
            if (A.get(i) < A.get(i+1)){
                ind = i;
                break;
            }
        }
        if(ind==-1){
            return A.reversed();
        }

        for(int i=n-1;i>ind;i--){
            if(A.get(i)>A.get(ind)){
                int temp = A.get(i);
                A.set(i, A.get(ind));
                A.set(ind, temp);
                break;
            }
        }

        Collections.reverse(A.subList(ind + 1, n));

        return A;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> result = nextGreaterPermutation(nums);
        System.out.println(result);
    }
}

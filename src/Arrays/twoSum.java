package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class twoSum {
    public static List<Integer> twoSum(List<Integer> arr, int target){
        HashSet<Integer> map = new HashSet<>();
        for(Integer a : arr){
            if(map.contains(target-a)){
                return new ArrayList<>(List.of(target-a, a));
            }
            else{
                map.add(a);
            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(twoSum(arr, 7));
    }
}

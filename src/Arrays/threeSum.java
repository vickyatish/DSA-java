package Arrays;

import java.util.*;

public class threeSum {
    public static List<List<Integer>> threeSum(List<Integer> array) {
        // Sorting the array to handle duplicates
        Collections.sort(array);
        List<List<Integer>> answers = new ArrayList<>();

        for (int i = 0; i < array.size() - 2; i++) {
            // Skip the same element to avoid duplicate triplets
            if (i > 0 && array.get(i).equals(array.get(i - 1))) {
                continue;
            }

            int j = i + 1;
            int k = array.size() - 1;

            while (j < k) {
                int sum = array.get(i) + array.get(j) + array.get(k);

                if (sum < 0) {
                    j++; // Move right to increase sum
                } else if (sum > 0) {
                    k--; // Move left to decrease sum
                } else {
                    // Correct the type here: add a list of integers (triplet)
                    answers.add(Arrays.asList(array.get(i), array.get(j), array.get(k)));

                    // Skip duplicates
                    while (j < k && array.get(j).equals(array.get(j + 1))) j++;
                    while (j < k && array.get(k).equals(array.get(k - 1))) k--;

                    j++;
                    k--;
                }
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(-1, 0, 1, 2, -1, -4);
        List<List<Integer>> result = threeSum(array);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}

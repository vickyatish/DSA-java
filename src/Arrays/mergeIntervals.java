package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MergeIntervals {
    public static List<List<Integer>> mergeIntervals(List<List<Integer>> arr) {
        if (arr == null || arr.isEmpty()) return new ArrayList<>();

        // Sort intervals based on the start time
        Collections.sort(arr, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> a, List<Integer> b) {
                return Integer.compare(a.get(0), b.get(0));
            }
        });

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            List<Integer> next = arr.get(i);
            if (current.get(1) >= next.get(0)) {
                // Merge intervals if they overlap
                current.set(1, Math.max(current.get(1), next.get(1)));
            } else {
                // Add non-overlapping interval and move to the next
                result.add(new ArrayList<>(current));
                current = next;
            }
        }

        // Add the last interval
        result.add(new ArrayList<>(current));

        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> intervals = new ArrayList<>();
        intervals.add(java.util.Arrays.asList(1, 3));
        intervals.add(java.util.Arrays.asList(2, 6));
        intervals.add(java.util.Arrays.asList(8, 10));
        intervals.add(java.util.Arrays.asList(15, 18));

        List<List<Integer>> merged = mergeIntervals(intervals);
        System.out.println(merged);
    }
}
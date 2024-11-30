package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IntersactionOfTwoArray {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i : nums1) {
            int value = map1.getOrDefault(i, 0);
            map1.put(i, value + 1);
        }
        for (int i : nums2) {
            int value = map2.getOrDefault(i, 0);
            map2.put(i, value + 1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (Integer integer : map1.keySet()) {
            if (map2.containsKey(integer))
                ans.add(integer);
        }

        return ans.stream().mapToInt(i -> i).toArray();

    }

    public int[] intersectionOptimized(int[] nums1, int[] nums2) {

        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int num : nums1) {
            s1.add(num);
        }
        // ArrayList<Integer> ans = new ArrayList<>();
        for (int num : nums2) {
            if (s1.contains(num))
                s2.add(num);
        }

        return s2.stream().mapToInt(i -> i).toArray();

    }
}
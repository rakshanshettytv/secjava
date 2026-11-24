import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int goodPairs = 0;

        for (int num : nums) {
            int seenBefore = freq.getOrDefault(num, 0);
            goodPairs += seenBefore;
            freq.put(num, seenBefore + 1);
        }

        return goodPairs;
    }
}
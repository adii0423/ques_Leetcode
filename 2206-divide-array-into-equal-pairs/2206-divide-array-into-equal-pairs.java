class Solution {
    public boolean divideArray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            if (set.contains(x))
              set.remove(x);
            else
              set.add(x);
           }

        return set.isEmpty();
    }
}
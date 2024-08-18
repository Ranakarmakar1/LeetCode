class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int num : nums) {
            map.put(num, 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
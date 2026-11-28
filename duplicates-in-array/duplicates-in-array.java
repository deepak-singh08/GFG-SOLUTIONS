class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // code here

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> added = new HashSet<>();

        for (int num : arr) {

            if (map.get(num) > 1 && !added.contains(num)) {
                result.add(num);
                added.add(num);
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }
}

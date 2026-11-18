class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here

                int lessOrEqual = 0;
                int greaterOrEqual = 0;

                for (int i = 0; i < arr.length; i++) {

                    if (arr[i] <= target) {
                        lessOrEqual++;
                    }

                    if (arr[i] >= target) {
                        greaterOrEqual++;
                    }
                }

                ArrayList<Integer> result = new ArrayList<>();

                result.add(lessOrEqual);
                result.add(greaterOrEqual);

                return new int[]{lessOrEqual, greaterOrEqual};
            }
        }
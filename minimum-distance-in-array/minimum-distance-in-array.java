class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
                int last = -1;
                int min = Integer.MAX_VALUE;

                for (int i = 0; i < arr.length; i++) {

                    if (arr[i] == x || arr[i] == y) {

                        if (last != -1 && arr[i] != arr[last]) {
                            min = Math.min(min, i - last);
                        }

                        last = i;
                    }
                }

                return min == Integer.MAX_VALUE ? -1 : min;
            }
        }
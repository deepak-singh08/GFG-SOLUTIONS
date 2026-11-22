class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
                int totalSum = 0;
                int leftSum = 0;

                // Calculate total sum
                for (int i = 0; i < arr.length; i++) {
                    totalSum += arr[i];
                }

                // Check equilibrium point
                for (int i = 0; i < arr.length; i++) {

                    totalSum -= arr[i];

                    if (leftSum == totalSum) {
                        return i;
                    }

                    leftSum += arr[i];
                }

                return -1;
            }
        }

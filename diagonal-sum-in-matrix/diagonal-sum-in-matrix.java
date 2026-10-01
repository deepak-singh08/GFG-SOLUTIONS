

class Solution {
    public int diagonalSum(int[][] mat) {
        // code here
    

            int n = mat.length;
            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum = sum + mat[i][i];
                sum = sum + mat[i][n - 1 - i];
            }

            return sum;
        }
    }

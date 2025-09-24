//1252
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] a = new int[m][n];

        
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];

            for (int t = 0; t < n; t++) {
                a[row][t]++;
            }

         
            for (int p = 0; p < m; p++) {
                a[p][col]++;
            }
        }

        int count = 0;
      
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] % 2 != 0) {
                    count++;
                }
            }
        }

        return count;
    }
}

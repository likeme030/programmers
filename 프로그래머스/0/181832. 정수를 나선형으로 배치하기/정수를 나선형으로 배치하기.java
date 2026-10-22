class Solution {
    public int[][] solution(int n) {
        
        int[][] arr = new int[n][n];
        int[] r = {0, 1, 0, -1};
        int[] c = {1, 0, -1, 0};
        
        int row = 0;
        int col = 0;
        int dir = 0;
        
        for (int i = 0; i < n * n; i++) {
            arr[row][col] = i + 1;
            
            int nextRow = row + r[dir];
            int nextCol = col + c[dir];
            
            if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= n || arr[nextRow][nextCol] != 0) {
                dir = (dir + 1) % 4;          // 다음 방향으로 (3 다음엔 다시 0)
                nextRow = row + r[dir];
                nextCol = col + c[dir];
            }
            
            row = nextRow;
            col = nextCol;
        }
        
        return arr;
    }
}
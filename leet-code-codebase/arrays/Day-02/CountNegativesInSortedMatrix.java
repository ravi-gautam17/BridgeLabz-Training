class CountNegativesInSortedMatrix {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        
        int row = 0, col = n - 1; // start at top-right
        while (row < m && col >= 0) {
            if (grid[row][col] < 0) {
                // all elements below this are also negative
                count += (m - row);
                col--; // move left
            } else {
                row++; // move down
            }
        }
        return count;
    }
}

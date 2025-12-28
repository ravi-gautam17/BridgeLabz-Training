class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int count=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0,bottom=m-1;
        int left=0,right=n-1;
        List<Integer> list=new ArrayList<>();
        while(top<=bottom&&left<=right&&count<m*n){
            for(int j=left;j<=right&&count<m*n;j++){
                list.add(matrix[top][j]);
                count++;
            }
            top++;
             for(int i=top;i<=bottom &&count<m*n;i++){
                list.add(matrix[i][right]);
                count++;
            }
            right--;
            for(int j=right;j>=left &&count<m*n;j--){
                list.add(matrix[bottom][j]);
                count++;
            }
            bottom--;
             for(int i=bottom;i>=top &&count<m*n;i--){
                list.add(matrix[i][left]);
                count++;
            }
            left++;

        }
        return list;
    }
}
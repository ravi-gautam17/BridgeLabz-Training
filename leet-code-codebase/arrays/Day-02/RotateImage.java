class RotateImage {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int[][] arr=transpose(matrix);
        for(int i=0;i<n;i++){
            reverse(arr[i]);
        }
    }
    public static int[][] transpose(int[][] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        return arr;
    }
    public static void reverse(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
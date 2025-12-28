class SpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int topRow=0,bottomRow=n-1,leftCol=0,rightCol=n-1;
        int totalElements=n*n;
        int count=0;
    
        int current=1;

        while(count<totalElements){
            //top row -> left col to right column
            for (int j=leftCol; j <= rightCol&& count< totalElements ; j++) {
                matrix[topRow][j]=current++;
                count++;
            }
            topRow++;
            //right col-> top row to bottom row
            for (int i = topRow; i <=bottomRow && count< totalElements; i++) {
                matrix[i][rightCol]=current++;
                count++;
            }
            rightCol--;
            // bottom row-> right column to left column
            for (int j= rightCol;j>=leftCol && count<totalElements;j--) {
                matrix[bottomRow][j]=current++;
                count++;
            }
            bottomRow--;
            // left column -> bottom row to top row
            for (int i = bottomRow; i>=topRow && count<totalElements ;i--) {
                matrix[i][leftCol]=current++;
                count++;
            }
            leftCol++;


        }
        return matrix;
    }
    
    }

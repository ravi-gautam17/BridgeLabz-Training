import java.util.Random;

public class MatrixCalculations {

    public static void main(String[] args) {
        // Example for 2x2 Matrix
        System.out.println("--- 2x2 Matrix Operations ---");
        double[][] m2 = createRandomMatrix(2, 2);
        displayMatrix(m2);
        
        double det2 = determinant2x2(m2);
        System.out.println("Determinant: " + det2);
        
        double[][] inv2 = inverse2x2(m2);
        System.out.println("Inverse:");
        displayMatrix(inv2);

        System.out.println("\n--- 3x3 Matrix Operations ---");
        // Example for 3x3 Matrix
        double[][] m3 = createRandomMatrix(3, 3);
        displayMatrix(m3);
        
        System.out.println("Transpose:");
        displayMatrix(transpose(m3));
        
        double det3 = determinant3x3(m3);
        System.out.println("Determinant: " + det3);
        
        double[][] inv3 = inverse3x3(m3);
        System.out.println("Inverse:");
        displayMatrix(inv3);
    }

    // a. Method to create a random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Random integers 0-9
            }
        }
        return matrix;
    }

    // b. Method to find the transpose
    public static double[][] transpose(double[][] m) {
        double[][] result = new double[m[0].length][m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                result[j][i] = m[i][j];
            }
        }
        return result;
    }

    // c. Method for determinant of 2x2
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // d. Method for determinant of 3x3 (Rule of Sarrus / Cofactor expansion)
    public static double determinant3x3(double[][] m) {
        double a = m[0][0], b = m[0][1], c = m[0][2];
        double d = m[1][0], e = m[1][1], f = m[1][2];
        double g = m[2][0], h = m[2][1], i = m[2][2];

        return a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
    }

    // e. Method for inverse of 2x2
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null; // Inverse doesn't exist

        double[][] inv = {
            { m[1][1] / det, -m[0][1] / det },
            { -m[1][0] / det, m[0][0] / det }
        };
        return inv;
    }

    // f. Method for inverse of 3x3 (using Adjugate matrix)
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] adj = new double[3][3];
        // Simplified cofactor calculation for each position
        adj[0][0] = (m[1][1] * m[2][2] - m[1][2] * m[2][1]) / det;
        adj[0][1] = (m[0][2] * m[2][1] - m[0][1] * m[2][2]) / det;
        adj[0][2] = (m[0][1] * m[1][2] - m[0][2] * m[1][1]) / det;
        adj[1][0] = (m[1][2] * m[2][0] - m[1][0] * m[2][2]) / det;
        adj[1][1] = (m[0][0] * m[2][2] - m[0][2] * m[2][0]) / det;
        adj[1][2] = (m[1][0] * m[0][2] - m[0][0] * m[1][2]) / det;
        adj[2][0] = (m[1][0] * m[2][1] - m[1][1] * m[2][0]) / det;
        adj[2][1] = (m[2][0] * m[0][1] - m[0][0] * m[2][1]) / det;
        adj[2][2] = (m[0][0] * m[1][1] - m[0][1] * m[1][0]) / det;

        return adj;
    }

    // g. Method to display matrix
    public static void displayMatrix(double[][] m) {
        if (m == null) {
            System.out.println("Matrix is undefined (Singular).");
            return;
        }
        for (double[] row : m) {
            for (double val : row) {
                System.out.printf("%8.2f ", val);
            }
            System.out.println();
        }
    }
}

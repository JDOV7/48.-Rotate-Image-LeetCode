package leetcode;

public class RotateImage48 {

    public void RotateImage48() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int iReturnMatrix[][] = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                iReturnMatrix[i][matrix.length - j - 1] = matrix[j][i];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = iReturnMatrix[i][j];
            }
        }
    }
}

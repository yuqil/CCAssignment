
public class Solution08 {
	public static int[][] ZeroMatrix (int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return matrix;
		}
		int row = matrix.length;
		int column = matrix[0].length;
		
		int[] zero_row = new int[row];
		int[] zero_col = new int[colume];
		
		for (int i = 0; i < row; i ++) {
			for (int j = 0; j < col; j++) {
				if(matrix[i][j] == 0) {
					zero_row[i] = 1;
					zero_col[j] = 1;
				}
			}
		}
		for (int i = 0; i < row; i ++) {
			for (int j = 0; j < col; j++) {
				if(zero_row[i] == 1 || zero_col[j] == 1) {
					matrix[i][j] = 1;
				}
			}
		}
		return matrix;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

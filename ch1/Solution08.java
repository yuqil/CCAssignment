
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
		int [][] image = new int[][] {{1,2,0,4},{5,6,7,8},{9,0,11,12},{13,14,15,16}};
		
		ZeroMatrix(image);
		System.out.println(image[0][0]+" "+image[0][1]+" "+image[0][2]+" "+image[0][3]);
		System.out.println(image[1][0]+" "+image[1][1]+" "+image[1][2]+" "+image[1][3]);
		System.out.println(image[2][0]+" "+image[2][1]+" "+image[2][2]+" "+image[2][3]);
		System.out.println(image[3][0]+" "+image[3][1]+" "+image[3][2]+" "+image[3][3]);		
	}

}


public class Solution07 {
	public void RotateMatrix(int[][] image){
		int size = image.length;
		
		for (int i = 0; i < size/2; i++) {
			int temp = 0;
			for (int j = i; j < size-i-1; j++){
				temp = image [i][j];
				image[i][j] = image[size-1-j][i];
				image[size-1-j][i] = image[size-1-i][size-1-j];
				image[size-1-i][size-1-j] = image[j][size-i-1];
				image[j][size-i-1] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution07 c = new Solution07();
		int [][] image = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		c.RotateMatrix(image);
		System.out.println(image[0][0]+" "+image[0][1]+" "+image[0][2]+" "+image[0][3]);
		System.out.println(image[1][0]+" "+image[1][1]+" "+image[1][2]+" "+image[1][3]);
		System.out.println(image[2][0]+" "+image[2][1]+" "+image[2][2]+" "+image[2][3]);
		System.out.println(image[3][0]+" "+image[3][1]+" "+image[3][2]+" "+image[3][3]);
	}

}

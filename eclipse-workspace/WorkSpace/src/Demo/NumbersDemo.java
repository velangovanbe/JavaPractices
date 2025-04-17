package Demo;

public class NumbersDemo {

	//5 have to be added to these each one number as individual 34583
	public static void main(String[] args) {

		//System.out.println(nums(5,34583));
		
	/*	modifyMatrix(null);
	}
	private static void modifyMatrix(int[][] mat) {
		int rows = mat.length;
		int cols = mat[0].length;
		// Iterate through the matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (mat[i][j] == 1) {
					// Update adjacent cells to 0
					if (i - 1 >= 0)
						mat[i - 1][j] = 0; // Up
					if (i + 1 < rows)
						mat[i + 1][j] = 0; // Down
					if (j-1>=0)
						mat[i][j - 1] = 0; // Left
					if (j + 1 < cols)
						mat[i][j + 1] = 0; // Right
				}
			}
		}
	}
*/
    int[][] mat = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        modifyMatrix(mat);
        printMatrix(mat);
    }

    private static void modifyMatrix(int[][] mat) {
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return; // Handle null or empty matrix
        }

        int rows = mat.length;
        int cols = mat[0].length;
        int[][] copy = new int[rows][cols];

        // Create a copy of the original matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                copy[i][j] = mat[i][j];
            }
        }

        // Iterate through the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (copy[i][j] == 1) {
                    // Update adjacent cells to 0 in the original matrix
                    if (i - 1 >= 0)
                        mat[i - 1][j] = 0; // Up
                    if (i + 1 < rows)
                        mat[i + 1][j] = 0; // Down
                    if (j - 1 >= 0)
                        mat[i][j - 1] = 0; // Left
                    if (j + 1 < cols)
                        mat[i][j + 1] = 0; // Right
                }
            }
        }
    }

    private static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
	private static int nums(int a,int b) {
		
		String numString=Integer.toString(b);
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<numString.length();i++) {
			int digitVal=Character.getNumericValue(numString.charAt(i));
		    int newDigit=digitVal+a;
		    sb.append(newDigit);
		}
		return Integer.parseInt(sb.toString());
	}

}

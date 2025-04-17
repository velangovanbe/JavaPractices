package Demo;

class MatriTwo{
	public static void main(String[] args) {
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
	    int[][] result = new int[rows][cols]; // Create a result matrix

	    // Copy the original matrix to the result matrix
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            result[i][j] = mat[i][j];
	        }
	    }

	    // Iterate through the matrix
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            if (mat[i][j] == 1) {
	                // Update adjacent cells to 0 in the result matrix
	                if (i - 1 >= 0)
	                    result[i - 1][j] = 0; // Up
	                if (i + 1 < rows)
	                    result[i + 1][j] = 0; // Down
	                if (j - 1 >= 0)
	                    result[i][j - 1] = 0; // Left
	                if (j + 1 < cols)
	                    result[i][j + 1] = 0; // Right
	            }
	        }
	    }

	    // Copy the result matrix back to the original matrix
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            mat[i][j] = result[i][j];
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
	}	}


package Demo;

import java.util.Iterator;

public class PatternPrograms {

	public static void main(String[] args) {
		int rowLen = 15;
		for (int row = 1; row <= rowLen; row++) {
			for (int col = 1; col <= rowLen; col++) {
//				if (col <= (rowLen - row)) {
//					System.out.print(" ");
//				} else {
//					if ((col != rowLen) && (col != rowLen - row)) {
//						System.out.print(" ");	
//					} else {
//						System.out.print("*");
//					}
					
					System.out.print("*");
//				}
				
//				if ((col == 4 - row)) {
//					System.out.print("*");
//				} else if (row != 1 && col == 6 - row) { 
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
				
//				if ((col == (2 - row)) || ((row != 1) && (col % row == 0) ) {
//					System.out.print("*");	
//				} else {
//					System.out.print(" ");
//				}
					
			}
			System.out.println();
		}
	}

}

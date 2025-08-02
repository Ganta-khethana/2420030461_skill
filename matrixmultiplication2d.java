package myproject1;

public class matrixmultiplication2d {
	public static void main(String[] args) {
	      double[][] matrix = {
	        {1.2, 4.3, 4.0},
	        {4.1, -1.1}
	      };

	      System.out.println("Multidimensional Array Elements:");

	      for (int i = 0; i < matrix.length; i++) {
	        for (int j = 0; j < matrix[i].length; j++) {
	          System.out.println("matrix[" + i + "][" + j + "] = " + matrix[i][j]); 
	        }
	      }

	  }
}

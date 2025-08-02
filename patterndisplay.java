package myproject1;

import java.util.*;

public class patterndisplay {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); 
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
	}
}

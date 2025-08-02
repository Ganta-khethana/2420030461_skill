package myproject1;

import java.util.*;

public class Sumofsquares {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int sum=0;
	for(int i=1;i<=n;i++) {
	sum +=i*i;
}
	System.out.println("Sum of squares from 1 to " + n + " is " + sum);
}
}
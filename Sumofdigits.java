package myproject1;

import java.util.*;

public class Sumofdigits {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int sum=0;
	int temp=Math.abs(n);
	while (temp > 0) {
        sum += temp% 10;
        temp/= 10;
    }
   System.out.println("Sum of digits: " + sum);
}

}

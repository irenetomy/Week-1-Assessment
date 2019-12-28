
import java.util.Scanner;
public class JavaTest
{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int n, i, oddSum = 0;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter a Number : ");
		n = sc.nextInt();	
		
		 while (n > 0)
		 {
		       i = n % 10;
		       if (i % 2 != 0) 
		       {
		    	   oddSum =oddSum + i;
		       }
		       n = n / 10;
		 }
					
		System.out.println("\n The Sum of Odd Numbers is    =  " + oddSum);
}
}
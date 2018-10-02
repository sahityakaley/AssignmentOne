import java.util.Scanner;

public class SwapNumbers {
	
	
	
	   public static void main(String args[])
	   {
	      int a, b, temp;
	      System.out.println("Enter a and b");
	      Scanner input = new Scanner(System.in);
	     
	      a = input.nextInt();
	      b = input.nextInt();
	     
	      System.out.println("Before Swapping\n x = "+a+"\n y = "+b);
	     
	      temp = a;
	      a = b;
	      b = temp;
	     
	      System.out.println("After Swapping\n x = "+a+"\n y = "+b);
	   }
	}



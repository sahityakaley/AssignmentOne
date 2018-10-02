import java.util.Scanner;

public class Largest {
	 public static void main(String args[])
	   {
	      int a, b, c;
	      System.out.println("Enter three numbers");
	      Scanner input = new Scanner(System.in);
	     
	      a = input.nextInt();
	      b = input.nextInt();
	      c = input.nextInt();
	     
	      if (a> b && a > c)
	         System.out.println("First number is largest");
	      else if (b > a && b > c)
	         System.out.println("Second number is largest");
	      else if (c> a && c> b)
	         System.out.println("Third number is largest");
	     
	   }

}

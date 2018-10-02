import java.util.Scanner;

public class SumOfIntegers {
	
	      public static void main(String[] args) {

	            Scanner in = new Scanner(System.in);

	            int number;
	            int remainder;
	            int sum = 0;

	            System.out.print("Enter a positive integer: ");

	            number = in.nextInt();

	            if (number <= 0)

	                  System.out.println("Integer entered is not positive.");

	            else {

	                          

	                  while(number > 0) {
	          			remainder = number % 10;
	          			sum = sum+ remainder;
	          			number = number / 10;
	          		}

	                  System.out.println("Sum of the  digits: " + sum);

	            }

	      }

	}



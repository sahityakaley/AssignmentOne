import java.util.Scanner;
public class PrimeNumber
{
   public static void main(String args[])
   {		
	int temp;
	boolean isPrimeNumber=true;
	Scanner input= new Scanner(System.in);
	System.out.println("Enter any number:");
	int num=input.nextInt();
    for(int i=2;i<=num/2;i++)
	{
	   temp=num%i;
	   if(temp==0)
	   {
	      isPrimeNumber=false;
	      break;
	   }
	}
	
	if(isPrimeNumber)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }


}

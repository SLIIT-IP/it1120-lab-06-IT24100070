import java.util.Scanner;
public class IT24100070Lab6Q3 {
	public static void main(String[] args) {

	int number;
	double total;

	total = 0;
	int count = 0;

	Scanner input = new Scanner(System.in);

	System.out.println("Enter positive intergers (terminate input with -99):");


	while (true)
	{

		System.out.print("Enter a number: ");
		number = input.nextInt();

		if(number == -99)
		{
			break;
		}

		if (number > 0) 
		{
			total = total + (number*number);
			count = count + 1;
		}
		else
		{
			System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
		}
	 }

	if (count > 0)
	{		
		double rMs = Math.sqrt(total/count);

		System.out.println(" ");
		System.out.println("The Root Mean Square (RMS) is: " +rMs);
	}
	else 
	{
		System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
	}

	}
}






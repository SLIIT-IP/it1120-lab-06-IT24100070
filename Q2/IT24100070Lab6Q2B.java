import java.util.Scanner;
public class IT24100070Lab6Q2B{
  public static void main(String[] args)
  {
  Scanner input=new Scanner(System.in);
  int []num=new int[10];
  int i=0;
  {
  System.out.println("Please enter 10 numbers:");
  }
  while(i<10)
   {
   
   System.out.println("Enter number"+(i+1)+":");
   num[i] =input.nextInt();
   i=i+1;
   }
   System.out.println("The numbers you entered are:");
   i=0;
   while(i<10)
   { 
    System.out.print(num[i]+" ");
    i=i+1;
   }
 }
}
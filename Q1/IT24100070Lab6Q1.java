import java.util.Scanner;
public class IT24100070Lab6Q1{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    double num, square, square_root;
    {
     System.out.println("Enter a number:");
     num = input.nextDouble();
    }
    square = num*num;
    square_root = Math.sqrt(num);
    
      if(num>0)
      {
      System.out.println("The square of "+num+"is:"+square);
      System.out.println("The square root of"+num+"is:"+square_root);
      }
      else
      {
      System.out.println("The square of "+num+"is:"+square);
      System.out.println("It is a complex number !");
      }
    }
}    
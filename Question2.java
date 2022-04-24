import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    //Prompts user for height and weight, calculate and print out the BMI of the user
    System.out.println("Enter height(m): ");
    double height = in.nextDouble(); // Read user input
    System.out.println("Enter weight(kg): ");
    double weight = in.nextDouble();
    System.out.println("BMI is: " + mass / height * height);
  }
}

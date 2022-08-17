import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int i = 0;
    System.out.print("Enter number of integer to be keyed in: ");
    int c = in.nextInt();
    int[] myArray = new int[c];
    for(i = 0; i < c; i++)
    {
      System.out.print("Enter a value: ");
      myArray[i] = in.nextInt();
    } 
    int maxNumber = -1;
    int maxAppearance = -1;
    for(i = 0; i < myArray.length; i++)
    {
      int count = 0;
      for (int j = 0; j < myArray.length; j++)
      {
        if (myArray[i] == myArray[j])
        {
          count++;
        }

        if (count > maxAppearance)
        {
          maxNumber = myArray[i];
          maxAppearance = count;
        }
      }
    }
    System.out.println("The mode is: " + maxNumber);
  }
}

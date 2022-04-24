import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter integer: ");
    int number = in.nextInt();
    const numberlist = [];
    int index = 1;
    while (index >= number)
    {
      System.out.println("Enter integer: ");
      int newnumber = in.nextInt();
      numberlist.push(newnumber);
      index++;
    }
    for(let i = 0;i < numberlist.length;i++){
   if numberlist[i] > highest);
  }
}

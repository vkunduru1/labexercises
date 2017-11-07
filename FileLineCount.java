import java.io.*;
import java.util.Scanner;
class FileLineCount
{
  public static void main ( String[] args ) throws IOException
  {
        // Prompt for and open the input file   
    Scanner user = new Scanner( System.in );
    System.out.print("File name? ");
    String fileName = user.next().trim();
    Scanner scan = new Scanner( new File(fileName) );
    int counter=0;
    while(scan.hasNextLine())
    {
      scan.nextLine();
      counter++;
      
     
    }  
   
   System.out.println(counter);

  }
}

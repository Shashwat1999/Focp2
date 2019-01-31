import java.lang.*;
import java.io.*;
/*import java.io.File;
import java.io.FileReader;
import java.io.IOException;*/
import java.util.Scanner;

public class read
{
   public static void main(String[] args) throws IOException 
   {
      File f1=new File("hello.txt"); //Creation of File Descriptor for input file
      String[] words=null;  //Intialize the word Array
      FileReader fr = new FileReader(f1);  //Creation of File Reader object
      BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
      String s;
      System.out.println("Enter the word you want to search :");
      Scanner sc = new Scanner (System.in);
      String input=sc.next();     
      //String input="hello";   // Input word to be searched
      int count=0;   //Intialize the word to zero
      while((s=br.readLine())!=null)   //Reading Content from the file
      {
         words=s.split(" ");  //Split the word using space
          for (String word : words) 
          {
                 if (word.equals(input))   //Search for the given word
                 {
                   count++;    //If Present increase the count by one
                 }
          }
      }
      if(count!=0)  //Check for count not equal to zero
      {
         System.out.println("The given word is present for "+count+ " Times in the file");
      }
      else
      {
         System.out.println("The given word is not present in the file");
      }
      
         fr.close();
   }


}
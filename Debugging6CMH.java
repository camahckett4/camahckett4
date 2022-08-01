/**********************************************************************************
* COMSC110 Lab
* Debugging6.java
* Purpose: This program has some common loop errors. Most only show up when
*  you run it so be sure each loop is doing what the comment says.
***********************************************************************************/
/****************************** 
* Name: Camden Hackett 

* Date: 10-12-2021 
* Purpose: output the correct patterns 
******************************/

import java.util.*;

/**
* This program has some common loop errors. Most only show up when
* you run it so be sure each loop is doing what the comment says.
*/
public class Debugging6CMH 
{
   public static void main(String[] args)
   {
      int i;
      
      // changed the curly brackets so the code all looks the same and looks neat
   
      // Loop 1: Print the numbers 1 to 10 all on same line
      System.out.printf("Loop 1: Print the numbers 1 to 10 all on same line\n");
      System.out.printf("Loop 1: "); 
      // took away the semicolon at the end of the for statement 
      for (i = 1; i <= 10; i++) 
      {
         System.out.printf("%d ", i);
      }
      System.out.printf("\n");
   
      // Loop 2: Print the numbers 0 to 9 all on same line
      // changed the commas to semi colons seperating the statements
      System.out.printf("Loop 2: Print the numbers 0 to 9 all on same line\n");
      System.out.printf("Loop 2: ");
      for (i = 0; i < 10; i++) 
      {
         System.out.printf("%d ", i);
      }
      System.out.printf("\n");
      
      // Loop 3: Print the numbers 1 to 10 all on same line
      System.out.printf("Loop 3: Print the numbers 1 to 10 all on same line\n");
      System.out.printf("Loop 3: ");
      // made "i > 10" to "i <= 10" 
      for (i = 1; i <= 10; i++)
      {
         System.out.printf("%d ", i);
      }
      System.out.printf("\n");
      
      // Loop 4: Print the letters in Yellow separated by spaces
      System.out.printf("Loop 4: Print the letters in Yellow separated by spaces\n");
      String word = "Yellow";
      int length = word.length();
      System.out.printf("Loop 4: ");
      // created a nested for loop to output "Y e l l o w" without any exception errors 
      for (i = 0; i <= length; i++) 
      {
         for(i = 0; i <= 5; i++)// made this less than or equal to 5 because I got errors saying 6 was too many
         {
         char c;
         c = word.charAt(i);
         System.out.printf("%c ", c);
         }
      }
      System.out.printf("\n");
      
      // Loop 5: Print the numbers 11 to 20 all on same line
      System.out.printf("Loop 5: Print the numbers 11 to 20 all on same line\n");
      System.out.printf("Loop 5: ");
      i = 11;
      // took away the semi colon at the end of the while statement 
      while( i <= 20) 
      {
         System.out.printf("%d ", i);
         i++;
      }
      System.out.printf("\n");

      System.out.printf("End of program\n");

   }
}


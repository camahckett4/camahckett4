/****************************** 
* Name: Camden Hackett 

* Date: 10-13-2021 
* Purpose: output wind chill table 
******************************/
import java.lang.Math;
public class WindChillTableCMH
{
   public static void main(String[] args)
   {
      // for loop to print the temp column
      for(int t = 40; t >= -45; t -= 5)
      {
         System.out.print(" " + "\t" + " " + t);
      }
      System.out.println();
      // for loop to print the wind speed rows
      for(int v = 5; v <= 60; v += 5)
      {
         // printing the rows here so the formula will output the numbers in a grid inside of the column and rows
          System.out.println(v);
          // making this nested loop to calculate the wind chill
         for(int t = 40; t >= -45; t -= 5)
         {
            double answer = 35.74 + 0.6215 * t - 35.75 * Math.pow(v,0.16) + 0.4275 * t * Math.pow(v,0.16);
            System.out.printf("\t" + " " + "%4.0f",answer); // outputting integers 
         }
         System.out.println();
      }    
   }
}
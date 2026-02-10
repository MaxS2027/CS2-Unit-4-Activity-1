
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Main {

   public static void main(String []args) throws IOexception { 
      //create file scanner int string
      //you have the format
      File myFile = new File("pokemon.csv");
      Scanner scan = new Scanner(myFile);
      String[] pokemonLines = new String[10];
      System.out.println("Hello World");

      //initialize line counter
      int i =0;
      //loop through every in file
      //loop while scanner can still find another line 
      //File AND our line counter is less then 20
      while(scan.hasNext() && (i<10) ){ 
            //every line of file to be read
            String.currentLine= scan.nextLine();
            //assign the line to be stored in the array
            pokemonLines(i) = currentLine;
            //print out the line from afrray
              System.out.println();
            //increment line counter
            i++;
      }
   }
}

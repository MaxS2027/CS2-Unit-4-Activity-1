import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {

   public static void main(String[] args) throws IOException { // Fixed: capitalization in IOException

      File myFile = new File("pokemon.csv");
      Scanner scan = new Scanner(myFile);
      String[] pokemonLines = new String[10];
      
      int i = 0;

      // Loop while scanner has a line AND we haven't filled our 10-slot array
      while (scan.hasNextLine() && (i < 10)) { 
            // Fixed: declared the variable type and used correct assignment
            String currentLine = scan.nextLine();
            
            // Fixed: Arrays use square brackets [] not parentheses ()
            pokemonLines[i] = currentLine;
            
            // Print out the line from the array
            System.out.println("Stored: " + pokemonLines[i]);
            
            i++;
      }
      
      scan.close(); // Good practice to close the scanner

      // To call randomPokemon from main, we either make it static or instantiate the class
      System.out.println("--- Random Selection ---");
      randomPokemon(i); // Passing 'i' because it represents how many lines we actually read
   }

   // Fixed: added 'static' so it can be called from main
   public static void randomPokemon(int length) {
      // Fixed: Math.random() is a method and returns a double; needs casting to int
      int randIndex = (int) (Math.random() * length);
      System.out.println("Random Index chosen: " + randIndex);
   }
}
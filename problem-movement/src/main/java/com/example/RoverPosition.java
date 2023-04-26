import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.text.Position;

public class RoverPosition
{
   public static void main(String[] args) throws FileNotFoundException {
        String[] input = {
            "N7",
            "E130",
            "S2",
            "E18",
            "W63",
            "N15",
            "E13",
            "S120"};
            //findFinalCoordinates(input);
        String fileName = "C:\\Users\\swasi\\Desktop\\candidate-swathy9190-interview-coding-exercise-text\\problem-movement\\input.txt";
        Scanner scan = new Scanner(new File(fileName));
        int x = 0, y = 0;
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            
            int coordinateToUpdate = Integer.parseInt(line.substring(1));
            if(line.startsWith("E", 0))
            {
                x = x + coordinateToUpdate;
            }
            else if(line.startsWith("N", 0))
            {
                y = y + coordinateToUpdate;
            }
            else if(line.startsWith("W", 0))
            {
                x = x - coordinateToUpdate;
            }
            else
            {
                // north
                y = y - coordinateToUpdate;
            }
        }
        System.out.println(x + "," + y);
        
   }

    private static void findFinalCoordinates(String[] input) {
        //validation
        
        Position position = new PO
        for(int i=0;i<input.length;i++)
        {
            process(input[i], x, y);
        }
        System.out.println(x + "," + y);
    } 

    private static Pair<Integer, Integer> process(String input, int x, int y) {
        int coordinateToUpdate = Integer.parseInt(input.substring(1));
        if(input.startsWith("E", 0))
        {
            x = x + coordinateToUpdate;
        }
        else if(input.startsWith("N", 0))
        {
            y = y + coordinateToUpdate;
        }
        else if(input.startsWith("W", 0))
        {
            x = x - coordinateToUpdate;
        }
        else
        {
            // north
            y = y - coordinateToUpdate;
        }
        return new 
    }
}
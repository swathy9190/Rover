import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RoverPosition
{
   public static void main(String[] args) throws FileNotFoundException { 
        String fileName = "C:\\Users\\swasi\\Desktop\\candidate-swathy9190-interview-coding-exercise-text\\problem-movement\\input.txt";  
        int x = 0, y = 0;
        Position position = new Position(x, y);
        position = findRover(fileName, position);     
        System.out.println(position.x + "," + position.y);
   }

   public static Position findRover(String fileName, Position position) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            position = findFinalCoordinates(line, position);
        }
        return position;
   }

    public static Position findFinalCoordinates(String input, Position position) {
        int coordinateToUpdate = Integer.parseInt(input.substring(1));
        if(input.startsWith("E", 0))
        {
            position.x += coordinateToUpdate;
        }
        else if(input.startsWith("N", 0))
        {
            position.y += coordinateToUpdate;
        }
        else if(input.startsWith("W", 0))
        {
            position.x -= coordinateToUpdate;
        }
        else
        {
            // north
            position.y -= coordinateToUpdate;
        }

        return position;
    }
}
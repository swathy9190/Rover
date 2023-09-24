import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class RoverPositionCorrection {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "C:\\Users\\swasi\\Desktop\\candidate-swathy9190-interview-coding-exercise-text\\problem-movement-2\\input.txt";  
        int x = 0, y = 0;
        Position position = new Position(x, y);
        Deque<String> positionQueue = new ArrayDeque<>();
        positionQueue = findRoverWithCorrection(fileName, positionQueue); 
        for (Iterator<String> itr = positionQueue.iterator(); itr.hasNext();) {
            position = RoverPosition.findFinalCoordinates(itr.next(), position);
        }    
        System.out.println(position.x + "," + position.y);
    }

    public static Deque<String> findRoverWithCorrection(String fileName, Deque<String> positionQueue) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(fileName));
        String COR = "COR";
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            if(!positionQueue.isEmpty() && line.equals(COR))
            {
                positionQueue.removeLast();
            }
            else
            {
                positionQueue.addLast(line);
            }
        }    
        return positionQueue;
   }
}

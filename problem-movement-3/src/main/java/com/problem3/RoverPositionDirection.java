import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RoverPositionDirection {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "C:\\Users\\swasi\\Desktop\\candidate-swathy9190-interview-coding-exercise-text\\problem-movement-3\\example_input.txt";  
        int x = 0, y = 0;
        Position position = new Position(x, y);
        Deque<String> positionQueue = new ArrayDeque<>();
        positionQueue = RoverPositionCorrection.findRoverWithCorrection(fileName, positionQueue); 
        position = findRoverDirection(positionQueue, position);
        System.out.println(position.x + "," + position.y);
    }

    public static Position findRoverDirection(Deque<String> positionQueue, Position position) throws FileNotFoundException {
        String[] rightDirectionArray = new String[] {"N", "E", "S", "W"};
        Map<String, Integer> rightDirectionMap = new HashMap<>();
        rightDirectionMap.put("N", 1);
        rightDirectionMap.put("E", 2);
        rightDirectionMap.put("S", 3);
        rightDirectionMap.put("W", 4);

        String[] leftDirectionArray = new String[] {"N", "W", "S", "E"};
        Map<String, Integer> leftDirectionMap = new HashMap<>();
        leftDirectionMap.put("N", 1);
        leftDirectionMap.put("W", 2);
        leftDirectionMap.put("S", 3);
        leftDirectionMap.put("E", 4);

        String direction = "N";
        for (Iterator<String> itr = positionQueue.iterator(); itr.hasNext();) {
            String input = itr.next();
            String currentDirection = input.substring(0, 1);
            int numberValue = Integer.parseInt(input.substring(1));
            if(input.startsWith("R", 0))
            {
                direction = rightDirectionArray[((rightDirectionMap.get(direction) + (numberValue / 90)) - 1) % 4];
                continue;
            }
            else if(currentDirection.startsWith("L", 0))
            {
                direction = leftDirectionArray[((leftDirectionMap.get(direction) + (numberValue / 90)) - 1) % 4];
                continue;
            }
            else if(currentDirection.startsWith("F", 0))
            {
                input = direction + numberValue;
            }
            else
            {
                direction = currentDirection;
            }
            position = RoverPosition.findFinalCoordinates(input, position);
        }
        return position;
   }
}

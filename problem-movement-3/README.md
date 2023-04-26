# Movement. Part 3

Use the solution from Movement. Part 2 problem as starting point for this problem.

Again, the rover wasn't found. The base crew was puzzled until one engineer remembered that there's another type of data in the logs that rover records: rotating 90 or 180 degrees Left or Right. Along with that, rover can record log of going Forward into the direction it faces. At the beginning the rover faces North. Whenever the rover moves towards certain direction, it always moves forward, i.e. the rover can't drive sideways.

Your goal is to extend the solution to account for rover rotations.

## Example Input

```
N7
E130
R90
F15
S2
COR
E18
L180
F18
W63
N15
L90
COR
COR
COR
F15
E13
S120
```

## Example Output

```
128,-128
```

## Exercise Input

Use `input.txt` as an input into your solution to produce the result.

## Exercise Result Validation

Run `./validate` and follow instructions on the screen.

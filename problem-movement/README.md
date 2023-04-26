# Movement

A rover is long lost on Mars. The settlement want to rescue it, but unfortunately they can't observe it from the habitable base due to sandstorm. We only have starting point (`0, 0`) and telemetry the rover has sent. Telemetry consists of movement log:

* **N5** - 5 meters North
* **E15** - 15 meters East
* **S1** - 1 meter South
* **W100** - 100 meters West

The goal is to find it's current position where North-East direction is positive and South-West is negative. For sake of simplicity we assume that surface is flat and indefinite. Write a program that calculates the coordinates of final position in a format of two numbers divided by comma (East/West,North/South).

## Example Input

```
N7
E130
S2
E18
W63
N15
E13
S120
```

## Example Output

```
98,-100
```

## Exercise Input

Use `input.txt` as an input into your solution to produce the result.

## Exercise Result Validation

Run `./validate` and follow instructions on the screen.

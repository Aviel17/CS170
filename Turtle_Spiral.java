public class Turtle_Spiral {

  public static void main(String[] args) {
    Turtle t = new Turtle();
    Turtle t2 = new Turtle();
    turtleSpiral(t, 200, 5);
    turtleSpiralIter(t2, 200, 5);
  }

  public static void turtleSpiral(Turtle t, double size, double minSize) {
    if (size > minSize) {
      t.forward(size);
      t.right(90);
      turtleSpiral(t, size - (size * 0.10), minSize);
    }
  }

  public static void turtleSpiralIter(Turtle t, double size, double minSize) {
    double i = size;
    double j = (size * 0.1);
    // Initial movement that allows for Turtle to be in view and make the first side length...
    t.penup();
    t.backward(300);
    t.left(90);
    t.forward(200);
    t.right(90);
    t.pendown();
    t.forward(i);
    t.right(90);
    // While loop that keeps running until the mininum length for a side is reached
    while (i >= minSize) {
        t.forward(i - j);
        t.right(90);
        double temp = (i * 0.10); // Enables the recursive nature of the code by multiplying the dynamic value of i by 0.10 to make sure that each side length is
                                 // decreasing by 10% through each iteration.
        i -= temp; // Applying the method described above to i by subtracting what i originally is by 10% of what the previous value of i was
        j -= (temp * 0.1); // Same thing except applying it to j, except applied at a smaller scale to account for decreasing the side lengths by j amount
    }
  }


























}

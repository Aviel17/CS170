public class Fractal_Mickey_Mouse {

  public static void main(String[] args) {
    Turtle t = new Turtle();
    t.delay(0);
    fractalMickeyMouse(t, 100, 6);
  }

    // 4A (borrowed code from Quiz 3 - "Wrong Rainbow Problem")
    /*
    Method used in fractalMickeyMouse to draw each face, given a radius of type double. The turtle starts in the middle of the face pointing due East
    and, after the face is created, ends up facing due North in the center of the face on the nose.
    */
  public static void mickeyFace(Turtle t, double r) {
    t.penup();
    t.left(90);
    //Reference Point
    t.backward(r);
    t.right(90);
    t.pendown();
    // Get ready to make face!
    circle(t, r);
    t.left(90);
    t.penup();
    // Get turtle to reference point
    t.forward(r);
    // Get ready to make left eye...
    t.left(45);
    // Direct turtle to making the left eye...
    t.forward(r/2);
    t.right(135);
    t.pendown();
    // 1st Eye
    circle(t, r/10);
    t.right(45);
    // Go back to reference point...
    t.penup();
    t.forward(r/2);
    // Get turtle ready to draw right eye...
    t.left(90);
    t.penup();
    t.forward(r/2);
    t.right(45);
    t.pendown();
    // 2nd Eye
    circle(t, r/10);
    t.penup();
    t.left(225);
    t.forward(r/2);
    // Get turtle in position to create nose (pointing East)...
    t.left(135);
    //
    t.pendown();
    // Nose
    circle(t, r/20);
    t.penup();
    t.right(90);
    t.forward(r/2);
    t.left(90);
    t.pendown();
    // Smile
    for (int i = 0; i < 50; i++) {
      t.forward(2 * r/5 * Math.sin(Math.PI/200));
      t.left(360.0/200);
    }
    // Retract to Reference Point...
    for (int i = 0; i < 50; i++) {
      t.backward(2 * r/5 * Math.sin(Math.PI/200));
      t.right(360.0/200);
    }
    t.left(90);
    t.penup();
    t.forward(r/2);
  }

  // Helper Method for 4A
  public static void circle(Turtle t, double r) {
    for (int i = 0; i < 200; i++) {
      t.forward(2 * r * Math.sin(Math.PI/200));
      t.left(360.0/200);
    }
  }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  // 4B
  /*
  The recursive method, given a base case of a single face, recursively draws multiple faces, given a radius of type double
  and the number of levels of type integer, with each face half the radius (size) of the face before it and with two ears half the
  radius of that face.
  */
  public static void fractalMickeyMouse(Turtle t, double r, int level) {
    if (level==0) {
      mickeyFace(t, r);
    } else {
      mickeyFace(t, r);
      t.penup();
      t.left(45);
      t.forward(r+(r/2));
      t.right(135);
      t.pendown();
      fractalMickeyMouse(t, r / 2, level-1);
      t.penup();
      // Tried to get both faces to be leveled with one another...
      t.left(45);
      t.backward(r+(r/2));
      t.right(90);
      t.forward(r+(r/2));
      t.right(45);
      fractalMickeyMouse(t, r / 2, level-1);
      // Magic
      t.penup();
      t.right(45);
      t.backward(r+(r/2));
      t.left(45);
      t.pendown();

    }
  }
















}

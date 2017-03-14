public class Triangle {
  public int mSideOne;
  public int mSideTwo;
  public int mSideThree;

  public Triangle(int sideOne, int sideTwo, int sideThree) {
    mSideOne = sideOne;
    mSideTwo = sideTwo;
    mSideThree = sideThree;

  }

  public String typeOfTriangle(int sideOne, int sideTwo, int sideThree){
    if ((sideOne + sideTwo) <= sideThree || (sideTwo + sideThree) <= sideOne || (sideOne + sideThree) <= sideTwo) {
      System.out.println("This is not a triangle.");
    } else if (sideOne == sideTwo && sideTwo != sideThree || sideTwo == sideThree && sideOne != sideTwo || sideOne == sideThree && sideTwo != sideThree) {
      System.out.println("This is an Isosceles triangle.");
    } else if (sideOne != sideTwo && sideTwo != sideThree) {
      System.out.println("This is a scalene triangle.");
    } else if (sideOne == sideTwo && sideTwo == sideThree){
      System.out.println("This is an equilateral triangle.");
    }
    return ("");
  }
}

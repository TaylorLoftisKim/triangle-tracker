import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();


    System.out.println("Please input the length of the first side of a triangle.");

    int lengthOne = Integer.parseInt(console.readLine());

    System.out.println("Please inout the length of the second side of a triangle.");

    int lengthTwo = Integer.parseInt(console.readLine());

    System.out.println("Please input the length of the third side of a triangle.");

    int lengthThree = Integer.parseInt(console.readLine());

    Triangle userTriangle = new Triangle(lengthOne, lengthTwo, lengthThree);

    userTriangle.typeOfTriangle(lengthOne, lengthTwo, lengthThree);

  }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Triangle type:");
        String triangleType = scanner.nextLine();
        System.out.println("Side A:");
        int sideA = scanner.nextInt();
        System.out.println("Side B:");
        int sideB = scanner.nextInt();
        System.out.println("Angle AB:");

        int angleAB = scanner.nextInt();
        switch (triangleType) {
            case "triangle": {
                Figure figure = new Triangle(sideA, sideB, angleAB);
                System.out.println("Square: " + figure.getSquare());
                System.out.println("Perimeter: " + figure.getPerimeter());
                break;
            }
            case "right triangle": {
                Figure figure = new RightTriangle(sideA, sideB, angleAB);
                System.out.println("Square: " + figure.getSquare());
                System.out.println("Perimeter: " + figure.getPerimeter());
                break;
            }
            case "equilateral triangle": {
                Figure figure = new EquilateralTriangle(sideA, sideB, angleAB);
                System.out.println("Square: " + figure.getSquare());
                System.out.println("Perimeter: " + figure.getPerimeter());
                break;
            }
            default:
                System.out.println("Error");
                break;
        }

    }
}
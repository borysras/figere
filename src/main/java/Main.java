import exceptions.NegativeNumberException;
import exceptions.NumberFormatExceptions;
import org.apache.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    private static Logger log = Logger.getLogger(Main.class);


    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);

        log.info("enter figure type");
        String figureType = stringScanner.nextLine();


        log.info("enter figures count");
        int figuresCount = 0;
        try {
            figuresCount = intScanner.nextInt();
            if (figuresCount < 1) throw new NegativeNumberException();
            if (figuresCount > 2) throw new NumberFormatExceptions();
        } catch (InputMismatchException nfe) {
            log.info("You have entered a non numeric field value");
        }

        log.info("enter sides count");
        int sideCount = intScanner.nextInt();


        log.info("enter sides length");
        int[] side = new int[sideCount];
        for (int i = 0; i < sideCount; i++) side[i] = intScanner.nextInt();

        switch (figureType) {
            case "triangle": {
                Figure figure = new Triangle(side[0], side[1], side[2]);
                log.info("Area: " + figure.getArea());
                log.info("Perimeter: " + figure.getPerimeter());
                break;
            }
            case "right triangle": {
                Figure figure = new RightTriangle(side[0], side[1], side[2]);
                log.info("Area: " + figure.getArea());
                log.info("Perimeter: " + figure.getPerimeter());
                break;
            }
            case "equilateral triangle": {
                Figure figure = new EquilateralTriangle(side[0], side[1], side[2]);
                log.info("Area: " + figure.getArea());
                log.info("Perimeter: " + figure.getPerimeter());
                break;
            }
            case "square": {
                Figure figure = new Square(side[0]);
                log.info("Area: " + figure.getArea());
                log.info("Perimeter: " + figure.getPerimeter());
                break;
            }
        }
        if (figuresCount == 2) {
            log.info("enter second figure type");
            String secondFigureType = stringScanner.nextLine();

            log.info("enter sides count");
            int secondFigureSideCount = intScanner.nextInt();

            log.info("enter second figure sides length");
            int[] secondFigureSide = new int[secondFigureSideCount];
            for (int i = 0; i < secondFigureSideCount; i++) secondFigureSide[i] = intScanner.nextInt();

                    switch (secondFigureType) {
                        case "triangle": {
                            Figure figure = new Triangle(secondFigureSide[0], secondFigureSide[1], secondFigureSide[2]);
                            log.info("Area: " + figure.getArea());
                            log.info("Perimeter: " + figure.getPerimeter());
                            break;
                        }
                        case "right triangle": {
                            Figure figure = new RightTriangle(side[0], side[1], side[2]);
                            log.info("Area: " + figure.getArea());
                            log.info("Perimeter: " + figure.getPerimeter());
                            break;
                        }
                        case "equilateral triangle": {
                            Figure figure = new EquilateralTriangle(side[0], side[1], side[2]);
                            log.info("Area: " + figure.getArea());
                            log.info("Perimeter: " + figure.getPerimeter());
                            break;
                        }
                        case "square": {
                            Figure figure = new Square(side[0]);
                            log.info("Area: " + figure.getArea());
                            log.info("Perimeter: " + figure.getPerimeter());
                            break;
                        }
                    }
            if(figureType.equals(secondFigureType))
                log.info("Equals");
            else
                log.info("Not Equals");
        }
    }
}










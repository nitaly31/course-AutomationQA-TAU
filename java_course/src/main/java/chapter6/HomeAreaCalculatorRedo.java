package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculateTotalArea(kitchen,bathroom);

        System.out.println("El area total es: " + area);
        calculator.scanner.close();
    }
    public Rectangle getRoom(){

        System.out.println("Introduce la longitud de tu habitación: ");
        double length = scanner.nextDouble();
        System.out.println("Introduce el ancho de tu habitación: ");
        double width = scanner.nextDouble();

        return new Rectangle(length,width);
    }
    public static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}

package chapter6;
/*
* Escribe una clase que cree instancias de la clase Rectangle
* para encontrar el área total de dos habitaciones en una casa.
* */
public class HomeAreaCalculator {
    public static void main(String[] args) {
        /* RECTANGLE 1 */
        //Crear una instancia de la clase Rectangle
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        /* RECTANGLE 2 */
        //Crear una instancia de la clase Rectangle
        Rectangle room2 = new Rectangle(30,75);
        double areaOfRoom2 = room2.calculateArea();
        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Área de ambas habitaciones: " + totalArea);
    }
}

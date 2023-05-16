package chapter9;

public class InheritanceTester {
    public static void main(String[] args) {
        Mother mom = new Mother();
        mom.setName("Maryuri");

        System.out.println(mom.getName() + " es una " + mom.getGender());
    }
    public static void testSquareOverride(){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);
        square.setWidth(8);
        System.out.println(square.calculatePerimeter());
    }

}

package chapter9;

public class Square extends Rectangle{
    //Para anular un meotodo heredado, agregamos el decorador y
    // seguido del metodo a sustituir, solo se cambia el cuerpo
    @Override
    public double calculatePerimeter(){
        return sides * length;
    }
    public void print(String what){
        System.out.println("Yo soy un " + what);
    }
}

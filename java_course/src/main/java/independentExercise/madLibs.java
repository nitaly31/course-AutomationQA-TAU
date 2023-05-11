package independentExercise;

import java.util.Scanner;

public class madLibs {
    public static void main(String arg[]) {
        //1. Pedir al usuario una estación del año.
        System.out.println("Escribe una estación del año");
        Scanner scanner = new Scanner(System.in);
        String seasonYear = scanner.nextLine();
        //2. Pedir al usuario un adjetivo.
        System.out.println("Ingrese un adjetivo.");
        String adjective = scanner.nextLine();
        //3. Pedir al ususario un número entero.
        System.out.println("Ingrese un número entero.");
        int number = scanner.nextInt();
        //4. formular oracion
        String oration = "En un día " + adjective + " de " + seasonYear + ", bebo un mínimo de " + number + " tazas de café.";
        //5. resultado.
        System.out.println(oration);
    }
}

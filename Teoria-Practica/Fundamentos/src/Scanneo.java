import java.util.Scanner;

public class Scanneo {
    public static void main(String args[]) {
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var alumno = consola.nextLine();
        System.out.println("Alumno = " + alumno);

        System.out.println("Escribe tu profesion: ");
        var titulo =  consola.nextLine();
        System.out.println("Resultado: "+ titulo + " " + alumno);

    }
}

import java.util.Scanner;

public class Scanneo {
    public static void main(String args[]) {
        //Ejemplo
        System.out.println("Escribe tu nombre: ");
        //el scanner funciona de manera global solo se requiere usarlo una vez
        Scanner consola = new Scanner(System.in); 
        var alumno = consola.nextLine();
        System.out.println("Alumno = " + alumno);

        System.out.println("Escribe tu profesion: ");
        var titulo =  consola.nextLine();
        System.out.println("Resultado: "+ titulo + " " + alumno);
        
        //!ejercicio
        System.out.println("Proporciona un titulo-> ");
        var tema = consola.nextLine();
        
        System.out.println("Proporciona el autor-> ");
        var creador =consola.nextLine();

        System.out.println(tema + " escrito por " + creador);
    }
}

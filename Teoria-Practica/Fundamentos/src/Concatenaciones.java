public class Concatenaciones {
    public static void main(String args[]) {
        var user = "Ysaac";
        var titulo = "Ingeniero de Software ";

        var union = titulo + user;
        System.out.println("union -> "+ union);
        
        var i=10;
        var j=7;
        System.out.println(union +" "+ (i + j) + " años" );
        
        var h=1;
        var k=8;
        System.out.println(union +" "+ h + k + " años" );
    
    //?caracteres especiales
        var nom = "Aysaac";

        System.out.println("Nueva Linea: \n" + nom);
        System.out.println("Tabulador: \t" + nom);
        System.out.println("Retroceso: \b\b" + nom);
        System.out.println("Comilla simple: \'" + nom + "\'");
        System.out.println("Comilla Doble: \"" + nom + "\"");
    }
}

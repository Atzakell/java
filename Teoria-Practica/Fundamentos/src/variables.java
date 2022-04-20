import javax.print.attribute.SupportedValuesAttribute;

public class variables {
    public static void main(String args[]) {
        //?asigando valore entero e imprimiendo
        int unaVariableEntera = 100;
        System.out.println(unaVariableEntera);

        unaVariableEntera=unaVariableEntera-42;
        System.out.println(unaVariableEntera);
        
        //?asigando valore cadena e imprimiendo
        String unaVariableCadena = "Nuggets de pollo";
        System.out.println(unaVariableCadena);

        unaVariableCadena = "Twister Americano";
        System.out.println(unaVariableCadena);

        //* var - Inferencia de tipos en 
        var otraVariableEntera = 69;
        System.out.println(otraVariableEntera);

        var mismaVariableEntera2 = "0la infiel";
        System.out.println(mismaVariableEntera2);
        
    }
}

import java.util.Arrays;
import javax.swing.JOptionPane;

public class AnalisisEmpirico {
    public static void main(String args[]) {
        AnalisisEmpirico ejemplo1=new AnalisisEmpirico();
        int[] numeros = new int[10000];
        //generacion de numeros random
        for(int i=0; i<numeros.length; i++){
            numeros[i] = (int) (Math.random()*5000)+1;
        }
        //ordenamiento del array
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        //busqueda
        int elemento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor que desee buscar"));

        //medicion de tiempo
        long startTime =System.nanoTime();
        int resultado1 = ejemplo1.Busqueda_Binaria(numeros,elemento);
        long endTime = System.nanoTime();

        System.out.println("Busqueda binaria -> "+(endTime-startTime)+" ns");
        if(resultado1 !=-1){
            System.out.println("El numero está en la posición "+ resultado1);
        }else{
            System.out.println("El numero no se encuentra en el array");
        }

        long startTime1 =System.nanoTime();
        int resultado2 = ejemplo1.BusquedaLineal(numeros, elemento);
        long endTime1 = System.nanoTime();

        System.out.println("Busqueda secuencial -> "+(endTime1-startTime1)+" ns");
        if(resultado2 !=-1){
            System.out.println("El numero está en la posición "+ resultado2);
        }else{
            System.out.println("El numero no se encuentra en el array");
        }
    }

    private int Busqueda_Binaria(int[] lista, int elemento){
        int menor=0, medio;
        int mayor=lista.length - 1;
        
        while(menor<=mayor){
            medio=menor+(mayor-menor)/2;
            if(lista[medio]==elemento){
                return medio;
            }else if(lista[medio]>elemento){
                mayor=medio-1;
            }else{
                menor=medio+1;
            }
        }
        return -1;
        
    }
    
    private int BusquedaLineal(int arr[], int elementABuscar) {

        for (int posicion = 0; posicion < arr.length; posicion++) {
            if (arr[posicion] == elementABuscar)
                return posicion;
        }
        
        return -1;
    }

}

package Semana10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GreedyAlgorithm {
    public static void main(String[] args) {
        // Crea una emisora ​​de radio y ponla en Map
        HashMap<String, HashSet<String>> broadcasts = new HashMap<String, HashSet<String>>();
        // Ponga cada estación de radio en transmisiones
        HashSet<String> hashSet1 = new HashSet<String>();
        hashSet1.add("Beijing");
        hashSet1.add("Llevar a la fuerza");
        hashSet1.add("Tianjin");

        HashSet<String> hashSet2 = new HashSet<String>();
        hashSet2.add("Guangzhou");
        hashSet2.add("Beijing");
        hashSet2.add("Shenzhen");

        HashSet<String> hashSet3 = new HashSet<String>();
        hashSet3.add("Chengdu");
        hashSet3.add("Llevar a la fuerza");
        hashSet3.add("Hangzhou");

        HashSet<String> hashSet4 = new HashSet<String>();
        hashSet4.add("Llevar a la fuerza");
        hashSet4.add("Tianjin");

        HashSet<String> hashSet5 = new HashSet<String>();
        hashSet5.add("Hangzhou");
        hashSet5.add("Dalian");

        // Agregar al mapa
        broadcasts.put("K1", hashSet1);
        broadcasts.put("K2", hashSet2);
        broadcasts.put("K3", hashSet3);
        broadcasts.put("K4", hashSet4);
        broadcasts.put("K5", hashSet5);

        // allAreas almacena todas las áreas
        HashSet<String> allAreas = new HashSet<String>();
        allAreas.add("Beijing");
        allAreas.add("Llevar a la fuerza");
        allAreas.add("Tianjin");
        allAreas.add("Guangzhou");
        allAreas.add("Shenzhen");
        allAreas.add("Chengdu");
        allAreas.add("Hangzhou");
        allAreas.add("Dalian");

        // Crea ArrayList, almacena la colección de emisoras de radio seleccionada
        ArrayList<String> selects = new ArrayList<String>();

        // Definir un conjunto temporal, durante el proceso de recorrido, almacenar la
        // intersección del área cubierta por la estación de radio durante el proceso de
        // recorrido y el área actualmente no cubierta
        HashSet<String> tempSet = new HashSet<String>();

        // Definido como maxKey, guardado en un proceso transversal, puede cubrir la
        // llave de la estación correspondiente al área descubierta más grande
        // Si maxKey no es nulo, se agregará a selects
        String maxKey = null;
        while (allAreas.size() != 0) { // Si allAreas no es 0, significa que no se han cubierto todas las áreas
            // Cada vez que realizas un while, necesitas
            maxKey = null;

            // Transmisiones transversales, saca la clave correspondiente
            for (String key : broadcasts.keySet()) {
                // Cada vez que
                tempSet.clear();
                // El área actualmente cubierta por esta clave
                HashSet<String> areas = broadcasts.get(key);
                tempSet.addAll(areas);
                // Encuentra la intersección de tempSet y allAreas set, y la intersección se
                // asignará a tempSet
                tempSet.retainAll(allAreas);
                // Si la colección actual contiene el número de áreas descubiertas, más que el
                // área de colección apuntada por maxKey
                // Necesitas restablecer maxKey
                // tempSet.size ()> broadcasts.get (maxKey) .size ()) refleja las
                // características del algoritmo codicioso y elige el mejor cada vez
                if (tempSet.size() > 0 &&
                        (maxKey == null || tempSet.size() > broadcasts.get(maxKey).size())) {
                    maxKey = key;
                }
            }
            // maxKey! = null, debe agregar maxKey a selects
            if (maxKey != null) {
                selects.add(maxKey);
                // Elimina el área cubierta por la estación de transmisión a la que apunta
                // maxKey de allAreas
                allAreas.removeAll(broadcasts.get(maxKey));
            }

        }

        System.out.println("El resultado de la selección es" + selects);// [K1,K2,K3,K5]

    }

}

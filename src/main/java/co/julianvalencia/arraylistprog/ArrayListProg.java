package co.julianvalencia.arraylistprog;
import java.util.*;

/**
 * @author usuario1
 */
public class ArrayListProg {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Declaración el ArrayList
        ArrayList<String> nombreArrayList = new ArrayList<>();

        // Añadimos 10 Elementos en el ArrayList
        for (int i=1; i<=10; i++){
                nombreArrayList.add("Elemento "+i); 
        }

        // Añadimos un nuevo elemento al ArrayList en la posición 2
        nombreArrayList.add(2, "Elemento 3");

        // Declaramos el Iterador e imprimimos los Elementos del ArrayList
        Iterator<String> nombreIterator =  nombreArrayList.iterator();
        while(nombreIterator.hasNext()){
                String elemento = nombreIterator.next();
                System.out.print(elemento+" / ");
        }
        System.out.println(" / ");
        // Obtenemos el numero de elementos del ArrayList
        int numElementos = nombreArrayList.size();
        System.out.println("nnEl ArrayList tiene "+numElementos+" elementos");

        // Eliminamos el primer elemento del ArrayList, es decir el que ocupa la posición '0'
        System.out.println("n... Eliminamos el primer elemento del ArrayList ("+nombreArrayList.get(0)+")...");
        nombreArrayList.remove(0);

        // Eliminamos los elementos de ArrayList que sean iguales a "Elemento 3"
        System.out.println("n... Eliminamos los elementos de ArrayList que sean iguales a \"Elemento 3\" ...");
        nombreIterator = nombreArrayList.iterator();
        while(nombreIterator.hasNext()){
                String elemento = nombreIterator.next();
                if(elemento.equals("Elemento 3"))
                        nombreIterator.remove();	// Eliminamos el Elemento que hemos obtenido del Iterator
        }

        // Imprimimos el ArrayList despues de eliminar los elementos iguales a "Elemento 3"
        System.out.println("nImprimimos los elementos del ArrayList tras realizar las eliminaciones: ");
        nombreIterator = nombreArrayList.iterator();
        while(nombreIterator.hasNext()){
                String elemento = nombreIterator.next();
                System.out.print(elemento+" / ");
        }

        System.out.println(" / ");
        // Mostramos el numero de elementos que tiene el ArrayList tras las eliminaciones:
        numElementos = nombreArrayList.size();
        System.out.println("nNumero de elementos del ArrayList tras las eliminaciones = "+numElementos);
    }
}
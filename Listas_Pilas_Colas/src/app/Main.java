package app;

import app.utilities.Cola;
import app.utilities.List;
import app.utilities.Pila;

/**
 *
 * @author César Luigi Salcedo Espriella
 */
public class Main 
{
    public static void main(String[] args)
    {
        /*
        *   Prueba funcionamiento de la lista.
        */
        
        System.out.println("Prueba de lista:");
        
        // Instanciar la lista
        List<Integer> myList = new List();
        
        // Agregamos algunos elementos.
        myList.add(1);
        myList.add(2);
        myList.add(3);
        
        // Mostramos los elementos de la lista (Prueba toString()).
        System.out.println("Elementos inciales: " + myList);
        
        // Agregamos un elemento extra
        myList.add(4);
        System.out.println("Nuevo elemento agregado: " + myList);
        
        // Eliminamos el elemento agregado
        myList.remove(3);
        System.out.println("Elemento eliminado: " + myList);
        
        // Insertamos un elemento 
        myList.insert(4, 1);
        System.out.println("Elemento insertado: " + myList);
        
        // Reemplazamos un elemento
        myList.replace(0, 1);
        System.out.println("Elemento reemplazado: " +myList);
        
        // Obtenemos la cantidad de elementos de arreglo
        System.out.println("Cantidad de elementos de la lista: " + myList.size());
        
        // Obtenemos un elemento del arreglo valido
        System.out.println("Elemento de la posición 3: " + myList.get(3));
        
        // Obtenemos un elemento del arreglo nulo
        System.out.println("Elemento de la posición 4: " + myList.get(4));
        
        System.out.println("\nPrueba de Pila: ");
        
        // Instanciamos la Pila
        Pila<Integer> myPila = new Pila();
        
        // Agregamos algunos elementos
        myPila.add(4);
        myPila.add(5);
        myPila.add(6);
        System.out.println("Elementos inciales: " + myPila);
        
        // Extraemos un elementos
        System.out.println("Elemento extraido: " + myPila.extraer());
        System.out.println("Elementos actuales: " + myPila);
        
        // Extraemos otro
        System.out.println("Elemento extraido: " + myPila.extraer());
        System.out.println("Elementos actuales: " + myPila);
        
        // Agregamos otro
        myPila.add(10);
        System.out.println("Elementos actuales - Agregamos un elemento: " + myPila);
        
        // Vaciamos la pila
        while(myPila.size() > 0)
        {
            myPila.extraer();
        }
        
        // Extraemos
        System.out.println("Elemento extraido: " + myPila.extraer());
        System.out.println("Elementos actuales: " + myPila);
        
        System.out.println("\nPrueba de Cola: ");
        
        // Instanciamos la Cola
        Cola<Integer> myCola = new Cola();
        
        // Agregamos algunos elementos
        myCola.add(10);
        myCola.add(20);
        myCola.add(30);
        System.out.println("Elementos iniciales: " + myCola);
        
        // Extraemos un elementos
        System.out.println("Elemento extraido: " + myCola.extraer());
        System.out.println("Elementos actuales: " + myCola);
        
        // Extraemos otro elemento
        System.out.println("Elemento extraido: " + myCola.extraer());
        System.out.println("Elementos actuales: " + myCola);
        
        // Agregamos dos elementos
        myCola.add(40);
        myCola.add(50);
        System.out.println("Elementos agregados - Actuales: " + myCola);
        
        // Vaciamos la cola
        while(myCola.size() > 0)
        {
            myCola.extraer();
        }
        
        // Extramos
        System.out.println("Elemento extraido: " + myCola.extraer());
        System.out.println("Elemento actuales: " +myCola);
        
    }
}

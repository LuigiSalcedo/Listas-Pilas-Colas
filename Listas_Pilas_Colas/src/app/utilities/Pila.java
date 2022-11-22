package app.utilities;

/**
 *
 * @author César Luigi Salcedo Espriella
 * @param <T>
 */
public class Pila<T> extends List implements Apilable
{
    // Constructor
    public Pila()
    {
        super();
    }
    
    /*
    *   Sobremontura del método 'extraer()': Dentro de una pila se extraerá
    *   el ultimo elemento agregado.
    */
    @Override
    public T extraer()
    {
        // Confirmamos si el tamaño de la pila es invalido.
        if(size() == 0)
        {
            // De ser así retornamos nulo.
            return null;
        }
        
        // Obtenemos el elemento de la ultima posición.
        T a = (T)elements[size()-1];
        
        // Lo eliminamos del array
        remove(size()-1);
        
        // Retornamos el elemento.
        return a;
    }
}

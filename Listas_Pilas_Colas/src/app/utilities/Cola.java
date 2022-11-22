package app.utilities;

/**
 *
 * @author César Luigi Salcedo Espriella
 */
public class Cola<T> extends List implements Apilable 
{
    // Constructor
    public Cola()
    {
        super();
    }
    /*
    *   Sobremontura del método 'extraer()': En una cola el primer elemento
    *   agregado es el extraido.
    */
    @Override
    public T extraer()
    {
        // Verificamos si la cola no tiene un tamaño valido.
        if(size() == 0)
        {
            // De ser así retornamos nulo
            return null;
        }
        
        // Obtenemos el elemento de la primera posición.
        T a = (T)elements[0];
        
        // Lo eliminamos del array
        remove(0);
        
        // Retornamos el elemento
        return a;
    }
}

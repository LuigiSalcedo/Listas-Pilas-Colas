package app.utilities;

/**
 *
 * @author César Luigi Salcedo Espriella
 * @param <T>
 */

/*
*   Clase 'List': Cumple las funciones de una lista cualquier, similar a ArrayList.
*/
public class List<T> 
{
    // Atributos
    protected Object [] elements; // Array contenedor de elementos.
    private int len; // Variable para manejar el tamaño para el usuario.
    
    // Constructor
    public List()
    {
        // Instanciamos el Array.
        elements = new Object[1];
        
        // Primer elemento en nulo.
        elements[0] = null;
        
        // Tamaño real para el usuario inicia en 0.
        len = 0;
    }
    
    /*
    *   Método: 'size()': Retorna el número de elementos de la lista desde el
    *   punto de vista del usuario almacenado en el atributo 'len'.
    */
    public int size()
    {
        return len; // Retornamos el valor del atributo.
    }
    
    /*
    *   Método 'add(T element)': Agrega al Array el elemento recibido cómo
    *   parámetro.
    */
    public void add(T element)
    {
        // Verificamos si no hay espacio disponible
        if(len == elements.length)
        {
            // En caso de no existir espacio los aumentamos.
            incrementSize();
        }
        
        /* 
        *   Agregamos un elemento en la posición de 'len', puesto que 
        *   indirectamente guarda la siguiente posición 'vacia' del array.
        */
        elements[len] = element; 
        
        // Aumentamos el valor de 'len'.
        len++;
    }
    
    /*
    *   Método 'remove(int i)': Elimina del arreglo el elemento en la i-ésima
    *   posición.
    */
    public void remove(int i)
    {
        /*
        *   Reemplazamos todos los desde la i-ésima posición hasta la posición
        *   del valor de len - 1 por consecuente se eliminará el elemento de
        *   la i-ésima posición, al final volver null el ultimo elemento puesto
        *   que quedará duplicado.
        */
        
        // Inicialmente verificamos si recibimos un valor de i no valido.
        if(i < 0 || i >= len)
        {
            // De ser así ignoraremos el resto de proceso.
            return;
        }
        
        // Iniciamos el bucle.
        for(int x = i; x < len-1; x++)
        {
            // Guardamos la siguiente posición.
            elements[x] = elements[x+1];
        }
        
        // Disminuimos len.
        len--;
        
        // Volvemos nulo el elemento sobrante.
        elements[len] = null;
    }
    
    /*
    *   Método 'get(int i)': Retornará el elemento almacenado en la i-ésima
    *   posición.
    */
    public T get(int i)
    {
        /*
        *   Verificamos si i es un valor valido, de ser así retorna el elemento
        *   en la i-ésima posición de lo contrario retorna 'null'.
        */
        return i >= 0 && i < len ? (T)elements[i] : null;
    }
    
    /*
    *
    *   Método 'insert(T element, int i)': El método se encarga de colocar
    *   en la i-ésuma posición el 'element' recibido cómo parámetro.
    */
    public void insert(T element, int i)
    {
        // Verificamos si i no es un valido.
        if(i < 0 || i >= len)
        {
            // De ser así ignoramos el resto de proceso.
            return;
        }
        
        // Verificamos si no tenemos espacio.
        if(len == elements.length)
        {
            // De ser así aumentamos el espacio.
            incrementSize();
        }
        
        // Iniciamos a copiar elementos desde arriba arriba.
        for(int x = len; x > i; x--)
        {
            elements[x] = elements[x-1];
        }
        
        // Colocamos el elemento en la posición deseada.
        elements[i] = element;
        
        // Aumentamos el valor de len.
        len++;
    }
    
    /*
    *   Método: 'replace(T element, int i)': Reemplaza al elemento de la
    *   i-ésima posición por 'element'.
    */
    public void replace(T element, int i)
    {
        // Verificamos si i es un valor invalido
        if(i < 0 || i >= len)
        {
            // De ser así ignoramos el resto del proceso
            return;
        }
        
        // Reemplazamos
        elements[i] = element;
    }
    
    /*
    *   Método 'incrementSize()': Aumenta el tamaño real del arreglo para 
    *   tener posibilidades de agregar o insertar elementos.
    */
    private void incrementSize()
    {
        Object [] aux = elements; // Guardamos en 'aux' el contenido de elements.
        elements = new Object[aux.length * 2]; // Duplicamos el espacio disponible.
        
        // Copiamos los elementos de vuelta a array 'elements'.
        System.arraycopy(aux, 0, elements, 0, len);        
    }
    
    /*
    *   Sobremontura del método: 'toString()' retorna un objeto cómo un String.
    */
    @Override
    public String toString()
    {
        // Creamos un objeto de la clase 'StringBuilder' para más facilidad.
        StringBuilder sb = new StringBuilder("[");
        
        // Comenzamos a agregar los elementos de nuestro array.
        for(int i = 0; i < len; i++)
        {
            // Agreamos el i-ésimo elementos.
            sb.append(elements[i].toString());
            
            // Verificamos si no estamos en el ultimo.
            if(i != len-1)
            {
                // Agregamos elemento estético.
                sb.append(", ");
            }
        }
        
        // Agregamos elemento estético al final.
        sb.append("]");
        
        // Retornamos el 'toString()' de nuestro objeto StringBuilder
        return sb.toString();
    }
}

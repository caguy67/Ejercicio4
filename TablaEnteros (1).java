package losSauces.daw.edd;

public class TablaEnteros
{
    private int[] array = null;

    // Si el número de elementos del parámetro de entrada es nulo o 0, se lanza una excepción IllegalArgumentException con el mensaje "No hay elementos".
    public TablaEnteros(int[] array) throws IllegalArgumentException
    {
        if (array == null || array.length == 0)
            throw new IllegalArgumentException ("No hay elementos");
        
        this.array = array;
    }
    
    // Suma los elementos del array y devuelve la suma.
    public long sumaTabla ()
    {
        long suma = 0l;
        
        for (int val : array)
            suma += val;
        
        return suma;
    }
    
    // Devuelve el elemento mayor de la tabla.
    public int mayorTabla ()
    {
        int mayor = array[0];
        
        for (int i = 1; i < array.length; ++i)
        {
            if (array[i] > mayor)
                mayor = array[i];
        }
        
        return mayor;
    }
    
    // Devuelve la posición ocupada por el elemento cuyo valor se envía.
    // En el caso de que no se encuentre el elemento en la tabla lanza una excepción java.util.NoSuchElementException.
    public int posicionTabla (int elemento) throws java.util.NoSuchElementException
    {
        for (int i = 0; i < array.length; ++i)
        {
            if (array[i] == elemento)
                return i;
        }
        
        throw new java.util.NoSuchElementException ();
    }

}

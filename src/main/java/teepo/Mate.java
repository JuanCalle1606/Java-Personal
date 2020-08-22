package teepo;

/**
 *
 * @author Juan Pablo Calle
 */
public class Mate 
{    
	/**
	 * Encuentra el promedio d euna lista de numeros.
	 *
	 * @param numeros La lista de numeros a la que se le quiere sacar el promedio.
	 * @return El promedio de todos los numeros dados.
	 */
	public static double promedio(int... numeros)
    {
        double dev=0;
    	int cont=0;
        for (int i = 0; i < numeros.length; i++) 
        {
            dev += numeros[i];
            cont++;
        }
    	return (dev/cont);
    }
    /**
	 * Encuentra el promedio d euna lista de numeros.
	 *
	 * @param numeros La lista de numeros a la que se le quiere sacar el promedio.
	 * @return El promedio de todos los numeros dados.
	 */
    public static double promedio(double... numeros)
    {
        double dev=0;
    	int cont=0;
        for (int i = 0; i < numeros.length; i++) 
        {
            dev += numeros[i];
            cont++;
        }
    	return (dev/cont);
    }
}

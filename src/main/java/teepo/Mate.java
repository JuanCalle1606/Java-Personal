package teepo;

/**
 *
 * @author Juan Pablo Calle
 */
public class Mate 
{    
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

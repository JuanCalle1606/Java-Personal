package teepo;

/**
 *
 * @author Juan Pablo Calle
 */
public class Fibonacci 
{

	/**
	 * Calcula el numero n de la serie de fibonacci. Como extra por la consola se nos dice el promedio de la serie fibonacci hasta este numero.
	 *
	 * @param n El numero de la serie fibonacci que se quiere hallar.
	 * @return El numero de la serie de fibonacci.
	 */
	public static double calcular(double n)
	{
		double fibBase,fibInc,sum;
		short con;             

		fibBase=1;
		fibInc=1;

		//System.out.println(fibBase);
		con = 1;
		sum = 1;

		for(double i=2; i<=n; i++)
		{
			//System.out.println(fibInc);
			con++;
			sum += fibInc;
			fibInc = fibBase + fibInc;
			fibBase = fibInc - fibBase;
		}

		System.out.println("El promedio hasta el numero"+n+" de fibonacci es: " + (sum/con));

		return fibInc;
	}
}

package teepo;
/**
 *
 * @author Juan Pablo Calle
 */
public class Factorial {

	/**
	 * Calcula el factorial de un numero
	 *
	 * @param numero Un numero short al que se le quiere hallar el factorial. Este numero es short debido a que numeros muy grandes no se les haya el factorial debido a si inmensidad, el numero maximo calculable es el factorial de 170
	 *
	 */	
	public static double calcular(short numero)
	{
		if (numero < 0) 
		{
			System.out.println("No se puede hallar el factorial de un numero negativo");  
			return 0;
		}
		
		double dev = 1;

		for (short i = numero; i>0; i--) 
		{
			dev *= i;
		}

		return dev;
	}
	
}

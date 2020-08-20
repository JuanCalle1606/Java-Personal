
import teepo.Factorial;
import teepo.Fibonacci;
import teepo.Primos;
import teepo.Util;


/**
 *
 * @author Juan Pablo Calle
 */
public class Main {

		
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) 
	{
		try 
		{
			
			/*short numero;
			
			//Prueba de sacar un factorial
			numero = 7;
			Util.say(numero + "! = " + Factorial.calcular(numero));*/
						
						
			// Prueba de hallar numeros primos
			/*Primos.primosEntre(453, 3500);*/


			//Prueba numero de fibonacci
			Fibonacci.calcular(200);
		}
		catch (NullPointerException nullE)
		{
			//este error ocurre cuando se le da a la X en una ventana de tipo Input ya que devuelve un puntero a null
			Util.trace("La operación ha sido cancelada");
		}
		catch (Exception e) 
		{
			Util.trace("Ha ocurrido un error desconocido al ejecutar el programa, mirar la consola para mas detalles");
			System.out.println("Mensaje del error: " + e);
		}
	}
	
}

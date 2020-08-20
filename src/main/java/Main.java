
import teepo.Factorial;
import teepo.Fibonacci;
import teepo.Primos;
import teepo.Util;
import teepo.Figuras;
import teepo.Mate;

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
			
			short n;
			
			//Prueba de sacar un factorial
			n = 7;
			Util.say(n + "! = " + Factorial.calcular(n));
						
						
			//Prueba de hallar numeros primos
			Util.say("Hay "+Primos.primosEntre(453, 3500)+" entre 453 y 3500");


			//Prueba numero de fibonacci
			Util.say("Numero 200 de fibonacci: " + Fibonacci.calcular(200));

			// Prueba dibujar figuras
			Figuras.figuraUno();
			Figuras.figuraDos();
			Figuras.figuraTres();
			Figuras.figuraCuatro();

			//Prueba promedio numeros
			int[] arr = Primos.buscarPrimos(100);
                        Util.say("Promedio 100 primeros primos: " + Mate.promedio(arr));
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

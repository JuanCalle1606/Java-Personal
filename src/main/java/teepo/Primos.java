package teepo;

/**
 *
 * @author Juan Pablo Calle
 */
public class Primos 
{
	private static int[] primosBase;
	
   public static void primosEntre(int min,int max)
	{
		init(max);
		short primos = 0;
		for (int i = min; i <= max; i++) 
		{
			if (esPrimo(i)) 
			{
				primos++;
				//System.out.println(i);
			}
		}
		System.out.println("Se hallaron "+primos + " numeros primos");
	}
	
	public static boolean esPrimo(int numero)
	{
		for(int i = 0; i<primosBase.length;i++)
		{
			
			if ((numero%primosBase[i] == 0 && !(numero == primosBase[i])) || numero == 1)
			{
				return false;
			}
		}
		
		return true;
	}

	public static void init(int max) 
	{
		int x,k;
		boolean primo = true;
		k = 1;
		x = (int)Math.sqrt(max);
		primosBase = x/2 > 5 ? new int[x/2] : new int[6];
		primosBase[0] = 2;
		for (int i = 3; i < max; i++) 
		{
			for (int j = 0; j < primosBase.length; j++) 
			{
				primo = true;
				
				if (primosBase[j] == 0) 
				{
					break;
				}
				if (i%primosBase[j]==0) 
				{
					primo = false;
					break;
				}
			}
			if (primo) 
			{
				primosBase[k] = i;
				//System.out.println(i);
				k++;
				if(k == primosBase.length)
				{
				   return; 
				}
			}
		}
	}
	/*
	public static boolean esPrimo(int numero)
	{
		int contador = 2;
		boolean primo=true;
		while ((primo) && (contador!=numero))
		{
			if (numero % contador == 0)
			 {
				primo = false;
			 }
			contador++;
		}
		return primo;
	}*/
}
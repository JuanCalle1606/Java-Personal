package teepo;

/**
 *
 * @author Juan Pablo Calle
 */
 public class Primos 
 {

	private static int[] primosBase = new int[1];
	
	public static int[] buscarPrimosPriv(int min,int limite)
	{
		init((limite*2)*(limite*2));
		int[] dev = new int[limite];
		int con = min, primos = 0;
		
		while(dev[limite-1] == 0)
		{
			if (esPrimoPriv(con))
			{
				dev[primos] = con;
				primos++;
				//System.out.println(con);
			}
			con++;
		}
		return dev;
	}
	
	private static int primosEntrePriv(int min,int max,boolean trace)
	{
		init(max);
		int primos = 0;
		for (int i = min; i <= max; i++) 
		{
			if (esPrimoPriv(i)) 
			{
				primos++;
				if (trace)
				{
					System.out.println(i);
				}
			}
		}
		//System.out.println("Se hallaron "+primos + " numeros primos");
		return primos;
	}
	
	private static boolean esPrimoPriv(int numero)
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
	
	public static boolean esPrimo(int numero)
	{
		init(numero);
		return esPrimoPriv(numero);
	}
	
	public static int primosEntre(int min,int max)
	{
		return primosEntrePriv(min,max,false);
	}
	
	public static int primosEntre(int min,int max,boolean trace)
	{
		return primosEntrePriv(min,max,trace);
	}
	
	public static int[] buscarPrimos(int min,int limite)
	{
		return buscarPrimosPriv(min,limite);
	}
	
	public static int[] buscarPrimos(int limite)
	{
		return buscarPrimosPriv(0,limite);
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
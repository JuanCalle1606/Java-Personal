package teepo;

/**
 *
 * @author Juan Pablo Calle
 */
public class Figuras 
{
    
    private static String pat = "*";
    private static String pat2 = "_";
    private static String pat3 = "_|";
    private static String pat4 = "|_";
    
    /**
     * Dibuja una figura en la consola usando patrones y condicionales.
     */
    public static void figuraUno()
    {
        for (int i = 1; i <= 5 ;i++ )
        {
            System.out.println(repetir(i,pat));
        }
        System.out.println("");
    }
    /**
     * Dibuja una figura en la consola usando patrones y condicionales.
     */
    public static void figuraDos()
    {
        System.out.println("");
        System.out.println(repetirln(2,repetir(8,pat)));
        System.out.println(repetirln(4,repetir(2,pat)+repetir(4," ")+repetir(2,pat)));
        System.out.println(repetirln(2,repetir(8,pat)));
        System.out.println("");
    }
    /**
     * Dibuja una figura en la consola usando patrones y condicionales.
     */
    public static void figuraTres()
    {
        System.out.println("");
        for (int i = 5; i >= 0; i--)
        {
            System.out.println(repetir(i," ")+repetir(11-2*i,pat)+repetir(i," "));
        }
        System.out.println(repetir(3," ")+repetir(5,pat)+repetir(3," "));
        System.out.println(repetir(3,pat2)+repetir(5,pat)+repetir(3,pat2));
        System.out.println("");
    }
    /**
     * Dibuja una figura en la consola usando patrones y condicionales.
     */
    public static void figuraCuatro()
    {
        System.out.println("");
        System.out.println(repetir(8," ")+pat2);
        for (int i = 6; i>=0; i-=2) 
        {
            System.out.println(repetir(i," ")+pat3+repetir((13-2*i)," ")+pat4);
        }
    }
    
    private static String repetir(int can, String con) 
    { 
        return new String(new char[can]).replace("\0", con); 
    }
     
    private static String repetirln(int can, String con) 
    { 
        String dev = con;
        for (int i = 0; i < can-1;i++ ) 
        {
            dev += "\n" + con;
        }
         
        return dev;
    }
    
}
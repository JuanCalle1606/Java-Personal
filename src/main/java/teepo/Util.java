package teepo;

import javax.swing.JOptionPane;

/**
 * Clase de utilidades
 *
 * @author Juan Pablo Calle
 */
public class Util 
{

    public static void say(String Mensaje) 
    {
        System.out.println(Mensaje);
    }

    public static String input(String Mensaje) 
    {
        return JOptionPane.showInputDialog(Mensaje);
    }

    public static Number inputNumber(String Mensaje, int tipo) 
    {
        String entrada = input(Mensaje);
        
        if(entrada.equals(""))
        {
           throw new NullPointerException("Se ha cancelado la operación");
        }
        
        try {
            switch (tipo) 
            {
                case 0: 
                {
                    return Integer.parseInt(entrada);
                }
                case 1: 
                {
                    return Byte.parseByte(entrada);
                }
                case 2: 
                {
                    return Short.parseShort(entrada);
                }
                case 3: 
                {
                    return Long.parseLong(entrada);
                }
                case 4: 
                {
                    return Float.parseFloat(entrada);
                }
                case 5: 
                {
                    return Double.parseDouble(entrada);
                }
            }
        } 
        catch (NumberFormatException error) 
        {
            trace("No se podido convertir el texto proporcionado en un numero, intenta a poner otra entrada");
            return inputNumber(Mensaje, tipo);
        }
        return 0;
    }

    public static int inputInt(String Mensaje) 
    {
        return (int) inputNumber(Mensaje, 0);
    }

    public static byte inputByte(String Mensaje) 
    {
        return (byte) inputNumber(Mensaje, 1);
    }

    public static short inputShort(String Mensaje) 
    {
        return (short) inputNumber(Mensaje, 2);
    }

    public static long inputLong(String Mensaje) 
    {
        return (long) inputNumber(Mensaje, 3);
    }

    public static float inputFloat(String Mensaje) 
    {
        return (float) inputNumber(Mensaje, 4);
    }

    public static double inputDouble(String Mensaje) 
    {
        return (double) inputNumber(Mensaje, 5);
    }

    public static void trace(String Mensaje) 
    {
        JOptionPane.showMessageDialog(null, Mensaje);
    }

}

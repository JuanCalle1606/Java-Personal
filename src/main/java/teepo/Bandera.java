package teepo;
/**
 *
 * @author Juan Pablo Calle
 */
public class Bandera{
	public static void USA(){
		int flen=13,clen=50;
		initF:for(int i=0;i<flen;i++){
			initC:for(int j=0;j<clen;j++)
				System.out.print(i<7&&j<17?
				(j==0?ConsoleColors.BLUE_BACKGROUND:"")+(j%2==0?" ":"☆")+
				(j==16?i%2==0?ConsoleColors.RED_BACKGROUND:ConsoleColors.WHITE_BACKGROUND:""):
				(j==0?i%2==0?ConsoleColors.RED_BACKGROUND:ConsoleColors.WHITE_BACKGROUND:"")+
				" "+(j==clen-1?ConsoleColors.RESET:""));
			System.out.println();
		}
	}
}
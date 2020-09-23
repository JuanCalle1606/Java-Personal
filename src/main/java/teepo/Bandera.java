package teepo;
/**
 *
 * @author Juan Pablo Calle
 */
public class Bandera{
	public static void USA(){
		int flen=13,clen=50;
		initF:for(int i=0;i<flen;i++)
			initC:for(int j=0;j<clen;j++)
				System.out.print(i<7&&j<17?
				(j==0?ConsoleColors.BLUE_BACKGROUND:"")+(j%2==0?" ":"☆")+
				(j==16?i%2==0?ConsoleColors.RED_BACKGROUND:ConsoleColors.WHITE_BACKGROUND:""):
				(j==0?i%2==0?ConsoleColors.RED_BACKGROUND:ConsoleColors.WHITE_BACKGROUND:"")+
				" "+(j==clen-1?ConsoleColors.RESET+"\n":""));
	}
	public static void Colombia(){
		int flen=12,clen=50;
		initF:for(int i=0;i<flen;i++)
			initC:for(int j=0;j<clen;j++)
				System.out.print(j==0?
				(i<6?ConsoleColors.YELLOW_BACKGROUND:i<9?
				ConsoleColors.BLUE_BACKGROUND:ConsoleColors.RED_BACKGROUND)+" "
				:j<clen-1?" ":ConsoleColors.RESET+"\n");
	}
	public static void Formula1(){
		int flen=6,clen=20;
		initF:for(int i=0;i<flen;i++)
			initC:for(int j=0;j<clen;j+=2)
				System.out.print(j!=clen-2?i%2==0?
				(j/2)%2==0?ConsoleColors.WHITE_BACKGROUND+"  ":ConsoleColors.RESET+"  ":
				(j/2)%2==0?ConsoleColors.RESET+"  ":ConsoleColors.WHITE_BACKGROUND+"  "
				:ConsoleColors.RESET+"\n");
	}
}
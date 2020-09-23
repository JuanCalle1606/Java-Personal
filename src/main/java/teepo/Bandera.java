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
	public static void Pirata(){
		//esta bandera aun no esta terminada porque falta que se dibujen las espadas
		String M=ConsoleColors.WHITE_BACKGROUND+" "+ConsoleColors.RESET;
		System.out.print(ConsoleColors.WHITE_BACKGROUND+"\n \n"+ConsoleColors.RESET);
		int flen=30,clen=66;
		String[][] dev = new String[flen][clen];
		drawPirataHead(M,flen,clen,dev,20);
		initF:for(int i=0;i<flen;i++)
			initC:for(int j=0;j<clen;j++)
				System.out.print(j<clen-1?dev[i][j]:
				ConsoleColors.WHITE_BACKGROUND+"\n"+ConsoleColors.RESET);
	}
	private static void drawPirataHead(String M,int flen,int clen,String[][] dev,int c){
		initF:for(int i=0;i<flen;i++)
			initC:for(int j=0;j<clen;j++)
				dev[i][j]=i<19&&j>c&&j<45?i<4?(5-i+(i==0?1:0)>j-c)||
				(j>40+i-(i==0?1:0))?" ":M:i<7?M:i<10?
				(j>c+4&&j<c+(i==9?9:10))||(j>c+(i==9?16:15)&&j<c+21)?
				" ":M:i<12?j>c+1&&j<c+23?j<c+11||j>c+14?M
				:i==10&&(j==c+12||j==c+13)?M:" ":" ":i==12?j>c+6&&j<c+19?
				M:" ":(j-c>i-10-(i>13&&i<17?i-14:i==13?0:2))&&
				(j<55-i+(i>13&&i<17?i-14:i==13?0:2))?M:" ":" ";
	}
}
package teepo;
/**
 *
 * @author Juan Pablo Calle
 */
public class Bandera{
	public static void USA(){
		String[][] mat=new String[13][50];
		int flen=mat.length,clen=mat[0].length;
		initF:for(int i=0;i<flen;i++)
			initC:for(int j=0;j<clen;j++)
				mat[i][j]=
				(j==0?i%2==0?ConsoleColors.RED_BACKGROUND:ConsoleColors.WHITE_BACKGROUND:"")+
				" "+(j==clen-1?ConsoleColors.RESET:"");
		starF:for(int i=0;i<7;i++)
			starC:for(int j=0;j<17;j++)
				mat[i][j]=
				(j==0?ConsoleColors.BLUE_BACKGROUND:"")+(j%2==0?" ":"☆")+
				(j==16?i%2==0?ConsoleColors.RED_BACKGROUND:ConsoleColors.WHITE_BACKGROUND:"");
		outF:for(int i=0;i<flen;i++){
			outC:for(int j=0;j<clen;j++)
				System.out.print(mat[i][j]);
			System.out.println();
		}
	}
}
package teepo;
/**
 *
 * @author Juan Pablo Calle
 */
public class Matriz{
	private static void drawPat(boolean[][] pat){
		f:for(int i=0;i<pat.length;i++){
			System.out.print("| ");
			c:for(int j=0;j<pat[0].length;j++){
				System.out.print(pat[i][j]?"X ":"  ");
			}
			System.out.println("|");
		}
		System.out.println();
	}
	public static float[][] sumDigs(float[][] mat){
		int flen=mat.length,clen=mat[0].length,pos,ii,jk;
		float save1,save2;
		float[][] saves = new float[2][(clen+flen-1)];
		f:for(int i=0;i<flen;i++){
			c:for(int j=0;j<clen;j++){
				if(i!=0&&j!=0)
					continue c;
				pos=i==0?j+flen-1:flen-i-1;
				save1=0;save2=0;
				dig:for(int k=0;k<flen;k++){
					ii=flen-1-k-i;jk=j+k;
					if((ii>=0)&&(ii<flen)&&(jk<clen))
						save2+=mat[ii][jk];
					if((i+k<flen)&&(jk<clen))
						save1+=mat[i+k][jk];
				}
				saves[0][pos]=save1;
				saves[1][pos]=save2;
			}
		}
		print(flen,clen,mat);
		drawDiags(flen,clen,saves,true);
		drawDiags(flen,clen,saves,false);
		return saves;
	}
	private static void drawDiags(int flen,int clen,float[][] saves,boolean isDig1){
		loop:for (int i=0;i<clen+flen-1;i++){
			fbas:for(int j=0;j<flen;j++){
				cbas:for(int k=0;k<clen;k++){
					System.out.print(((isDig1?flen-1-j+k:j+k)==i?1:0)!=0?"o ":". ");
				}
				System.out.println();
			}
			System.out.println("Suma: "+saves[isDig1?0:1][i]+"\n");
		}
	}
	public static void print(int flen,int clen,float[][] mat){
		String[] lines = new String[flen];
		int max;
		f:for(int j=0;j<clen;j++){
		    max=1;
			c:for(int i=0;i<flen;i++){
				if(j==0)
					lines[i]="|"+mat[i][j]+"  ";
				else
					lines[i]+=mat[i][j]+(j<clen-1?"  ":"");
				max=lines[i].length()>max?lines[i].length():max;
			}
			tab:for(int i=0;i<flen;i++){
				while(lines[i].length()<max)
					lines[i]+=" ";
				lines[i]+=j<clen-1?"":"|";
			}
		}
		out:for(int i=0;i<flen;i++)
			System.out.println(lines[i]);
		System.out.println();
	}
}

public class Sort 
{
	public static void sort(int[] arreglo,Boolean isAsc)
	{
		int[] arr=new int[arreglo.length];
		int len=arreglo.length;
		for(int i=0;i<len;i++){
			arr[i]=isAsc?Integer.MIN_VALUE:Integer.MAX_VALUE;
		}
		Boolean sorted = isAsc ? sortAscCore(arreglo,arr,len) : sortDesCore(arreglo,arr,len);
		for(int i=0;i<len;i++){
			arreglo[i]=arr[i];
		}
	}

	public static void sort(int[] arreglo)
	{
		sort(arreglo,true);
	}

	private static Boolean sortAscCore(int[] arreglo, int[] arr,int len)
	{
		int save;
		loop:for(int i=0;i<len;i++){
			save=arreglo[i];
			veri:for(int j=0;j<len;j++){
				if (save>arr[j]){
					arr[j-1>=0?j-1:0]=arr[j];
					arr[j]=save;
					continue veri;
				}
				break veri;
			}
		}
		return true;
	}

	private static Boolean sortDesCore(int[] arreglo, int[] arr,int len)
	{
		int save;
		loop:for(int i=0;i<len;i++){
			save=arreglo[i];
			veri:for(int j=0;j<len;j++){
				if (save<arr[j]){
					arr[j-1>=0?j-1:0]=arr[j];
					arr[j]=save;
					continue veri;
				}
				break veri;
			}
		}
		return false;
	}

	private static void debug(int[] arr)
	{
		System.out.print("[");
		for (int i=0;i<arr.length;i++){
			System.out.print(arr[i]+(i<arr.length-1?",":"]"));
		}
		System.out.println("");
	}

	private static void debug(String msg)
	{
		System.out.println(msg);
	}
}
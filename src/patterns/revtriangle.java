package patterns;

public class revtriangle {

	public static void main(String[] args) 
	{
		int maxno=9;
		int max=9;
		int rows=max*2-3;
		for (int i = 1;i<rows;i++) 
		{

				for (int j=1;j<=maxno;j++)
				{
					System.out.print(j+" ");
				}
    
				int diff=max-maxno;
				diff=diff*2;
				for (i=0;i<diff;i++)
				{
					System.out.print("  ");
				}
				
				
				for (int j=maxno;j>=1;j--)
				{
					System.out.print(j+" ");
				}
				
				maxno--;
			  System.out.println();
		}
	}

}

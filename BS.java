
public class BS {

	public static void main(String[] args) {
		// WAP to sort array using Bubble Sort method
		int [] a = {58,56,90,12,78,1,7,5,93,145,100,54,2};
		for(int i=0; i<a.length; i++)
		{
			for(int j =1; j<a.length; j++) 
			{
				if(a[j]<a[j-1])
				{
				int temVar= a [j];
				a [j] = a [j-1];
				a[j-1]=temVar;
				
			}
	}

		}
		for(int el:a)
		{
			System.out.println(el+" ");
		}
	
	}
}


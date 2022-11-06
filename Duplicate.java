
public class Duplicate {

	public static void main(String[] args) 
	//WAP to find duplicate array
	{
		int [] a = {5,7,5,9,6,7,8,10};
		for(int i=0; i<a.length; i++) {
			for(int j =i+1; j<a.length-1; j++) 
			{
				if(a[i]==a[j]) {
				   System.out.println("match"+a[i]);
				 
				}else {
					 System.out.println("no match");
				}
			}
		}

}
}
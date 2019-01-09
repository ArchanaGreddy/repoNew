package package1;

public class OnePlusNumber {
	
	void onePlus(int[] a)
	{
	
		for (int i=0;i<=a.length-1;i++)
		{ 
			 if (a[i] < 9) { 
		            a[i] = a[i] + 1; 
		        } 
			 else
			 {
				 a[i]=0;
			 }
		}
		
		for (int i=0;i<=a.length-1;i++)
		{ 
			   
		System.out.println(a[i]);
		}
		
	}
public static void main(String[] args)
{ 
	OnePlusNumber a1=new OnePlusNumber();
	int[] a={2,2,9,9,5,7};
	a1.onePlus(a);
	
}
}

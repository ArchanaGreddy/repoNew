package package1;

public class ArrayAdd{
	 void isRotation() 
	    { 
		   String str1=new String("Hello");
		   String str21=new String("ll");
		   if(str1.contains(str21))
		   {
			   str1=str1.replace(str21,"");
			   str1=str1+str21;
			   System.out.println(str1);
		   }
		   }
	    static public void main(String[] args) 
	    { 
	        ArrayAdd obj = new ArrayAdd(); 
	        obj.isRotation();
	    } 
}

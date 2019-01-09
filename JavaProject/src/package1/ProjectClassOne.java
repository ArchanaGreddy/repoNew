package package1;

public class ProjectClassOne {

	String varName;
	int varNum;
	
	ProjectClassOne()
	{
		varName="Archana";
		varNum=20;
	}

	public String getVarName() {
		return varName;
	}

	public int getVarNum() {
		return varNum;
	}
	
	void printVariables()
	{
		System.out.println("Varname : "+varName+" VarNumber : "+varNum);
	}
}

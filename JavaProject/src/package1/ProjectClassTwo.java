package package1;

public class ProjectClassTwo {
    
	  String carName;
	  int carNum;
	  
	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	public String getCarName() {
		return carName;
	}

	public int getCarNum() {
		return carNum;
	}
    
	public void showDetails(ProjectClassOne one)
	{
		System.out.println(" VarName : "+one.varName+" VarNumber : "+one.varNum+" CarName : "+carName+" CarNumber : "+carNum);
		one.printVariables();
	}
	public static void main(String[] args)
	{
		ProjectClassTwo p1=new ProjectClassTwo();
		p1.setCarName("Audi");
		p1.setCarNum(10);
		p1.showDetails(new ProjectClassOne());
	}
}

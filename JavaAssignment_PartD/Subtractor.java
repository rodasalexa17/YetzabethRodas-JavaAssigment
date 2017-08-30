package JavaAssignment_PartD;
	import java.util.Date;

public class Subtractor extends Mathematician{
	
	//Create an overwrite constructor
	Subtractor(int no1,int no2,long rt ) 
	{
		
		this.num1=no1;
		this.num2=no2;
		this.timeRequested= new Date(rt);
		
	}
 
	//Create an overwrite constructor
Subtractor(int no1,int no2, int no3 ,long rt ) 
	{
		
		this.num1=no1;
		this.num2=no2;
		this.num3=no3;
		this.timeRequested= new Date(rt);
		
	}
	 
 
public void add(int num1, int num2) {
	
	
	
}
//Overwrite method
public void subtract(int num1, int num2,int num3) {
	
	//Make an subtraction
	result=(num1-num2)-num3;

	//Calculate response time 
	responseTime=new Date().getSeconds() -timeRequested.getSeconds();
	
	//Print result and response time
	print(result, responseTime);
}


//Overwrite method
public void subtract(int num1, int num2) {
	
	//Make an subtraction
  result=num1-num2;
	
//Calculate response time 
	responseTime=new Date().getSeconds() -timeRequested.getSeconds();
	
	//Print result and response time
	print(result, responseTime);
}


//Overwrite method
public void multiply(int num1, int num2) {
	
	
}


//Overwrite method
public void divide(int num1, int num2) {
	

}



}

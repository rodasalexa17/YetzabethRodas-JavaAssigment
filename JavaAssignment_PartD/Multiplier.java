package JavaAssignment_PartD;
import java.util.Date;

public class Multiplier extends Mathematician {
	
	//Create an overwrite constructor
	Multiplier(int no1,int no2,long rt ) 
	{
		
		this.num1=no1;
		this.num2=no2;
		this.timeRequested= new Date(rt);
		
	}
 
	//Create an overwrite constructor
Multiplier(int no1,int no2, int no3,long rt  ) 
	{
		
		this.num1=no1;
		this.num2=no2;
		this.num3=no3;
		this.timeRequested= new Date(rt);
		
	}
	 
 
public void add(int num1, int num2) {

	
	
}

public void multiply(int num1, int num2,int num3) {
	
	//Calculate an multiplication
	result=(num1*num2)*num3;

	//Calculate the response time 
	responseTime=new Date().getSeconds() -timeRequested.getSeconds();
	
	//Print the results and response time
	print(result, responseTime);
}


// overwrite
public void subtract(int num1, int num2) {
	// TODO Auto-generated method stub
	
}


//overwrite
public void multiply(int num1, int num2) {
	
	//Calculate an multiplication
	result=num1*num2;
	
	//Calculate the response time 
	responseTime=new Date().getSeconds() -timeRequested.getSeconds();
	
	//Print the results and response time
	print(result, responseTime);
}


//overwrite
public void divide(int num1, int num2) {
	// TODO Auto-generated method stub
	
}


}

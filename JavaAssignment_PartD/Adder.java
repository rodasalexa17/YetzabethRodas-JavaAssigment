package JavaAssignment_PartD;
	import java.util.Date;

public class Adder extends Mathematician{
	
	//Create a constructor which receive 2 parameters
	//and assigned time requested to the current time in miliseconds 
	 Adder(int no1,int no2,long tr) 
		{
			
			this.num1=no1;
			this.num2=no2;
			this.timeRequested= new Date(tr);
			
		}
	 
	// Create constructor which receive 3 parameters
	//and assigned time requested to the current time in miliseconds 
	 Adder(int no1,int no2, int no3,long tr ) 
		{
			
			this.num1=no1;
			this.num2=no2;
			this.num3=no3;
			this.timeRequested= new Date(tr);
			
		}
	 
	 //Create a method called add which take 2 parameters
	 public void add(int num1, int num2) {
			
			
		//add this two variables and store it in Result 
			result=this.num1+this.num2;
		
		//Calculate response time by subtracting the actual date minus
		//the time when was requested
			responseTime=new Date().getSeconds() -timeRequested.getSeconds();
		
			//print the result and response time
			print(result, responseTime);
		}

	//Create a method called add which take 3 parameters
	 public void add(int num1, int num2,int num3) {
			
			//add this three variables and store it in Result 
			result=num1+num2+num3;
			//Calculate response time by subtracting the actual date minus
			//the time when was requested
			responseTime=new Date().getSeconds() -timeRequested.getSeconds();
			
			//print the result and response time
			print(result, responseTime);
		}
	//Overwrite method
		public void subtract(int num1, int num2) {
			// TODO Auto-generated method stub
			
		}


		//Overwrite method
		public void multiply(int num1, int num2) {
			// TODO Auto-generated method stub
			
		}


		//Overwrite method
		public void divide(int num1, int num2) {
			// TODO Auto-generated method stub
			
		}
	 
}

package JavaAssignment_PartD;
	import java.util.Date;
	
public class Divider extends Mathematician{ 

	//Create an overwrite constructor
		Divider(int no1,int no2,long tr ) 
			{
				
				this.num1=no1;
				this.num2=no2;
				this.timeRequested= new Date(tr);
				
			}
		 
	//Create Overwrite constructor
		Divider(int no1,int no2, int no3,long tr ) 
			{
				
				this.num1=no1;
				this.num2=no2;
				this.num3=no3;
				this.timeRequested= new Date(tr);
				
			}
			 
		 
		public void add(int num1, int num2) {
			
			
			
		}

		public void divide(int num1, int num2,int num3) {
			
			//Make an division operation
			result=(num1/num2)/num3;
		
			//Calculate the response time 
			responseTime=new Date().getSeconds() -timeRequested.getSeconds();
			
			//Print the results
			print(result, responseTime);
		}


		//Overwrite method
		public void subtract(int num1, int num2) {
			
			
		}


		//Overwrite method
		public void multiply(int num1, int num2) {
			
			
		}


		//Overwrite method
		public void divide(int num1, int num2) {
			//Make an division operation
			result=num1/num2;
			
			//Calculate the response time 
			responseTime=new Date().getSeconds() -timeRequested.getSeconds();
			
			//Print the results
			print(result, responseTime);
		}

}

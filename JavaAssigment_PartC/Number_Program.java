package JavaAssigment_PartC;

	import java.util.ArrayList;
	import java.util.List;

	public class Number_Program  extends Thread{

		//Declare variables
		int start;
		int end ;
		String numberType;
		//Create an array integer type
		// It provides us dynamic arrays in Java.
		List<Integer> numberList =new ArrayList<Integer>();
		
		
		
		//Create a constructor
		Number_Program(String Type ,int start, int end )
		
		{
			
			this.numberType=null;
			numberType=Type;
			this.start=start;
			this.end=end;	
			
		}
		
		//Create run method
		public void run() {
			
		for (int i =this.start;i<=this.end; i++)
		{
		//Check for the even numbers
			if (this.numberType=="EVEN") 
		{
			  if(i%2 == 0){
	             
				 
				  numberList.add(i);
				  
	          }
			  
		}
			//Check for the odd numbers
			if (this.numberType=="ODD") 
			{
				  if(i%2 != 0){
		             
					
					  numberList.add(i);
					  
		          }
				  
			}	
			  
		}
		
		}
		//Create a method display which display the numbers in number list   
		public void display() {
			
			
			   System.out.println("Enter Range of Numbers ");
			   System.out.println(this.start+"   "+ this.end);
			   
			if (this.numberType=="ODD") 
			{
				System.out.println("ODD Numbers in given range are");
			} else 
			
				System.out.println("EVEN Numbers in given range are");
			
			for (Integer object: this.numberList) {
			    System.out.println(object);
			}
			   System.out.println();
				}
		
	}




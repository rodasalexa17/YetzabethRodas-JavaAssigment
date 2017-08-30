package JavaAssigment_PartC;

public class Main_Program{

	public static void main(String[] args) throws InterruptedException{
		
		//Create an object 
		Number_Program th1 =new Number_Program("ODD",20,40);
		
		//start the object
		th1.start();
	
		//Create an object 
		Number_Program th2 =new Number_Program("EVEN",20,40);
		
		//start the object
		th2.start();
		
		//Call join method in the object
		//The join method allows one thread to wait for the completion of another
		th1.join();
		
		//Call join method in the object
		//The join method allows one thread to wait for the completion of another
		th2.join();
		
		// Display the object
		th1.display();
		th2.display();

	}

}

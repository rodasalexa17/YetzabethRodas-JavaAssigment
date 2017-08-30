package JavaAssignment_PartD;

	import java.io.FileWriter;
	import java.io.IOException;
	import java.time.format.DateTimeFormatter;
	import java.util.Calendar;
	import java.util.Date;
	import java.util.Scanner;
	import java.io.File;
	import java.io.FileOutputStream;

public class InputCollector {
	//Declare variable
	 int num1;
	 int num2;
	 int num3;

	long  timeRequested;
	
	
	
// Create a constructor  
	InputCollector() throws IOException
	{
//Use Calendar.getInstance() to get the current time
	
		Calendar cal = Calendar.getInstance();
//Convert into miliseconds and assign it to time requested 
	       
		timeRequested= cal.get(Calendar.MILLISECOND);
					        
	}

		
	
	
	
//Create a public method collectInput() which display a main menu	
	public void collectInput()
	
	{

        System.out.println("Choose the operation that you want to do: ");

        System.out.println("1. Addition ");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication ");
        System.out.println("4. Divide");
        
        
        
      //Take the input using scanner  
        Scanner s1 = new Scanner(System.in);
        
        //Store it in variable choice
        int choice = s1.nextInt();
    
        System.out.println("Enter First Number");
        
    	//Take first number and store it in num1 
	        num1 = s1.nextInt();
	
	        System.out.print("Enter Second Number");
	        
	      //Take second number and store it in num2
	        num2= s1.nextInt();
	       
	     
	        System.out.print("Do you have another number for the operation?  press 1 for Yes  or 2 for No");
	     // store the answer in i variable  
	        int i= s1.nextInt();
	       
	        

 //Create a switch cases to resolve the operation requested
           switch (choice){
        
                 
        
                case 1:  // addition
        
                	
                {	   
                  	 if (i==1)
                 	{
                 	
                		
                 	System.out.print("Enter Third Num");
                 	
          	              num3= s1.nextInt();
          	            new Adder(num1,num2,num3, timeRequested).add(num1, num2,num3);
          	         
                 	}else if (i==2) {
                 		
                 		  new Adder(num1,num2,timeRequested).add(num1, num2);
                 		
                 	} else   System.out.print("Inavlid Option") 
                 		;
                     
                }
                
                break;
                case 2:// subtraction
        
                {

                	 if (i==1)
     	        	{
     	        	
     	        	System.out.print("Enter Third Num");
                 	
          	              num3= s1.nextInt();
          	            new Subtractor(num1,num2,num3,timeRequested).subtract(num1, num2,num3);
     	        	
     	        	}else if (i==2) {
     	        		
     	        		  new Subtractor(num1,num2,timeRequested).subtract(num1, num2);
     	        		
     	        	} else   System.out.print("Inavlid Option") 
     	        		;
                     
                     s1.close();
                }
                break;
                case 3: // multiplication
                {
                   	System.out.print("he is here");
                  
                	 if (i==1)
	     	        	{
	     	        	
	     	        	System.out.print("Enter Third Num");
	                 	
	          	              num3= s1.nextInt();
	          	            new Multiplier(num1,num2,num3,timeRequested).multiply(num1, num2, num3);
	     	        	
	     	        	}else if (i==2) {
	     	        		
	     	        		  new Multiplier(num1,num2,timeRequested).multiply(num1, num2);
	     	        		
	     	        	} else   System.out.print("Inavlid Option") 
	     	        		;
	                     
	                     s1.close();
                }
                break;
                case 4: // division
          
                {
                	 if (i==1)
	     	        	{
	     	        	
	     	        	System.out.print("Enter Third Number");
	                 	
	          	              num3= s1.nextInt();
	          	            new Divider(num1,num2,num3,timeRequested).divide(num1, num2, num3);
	     	        	
	     	        	}else if (i==2) {
	     	        		
	     	        		  new Divider(num1,num2,timeRequested).divide(num1, num2);
	     	        		
	     	        	} else   System.out.print("Inavlid Option") 
	     	        		;
	                     
	                     s1.close();
	                     
                }
                break;
                    }
         
            System.gc();    
	}
}
	
//	public void writelogFile()
//	
//	{
//		
//		FileOutputStream fop = null;
//		File file;
//		
//		
//		//String  = timeRequested;
//		
//		Calendar cal = Calendar.getInstance();
//	       
//		//timeRequested= 
//		
//		
//		
//		String content ="dfdf" ;  //call to String();
//
//		try {
//
//			file = new File("Mathematician’s Log book.txt");
//			fop = new FileOutputStream(file);
//
//			// if file doesn't exists, then create it
//			if (!file.exists()) {
//				file.createNewFile();
//			}
//			// get the content in bytes
//			byte[] contentInBytes = content.getBytes();
//
//			fop.write(contentInBytes);
//			fop.flush();
//			fop.close();
//
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (fop != null) {
//					fop.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
//	}
//
//}

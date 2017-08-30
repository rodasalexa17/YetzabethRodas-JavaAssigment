package JavaAssignment_PartD;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
//We have to import the library java.util.Date in order
//to use the class date
	import java.util.Date;

public abstract class Mathematician {
	//Declaring five protected variables
	protected int num1;
	protected int num2;
	protected int num3;
	protected int result;
	protected int responseTime ;
	//Declaring object date variable 'Time requested'
	Date timeRequested;
	
	
	//Creating four abstract method
	public abstract void add(int num1,int num2);
	public abstract void subtract(int num1,int num2);
	public abstract void multiply (int num1,int num2);
	public abstract void divide(int num1,int num2);
	
	//Create a print method which display 2 message
	//"The answer to your inquiry is    " 
	//" Response time:  is    "
	
	public void print(int result,int seconds )
	{
		System.out.println("The answer to your inquiry is    " + result);
		System.out.println(" Response time is:  " + seconds);
		String logMessage = "The answer to tyour inquiry is; " + result+ "response time is " + seconds;
		writelogFile(logMessage);
		
	}
public void writelogFile(String inq_det )
	
	{
		
		FileOutputStream fop = null;
		File file;
		
		
		//String  = timeRequested;
		
		Calendar cal = Calendar.getInstance();
	       
// get the time and convert it to String 
		int date = cal.getTime().getSeconds();             
		//SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		//String date1 = format1.format(date);            
//		
		try {

			file = new File("Mathematician’s_Log book.txt");
			fop = new FileOutputStream(file);

			// if file no exist, then create it
			
			
			if (!file.exists()) {
				file.createNewFile();
			}
			String content= inq_det +date;
			
			
			// get the date content in bytes and write the bytes to the file
			
			
			
			byte[] contentInBytes = content.getBytes();

			fop.write(contentInBytes);
			fop.flush();
			fop.close();
		

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fop != null) {
					fop.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

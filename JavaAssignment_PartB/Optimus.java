package JavaAssignment_PartB;
import java.io.*;


public class Optimus {
	//Initialize the variables
	private static int x = 0;
	private static int y = 0;
	//Create a string call udlr and length 10
	private static char[] udlr = new char[10];
	public static void main(String[] args) throws IOException{
		//Lets implement an error control mechanism
		try {
			//Lets get the users entry
			BufferedReader reader = new BufferedReader
					(new InputStreamReader(System.in));
			System.out.println("Enter the direction by use only U,D,L or R");
			String direction = reader.readLine();
			udlr = direction.toCharArray();
			//Check for the String.length and display an error if its greater 
			//than 10 characteres
			if (direction.length() > 10) {
				System.out.println("I won't be able to make it that far");
	
			}
			//If the string. length is between 0 and 10,let's do switch cases 
			if(direction.length() <= 10 && direction.length() > 0) {
				for (char list : udlr) {
					switch(list) {
	//If the user type 'U'in the xy plane its gonna go up 
					case 'U':
						y = y + 1;
						break;
		//If the user type 'D'in the xy plane its gonna go to down 
					case 'D' :
						y = y - 1;
						break;
		//If the user type 'L'in the xy plane its gonna ton the left
					case 'L' :
						x = x - 1;
						break;
		//If the user type 'U'in the xy plane its gonna go to rigth 
					case 'R' :
						x = x + 1;
						break;
					default: 
		//Create an exception for wrong character
						throw new IOException("Wrong Character");
					}
				}
		//Print the xy value 
				System.out.print(x + "," + y);
			}
		
		}
		//In the catch block print an error if the user enter 
		//a wrong character
		catch (IOException ioe) {
			System.out.println("Wrong Character");
		}
	}

}

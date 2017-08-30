package JavaAssignment_PartA;
import java.util.Scanner;

public class ArrayJava {


	public static void main(String[] args) {
	// Create a scanner object for taking input
			
		    Scanner s = new Scanner(System.in); 
			System.out.println("Please enter the size of elements in the array");
	// Take the number of elements and stored it 
			int n = s.nextInt();  
   // Create an array of size n
			
			int array[] = new int[n]; 
			System.out.println("Please enter elements in the array");
			
			for(int i=0; i<n; i++)
			{
				array[i] = s.nextInt(); 
			}
//			System.out.println("Please enter the index of the array elements you want to access");
//			
			//go to the method getIndex
			getIndex(array, n); 
//			
		}
	
public static void getIndex(int[] l, int x){
		//Lets implement an error control mechanism
		Scanner s= new Scanner(System.in); 
		System.out.println("Enter index of the array you want to access ");
		
		int index = s.nextInt(); 
		
		try{ 
			System.out.println(l[index]);
		}
		
		catch(ArrayIndexOutOfBoundsException  e){
			System.out.println(e.getClass());
		}
		
		
	}
}


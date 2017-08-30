package JavaAssignment_PartD;
import java.io.IOException;

public class Main {

	public static void main(String[] args)throws IOException  {
		InputCollector si = new InputCollector( );
		si.collectInput();
		
		//lets run the garbage collector
		System.gc();
	}

}

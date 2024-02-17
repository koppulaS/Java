package realtime;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Details {
      	
	public static void main(String[] args) throws IOException {
		
		PersonalDetails nm=new PersonalDetails();
		Currentdtls crdtls=nm.adrs.currentdtls;
		Permanentdtls perdtls=nm.adrs.permanentdtls;
		
		FileWriter fw=new FileWriter( "E:\\java files\\Data.txt");
	      
	  	 BufferedWriter bw=new BufferedWriter(fw);
	  	  bw.write("====personal details");
	  	 bw.write(nm.name);
	  	  bw.newLine();
	  	  bw.write("current address details===");
	  	  bw.write(crdtls.village);
	  	  bw.close();
	  	 

		
	} 
}

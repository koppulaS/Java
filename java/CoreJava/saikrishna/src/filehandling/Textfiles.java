package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Textfiles {
     public static void main(String[] args) throws IOException {
		
  	 FileWriter fw=new FileWriter("E:\\java files\\Data.txt");
      
  	 BufferedWriter bw=new BufferedWriter(fw);
  	  bw.write("this is krishna");
  	  bw.newLine();
  	  bw.write("from nirmal");
  	 
  	  bw.close();
	}
}

/**
 * 
 */
package FileInputOutput;
import java.io.*;

/**
 * @author Sonal
 *
 */
public class FileInputOutput1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// code for creating the file
				File obj =new File("C:\\Users\\Chintu\\eclipse-workspace\\HelloWorld\\src\\FileInputOutput\\Javafile.txt");
				try {

					boolean file= obj.createNewFile();
					if(file) {
						System.out.println("File has been created successfully...");
					}
					else {
						System.out.println("File already present...");
					}

				}
				catch(IOException e) {
					System.out.println("Exception occured:");
					e.printStackTrace();
				}


				//code for writing content in Javafile file
				String content="Hii.. I am learninig java,which is most popular language and java is very simple language.I love java...";
				FileOutputStream fileOpS=null;
				try {

					fileOpS=new FileOutputStream(obj);
					if(!obj.exists()) {
						obj.createNewFile();
					}
					byte [] bytesArr=content.getBytes();
					fileOpS.write(bytesArr);
					fileOpS.flush();
					System.out.println("File Written sucessfully....");
				}
				catch(IOException e){
					e.printStackTrace();
				}

				//code for reading Javafile file
				BufferedInputStream bfIpS=null;
				FileInputStream fileIpS=null;
				try {
					 fileIpS=new FileInputStream(obj);
					bfIpS=new BufferedInputStream( fileIpS);
					while(bfIpS.available()>0) {
						System.out.println((char)bfIpS.read());
					}
				}

				catch(FileNotFoundException fne){
					System.out.println("FileNotFoundException occured:");
					fne.printStackTrace();
				}
				catch(IOException e){
					e.printStackTrace();
				}
			// code for append to Javafile file
				try {
					String newContent="java is secure,robust,high level programming language.which is developed by James Gosling in 1995.";
					if(!obj.exists()) {
						obj.createNewFile();
					}
					FileWriter filew=new FileWriter(obj,true);
					BufferedWriter Bfw=new BufferedWriter(filew);
					Bfw.write(newContent);
					Bfw.close();
					System.out.println("Data successfully append....");
				}
				catch(IOException e){
					e.printStackTrace();
				}
				//code for reading Javafile file after append 
				BufferedInputStream binputs=null;
				FileInputStream fs=null;
				try {
					fs=new FileInputStream(obj);
					binputs=new BufferedInputStream(fs);
					while(binputs.available()>0) {
						System.out.println((char)binputs.read());
					}
				}

				catch(FileNotFoundException fe){
					System.out.println("FileNotFoundException occured:");
					fe.printStackTrace();
				}
				catch(IOException e){
					e.printStackTrace();
				}
			}//end main 

		}//end class
	/*
	 
	 output
	 File has been created successfully...
File Written sucessfully....
H
i
i
.
.
 
I
 
a
m
  */


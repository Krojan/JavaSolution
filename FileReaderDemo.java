package Spring2018;

import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) {

		FileReader fr=null;

		try {
			fr=new FileReader("C:\\Users\\Admin\\Desktop\\Eclipse\\PUExam2020\\src\\Spring2018\\input.txt");
			int i;
			while((i=fr.read())!=-1) {
				System.out.println((char)i);	
			}
		}

		catch(IOException e) {
			System.err.println(e);	
		}
		//finally if(fr!=null) then fr.close()
		
	}
}


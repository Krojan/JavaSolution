package Spring2018;
import java.io.*;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw=null;
		FileWriter fw=null;
		
		
		try {
			fw=new FileWriter("C:\\Users\\Admin\\Desktop\\Eclipse\\PUExam2020\\src\\Spring2018\\output.txt");
			bw=new BufferedWriter(fw);
			String s="this is file written by buffered writer";
			bw.write(s);
			System.out.println("written successfully");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(bw!=null) {
				bw.close();
				
			}
		}

	}

}

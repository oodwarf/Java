package ch9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class StreamReaderWriter {

	public static void main(String[] args) {
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			FileInputStream in=new FileInputStream("d:/src.txt");
			InputStreamReader isr=new InputStreamReader(in);
			br=new BufferedReader(isr);
			FileOutputStream out=new FileOutputStream("d:/des.txt");
			OutputStreamWriter osw=new OutputStreamWriter(out);
			bw=new BufferedWriter(osw);
			String line;
			while((line=br.readLine())!=null){}
			bw.write(line);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				br.close();
				bw.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}

package ch9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestReaderWriter {
	
	public static void main(String[] args) {
		copyFile();
		copyBufferedFile();
	}

	private static void copyBufferedFile() {
		// TODO 自动生成的方法存根
		FileReader fr=null;
		FileWriter fw=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		String tempString=" ";
		try {
			fr=new FileReader("d;/a.txt");
			fw=new FileWriter("d:/d.txt");
			br=new BufferedReader(fr);
			bw=new BufferedWriter(fw);
			while((tempString=br.readLine())!=null){
				bw.write(tempString);
			}
		}catch (FileNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				bw.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				br.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				fw.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				fr.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	private static void copyFile() {
		// TODO 自动生成的方法存根
		FileReader fr=null;
		FileWriter fw=null;
		int c=0;
		try {
			fr=new FileReader("d:/a.txt");
			fw=new FileWriter("d:/d.txt");
			while((c=fr.read())!=-1){
				fw.write(c);
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				fw.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

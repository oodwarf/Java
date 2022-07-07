package ch9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedStream {

	public static void main(String[] args) {
		copyFile("d:/a.txt","d:/b.txt");
	}
	static  void copyFile(String src,String dec){
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		int temp=0;
		try {
			fis=new FileInputStream(src);
			fos=new FileOutputStream(dec);
			bis=new BufferedInputStream(fis);
			bos=new BufferedOutputStream(fos);
			while((temp=bis.read())!=-1){
				bos.write(temp);
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try{
				bos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
			try {
				bis.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

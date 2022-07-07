package ch9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
	
		public static void main(String[] args){
			testFileOutputStream();
			textFileInputStream();
		}
		

	public static void textFileInputStream() {
			// TODO 自动生成的方法存根
		FileInputStream fis=null;
		StringBuilder sb=new StringBuilder();
		int temp=0; 
		long time1=System.currentTimeMillis();
		try {
			fis=new FileInputStream("d:/a.txt");
			while((temp=fis.read())!=-1){
				sb.append((char)temp);
			}
			//使用数组作为缓存，读取的效率大大提高
			System.out.println(sb);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				fis.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		long time2=System.currentTimeMillis();
		System.out.println("耗时："+(time2-time1));
		}


	public static void testFileOutputStream() {
		// TODO 自动生成的方法存根
		FileOutputStream fos=null;
		String string="abcdefg";
		try{
			fos=new FileOutputStream("d:/a.txt");
			fos.write(string.getBytes());
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}

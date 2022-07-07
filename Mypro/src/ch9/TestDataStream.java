package ch9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class TestDataStream {

	public static void main(String[] args) {
		DataOutputStream dos=null;
		DataInputStream dis=null;
		try {
			dos=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("D:\\data.txt")));
			dis=new DataInputStream(new BufferedInputStream(new FileInputStream("D:\\data.txt")));
			dos.writeDouble(Math.random());
			dos.writeBoolean(true);
			dos.writeInt(10);
			dos.writeChar('a');
			dos.writeUTF("中国字");
			dos.flush();
			System.out.println("double:"+dis.readDouble());
			System.out.println("boolean:"+dis.readInt());
			System.out.println("int:"+dis.readInt());
			System.out.println("char:"+dis.readChar());
			System.out.println("String"+dis.readUTF());
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				dos.close();
			}catch(IOException e){
				e.printStackTrace();
			}
			try {
				dis.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}

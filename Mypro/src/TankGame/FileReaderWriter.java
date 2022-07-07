package TankGame;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWriter {
	//本地测试

	public static void main(String[] args) {
	//	FileWriter(new Score(" aa",4));
	//	FileWriter(new Score(" ab",5));
	//	FileWriter(new Score(" ac",2));
		FileReader();
	}

	public static void FileReader() {
		// TODO 自动生成的方法存根
		FileReader fr=null;
		BufferedReader br=null;
		String tempString=" ";
		try {
			fr=new FileReader("d:/score.txt");
			br=new BufferedReader(fr);
			String highestPlayer=" ";
			int highestScore=0;
			while((tempString=br.readLine())!=null){
				System.out.println(tempString);
				String[] str=tempString.split(" ");
				/**
				 * for(String string:str){
				 * System.out.println(string);
				 * }*/
				int sc=Integer.parseInt(str[1]);
				if(sc>highestScore){
					highestPlayer=str[0];
					highestScore=sc;
				}
			}
			System.out.println("游戏最高分是"+highestScore+",玩家名"+highestPlayer);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e1) {
				// TODO: handle exception
				e1.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}

	public static void FileWriter(Score score){
		FileWriter fw=null;
		BufferedWriter bw=null;
		String tempString=score.getPlayer().trim()+" "+score.getScore();
		try {
			fw=new FileWriter("d:/score.txt",true);
			bw=new BufferedWriter(fw);
			bw.write(tempString);
			bw.newLine();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				bw.close();
			} catch (IOException e1) {
				// TODO: handle exception
			}
			try {
				fw.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}

package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	private Connection conn=null;
	private PreparedStatement st=null;
	private ResultSet rs=null;
	public Connection getConnection(){
		try {
			Class.forName("org.logicalcobwebs.proxool.ProxoolDriver" );
			conn=DriverManager.getConnection("proxool.mysql");
			/*Class.forName("com.mysql.jdbc.Driver");
			//2.�������Ӷ���
			String url="jdbc:mysql://localhost:3306/management";
			conn=DriverManager.getConnection(url,"root","root");*/
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
	
	//ִֻ��select
	public ResultSet selectDB(String sql,Object[] objs){
		int ret=0;
		try {
			//3.sql���׼��  ����ִ��sql������
			conn=getConnection();
			st=conn.prepareStatement(sql);
			if(objs!=null){
				for(int i=0;i<objs.length;i++){
					st.setObject(i+1,objs[i]);
				}
			}
			rs=st.executeQuery();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rs;
	}
	
	//ִֻ��insert update delete
	public int updateDB(String sql,Object[] objs){
		int ret=0;
		try {
			conn=getConnection();
			//3.sql���׼��  ����ִ��sql������
			st=conn.prepareStatement(sql);
			if(objs!=null){
				for(int i=0;i<objs.length;i++){
					st.setObject(i+1, objs[i]);
				}
			}
			ret=st.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			closeDb();
		}
		return ret;
	}
	
	public int deleteDB(String sql,Object[] objs){
		int ret=0;
		try {
			conn=getConnection();
			//3.sql���׼��  ����ִ��sql������
			st=conn.prepareStatement(sql);
			if(objs!=null){
				for(int i=0;i<objs.length;i++){
					st.setObject(i+1, objs[i]);
				}
			}
			ret=st.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			closeDb();
		}
		return ret;
	}
	
	public void closeDb(){
		//5.�ر���Դ
		try {
			if(rs!=null){
				rs.close();
			}
			if(st!=null){
				st.close();
			}
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

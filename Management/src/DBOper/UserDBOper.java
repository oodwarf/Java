package DBOper;



import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBUtil;
import Bean.User;

public class UserDBOper {

	//��ͨ�û�ע��---Insert
	public int InsertUser(User u){
		String sql="insert into user(NAME,password,type) values(?,?,2)";
		DBUtil db=new DBUtil();
		Object[] objs={u.getName(),u.getPwd()};
		
		return db.updateDB(sql, objs);
	}
	
	//�����ͨ�û����Ƿ����-���ڱ����û���ͻ
	public int checkUser(String name){
		String sql="select * from user where name=? and type=2";
		DBUtil db=new DBUtil();
		Object[] objs={name};
		int ret=0;
		try {
			ResultSet rs=db.selectDB(sql, objs);
			while(rs.next()){
				ret=1;
				break;
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			db.closeDb();
		}
		
		return ret;//0-��ʾ������  1-��ʾ����
	}
	
}

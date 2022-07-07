package DBOper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bean.Message;

import util.DBUtil;

public class MessageDBOper {
	private PreparedStatement st=null;
	private DBUtil db=new DBUtil();
	
	//减库存
	public int updateMessageNum(int id){
		String sql="update message set num=num-1 where id=?";
		Object[] objs={id};
		int ret=db.updateDB(sql, objs);
		return ret;
	}
	
	
	public int deleteMessageNum(int id){
		String sql="delete from message where id=?";
		Object[] objs={id};
		int ret=db.deleteDB(sql,objs);
		return ret;
		
	}
	
	
	
	//使用数据库获取数据
		public List<Message> getListFromDb(){
			List<Message> list=new ArrayList<Message>();
			try {
				String sql="select * from message";
				ResultSet rs=db.selectDB(sql, null);
				//4.查询结果
				while(rs.next()){//只需要rs对象 前面的都不要
					list.add(new Message(rs.getInt("id"),rs.getString("name"),rs.getString("position"),rs.getInt("num")));
				}
				for(Message message:list){
					System.out.println(message.toString());
				}
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally{
				db.closeDb();
			}
			return list;
		}

}


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
	
	//�����
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
	
	
	
	//ʹ�����ݿ��ȡ����
		public List<Message> getListFromDb(){
			List<Message> list=new ArrayList<Message>();
			try {
				String sql="select * from message";
				ResultSet rs=db.selectDB(sql, null);
				//4.��ѯ���
				while(rs.next()){//ֻ��Ҫrs���� ǰ��Ķ���Ҫ
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


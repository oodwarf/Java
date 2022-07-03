package ch6;

public class Undergraduate  extends Student{
	String degree;//学位

	public Undergraduate(int id, String name, String degree) {
		super(id, name);
		this.degree = degree;
	}
	
	
	public void show(){
		System.out.println("我的名字是："+name+",我的学位是："+degree);
	}
	
	//方法重写
	/*
	 * 重写(Override)注意事项
	 * 1.重写父类方法时，不可降低方法的访问权限，但是可以提高*/
	public void study(){
		System.out.println("本科生在学习");
	}
	
	public static void main(String[] args){
		Undergraduate u=new Undergraduate(001, "张三", "工学硕士");
		u.study();
	//u.show();
	}
}

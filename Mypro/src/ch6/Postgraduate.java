package ch6;

public class Postgraduate  extends Student{

	String degree;
	
	public Postgraduate(int id, String name, String degree) {
		super(id, name);
		this.degree = degree;
	}

	public void show(){
		System.out.println("我的名字"+name+",我的学位是："+degree);
	}
	
	//方法重写(override)
	public void study(){
		System.out.println("研究生在学习");
	}
	
	public static void main(String[] args) {
		Postgraduate p=new Postgraduate(001, "李四", "工学硕士");
		//p.study();
		Student[] students=new Student[]{
				p,new Undergraduate(002, "张三", "工学学士"),
				new Undergraduate(003, "王五", "工学硕士"),
				new Postgraduate(001, "赵六", "理学硕士")
		};
		for(int i=0;i<students.length;i++){
			students[i].study();
		}
	}

}

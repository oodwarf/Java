package ch5;
//定义学生类

/*
 * 访问权限
 * private(1只有本类能访问)<defauly(默认)(2 本类和本包的其他类可以访问)<peotected(3 本类、本包、子类可以访问)<public(4都可以访问)
 * 同类、同包、子类，其他*/
public class Student {
//类的成员变量(属性)有学号、姓名、性别等
	int id;
	String name;
	private char sex;
	int age;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	//类的成员方法有学习、选课等
	public void study(){
		String course;
		int duration;
		System.out.println(id+"学生在学习");
	}
	
	public Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		Student s=new Student(001,"张三");//new一个实例化对象，然后调用方法
		/*s.id=001;
		s.study();*/
		System.out.println(s.name);
	}

}

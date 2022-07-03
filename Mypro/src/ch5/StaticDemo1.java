package ch5;
class Test{
	//static方法（相当于类级别的）不能直接调用非static的方法（对象级别）
	static String staticStr="静态的变量";
	String str="非静态的变量";
	public static void test1(){
		System.out.println("静态方法");
	}
	public void test2(){
		System.out.println("非静态方法");
	}
}
public class StaticDemo1 {

	public static void main(String[] args) {
		Test.test1();
		System.out.println(Test.staticStr);
		Test t=new Test();
		t.test2();//需要实例化之后才能调用
		System.out.println(t.str);
	}

}

package ch2;

public class Example15 {
	//变量的作用域：变量定义在某一对大括号中，该大括号所包含的代码区域便是这个变量的作用域
	
	public static void main(String[] args) {
		int x=12;//定义了变量x
		{
			int y=96;//定义了变量y
			System.out.println("x is"+"\t"+ x);//访问变量x
			System.out.println("y is"+"\t"+y);//访问变量y
		}
		//y=x;访问变量x，为变量y赋值
		System.out.println("x is"+"\t"+x);//访问变量x
	}

}


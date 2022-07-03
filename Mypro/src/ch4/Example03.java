package ch4;

public class Example03 {
//动态初始化
	//数据类型[] 数组名=new 数据类型[]{v1,v2,v3v...,vn};
	public static void main(String[] args) {
		//数组越界异常
		int arr[]=new int[4];//定义一个长度为4的数组
		System.out.println("arr[0]="+arr[4]);//通过角标4访问数组元素
	}

}

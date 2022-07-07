package ch4;

public class Example01 {
//定义数组的格式有以下两种
	//数据类型 [] 数组名称=new 数据类型[size];
	//数据类型 数组名称[]=new 数据类型[size];  不推荐使用
	public static void main(String[] args) {
		int [] arr=new int[4];//定义可以存储4个元素的整数类型数组
		arr[0]=1;//为第1个元素赋值
		arr[1]=2;//为第2个元素赋值
		System.out.println("arr[0]="+arr[0]);
		System.out.println("arr[1]="+arr[1]);
		System.out.println("arr[2]="+arr[2]);
		System.out.println("arr[3]="+arr[3]);
	}

}


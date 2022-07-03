package ch4;

public class Example04 {

	public static void main(String[] args) {
		//空指针异常
		int arr[]=new int[3];//定义一个长度为3的数组
		arr[0]=5;//为数组的第一个元素赋值
		System.out.println("arr[0]="+arr[0]);//访问数组元素
		arr=null;
		System.out.println("arr[0]="+arr[0]);//访问数组元素
	}

}
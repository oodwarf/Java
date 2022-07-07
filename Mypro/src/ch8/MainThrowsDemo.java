package ch8;

public class MainThrowsDemo {
//在主方法中的所以异常都可以抛出
	public static void main(String[] args) throws Exception{
		int x=0;
		int y;
		y=0;
		System.out.println("除法操作："+x/y);//调用除法计算方法
	}

}
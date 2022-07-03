package ch3;

public class Example10 {
//编写一程序，求10!
	public static void main(String[] args) {
		int result=1;
		int i=1;
		do{
			result *=i;//result=result*i
			i++;//i的值自增
		}while(i<=10);//循环条件
		
		//result=1*2*3*4*5*6*7*8*9*10;
		System.out.println("10!="+result);
		
	}

}

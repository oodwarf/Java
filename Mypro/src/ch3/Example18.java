package ch3;

public class Example18 {
	//return的语法格式
	/*return[表达式]; 表达式是可选参数，表示要返回的值，它的数据类型必须与方法声明中的返回值类型一致
	 * 作用：1.结束方法的执行并返回调用处；2.带回方法的返回值
	 * */
	final static double PI=3.1415926;//有无f都可，区别只在于结果位数的多少
	public static void main(String[] args) {
		double r1=8.0,r2=5.0;
		System.out.println("圆1的面积="+area(r1));
		System.out.println("圆2的面积="+area(r2));
	}
	
	public static double area(double r){
		return PI*r*r;
	}
}

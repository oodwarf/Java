package ch5;

//方法重载(overload):方法名相同，参数列表不同（类型，个数，顺序）
public class Hello {
	int a,b;
	
	int add(int a,int b){
		return a+b;
	}

	int add(int a,double b){
		return (int)(a+b);
	}
	
	int add(double b,int a){
		return (int)(a+b);
	}
	
	int add(double a,double b){
		return (int)(a+b);
	}
	
	public static void main(String[] args) {
		new Hello().add(3, 4.5);
		new Hello().add(5.5, 6);
		new Hello().add(4, 6);
	}

}

package ch5;

public class TestThis {

	int a,b,c;
	TestThis(){
		System.out.println("正要new一个Hello对象");
	}
	TestThis(int a,int b){
		this();
		a=a;//这里是指局部变量而不是成员变量
		this.a=a;
		this.b=b;
	}
	TestThis(int a,int b,int c){
		this(a,b);
		this.c=c;
	}
	void sing(){}
	void chifan(){
		this.sing();
		System.out.println("你妈妈喊你回家吃饭");
	}
	public static void main(String[] args) {
		TestThis hi=new TestThis(2,3);
		hi.chifan();
	}

}

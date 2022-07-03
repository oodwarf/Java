package ch3;

import java.util.Scanner;

public class Example11 {
//猜数游戏
	public static void main(String[] args) {
	int number=17,guess;
	Scanner sc=new Scanner(System.in);
	System.out.print("你猜测的数：");
	guess=sc.nextInt();
	while(guess!=number)//当猜测的数不等于设置的数时，进入循环
	{
		if(guess>number)
			System.out.println("大了");
		if(guess<number)
			System.out.println("小了");
		System.out.print("你猜测的数：");
		guess=sc.nextInt();
	}//当猜对了时，则不进入(跳出)循环
	System.out.println("恭喜你，猜对了！");
	}

}
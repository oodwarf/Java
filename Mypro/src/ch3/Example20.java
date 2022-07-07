package ch3;

//import java.util.Scanner;

public class Example20 {

	public static void main(String[] args) {
		int i,j;
		/*Scanner scanner=new Scanner(System.in);
		System.out.println("请输入i的数字：");
		int i=scanner.nextInt();
		System.out.println("请输入j的数字：");*/
		//int j=scanner.nextInt();
		for(i=1;i<=5;i++){//i控制行数
			for(j=1;j<=i;j++){//j控制列数
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println("当j=i时，就是说是第几行就有几颗 *");
	}

}
